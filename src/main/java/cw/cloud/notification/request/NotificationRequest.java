package cw.cloud.notification.request;

import lombok.Data;

@Data
public class NotificationRequest {
    private String recipient;
    private String message;
}
