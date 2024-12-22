package cw.cloud.notification.service;

import cw.cloud.notification.request.NotificationRequest;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    public void sendNotification(NotificationRequest request) {
        // Logic to send notification
        System.out.println("Sending notification to: " + request.getRecipient() + " with message: " + request.getMessage());
    }
}
