package Lesson13_Abstract;

public class TelegramNotifications extends NotificationSender{

    @Override
    public String SendNotification() {
        return "Notification sent to Telegram...";
    }
}
