package SolidPrinciple;
    class Notification{
        public void sendNotification(){
            System.out.println("Email sent");
        }
    }
    class Text extends Notification{
        @Override
        public void sendNotification(){
            System.out.println("Text sent");
        }
    }

class LSP{
    public void main(String args[]){
        // Notification n=new Notification();
        Notification n=new Text();
        n.sendNotification();
        
    }
}