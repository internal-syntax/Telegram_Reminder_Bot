package pro.sky.telegrambot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.entity.Notification;
import pro.sky.telegrambot.repository.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NotificationTaskServiceImpl implements NotificationTaskService {

    private final NotificationRepository notificationRepository;

    @Override
    public void save(Notification task) {
        notificationRepository.save(task);
    }

    @Override
    public void delete(Notification task) {
        notificationRepository.delete(task);
    }

    @Override
    public List<Notification> findAllByNotificationDateTime(LocalDateTime localDateTime) {
        return notificationRepository.findAllByNotificationDateTime(localDateTime);
    }
}
