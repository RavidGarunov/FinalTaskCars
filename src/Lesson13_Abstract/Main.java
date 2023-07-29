package Lesson13_Abstract;

public class Main  {

    public static void main(String[] args) {


        System.out.println(send(new TelegramNotifications()));

//        TelegramNotifications telegramNotifications =  new TelegramNotifications();
//        FacebookNotification facebookNotification = new FacebookNotification();
//        InstagramNotification instagramNotification = new InstagramNotification();
//
//        System.out.println(telegramNotifications.SendNotification());
//        System.out.println(instagramNotification.SendNotification());
//        System.out.println(facebookNotification.SendNotification());

    }

    public  static String send ( NotificationSender notificationSender ) {

        return notificationSender.SendNotification();
    }

}

