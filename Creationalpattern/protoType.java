import java.util.*;
//below is the problem we are facing here
// interface emailTemplate{
//     void setContent(String content);
//     void send(String to);
// }

// // class WelcomeEmail implements emailTemplate{
//     private String subject;
//     private String content;

//     public WelcomeEmail(){
//         this.subject=subject;
//         this.content=content;
//     }

//     @Override
//     public void setContent(String content){
//         this.content=content;
//     }

//     @Override
//     public void send(String to){
//         System.out.println("Sending to "+ to +": ["+subject + "]"+content);
//     }
// }

//Solution is here ,,,we need to do clone here 

import java.util.*;

interface EmailTemplate {
    void setContent(String content);
    void send(String to);
}

// A concrete email class, hardcoded
class WelcomeEmail implements EmailTemplate {
    private String subject;
    private String content;

    public WelcomeEmail() {
        this.subject = "Welcome to TUF+";
        this.content = "Hi there! Thanks for joining us.";
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + ": [" + subject + "] " + content);
    }
}

class protoType {
    public static void main(String[] args) {
        // Create a welcome email
        WelcomeEmail email1 = new WelcomeEmail();
        email1.send("user1@example.com");

        // Suppose we want a similar email with slightly different content
        WelcomeEmail email2 = new WelcomeEmail();
        email2.setContent("Hi there! Welcome to TUF Premium.");
        email2.send("user2@example.com");

        // Yet another variation
        WelcomeEmail email3 = new WelcomeEmail();
        email3.setContent("Thanks for signing up. Let's get started!");
        email3.send("user3@example.com");
    }
}

