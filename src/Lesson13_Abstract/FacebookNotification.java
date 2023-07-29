package Lesson13_Abstract;

public class FacebookNotification extends NotificationSender{
    @Override
    public String SendNotification() {
        return "Notification sent to Facebook";
    }
}
