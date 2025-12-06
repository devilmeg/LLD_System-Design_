import java.util.*;

//Observer Interface
interface Subscriber{
    void update(String videoTitle);
}

//concrete observer
class EmailSubscriber implements Subscriber{
    private String email;

    public EmailSubscriber(String email){
        this.email=email;
    }
    @Override
    public void update(String videoTitle){
        System.out.println("Email sent to "+email+": New Video Uploaded - "+videoTitle);
    }
}

class MobileAppSubscriber implements Subscriber{
    private String username;
    public MobileAppSubscriber(String username){
        this.username=username;
    }
    @Override
    public void update(String videoTitle){
        System.out.println("In-app notification for "+username+":New Video - "+videoTitle);
    }
}

interface Channel{
    void subscriber(Subscriber subscriber);
    void unsubscriber(Subscriber subscriber);
    void noitfySubscribers(String videoTitle);
}
//concrete subject
class YouTubeChannel implements Channel{
    private List<Subscriber> subscribers=new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName){
        this.channelName=channelName;
    }
    @Override
    public void subscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    } 
    @Override
    public void noitfySubscribers(String VideoTitle){
        for(Subscriber subscriber:subscribers){
            subscriber.update(VideoTitle);
        }
    }
    public void uploadVideo(String videoTitle){
        System.out.println(channelName+" uploaded: "+videoTitle);
        noitfySubscribers(videoTitle);
    }
}


public class Observer {
    
}