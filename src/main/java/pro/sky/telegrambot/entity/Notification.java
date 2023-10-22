package pro.sky.telegrambot.entity;


//Напоминание

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "notification_task")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "chat_id", nullable = false)
    private long chatId;

    @Column(nullable = false)
    private String message;

    @Column(name = "notification_date_time", nullable = false)
    private LocalDateTime notificationDateTime;

    public Notification(long chatId, String message, LocalDateTime notificationDateTime) {
        this.chatId = chatId;
        this.message = message;
        this.notificationDateTime = notificationDateTime;
    }
}
