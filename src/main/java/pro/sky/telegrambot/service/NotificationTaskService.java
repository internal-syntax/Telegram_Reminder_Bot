package pro.sky.telegrambot.service;

import pro.sky.telegrambot.entity.Notification;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskService {

    public void save(Notification task);
    public void delete(Notification task);

    public List<Notification> findAllByNotificationDateTime(LocalDateTime localDateTime);
}
