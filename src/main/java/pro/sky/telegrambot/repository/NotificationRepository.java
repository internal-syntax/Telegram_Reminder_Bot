package pro.sky.telegrambot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.sky.telegrambot.entity.Notification;

import java.time.LocalDateTime;
import java.util.List;

//Репозиторий по работе с уведомлениями по напоминаниям
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    /**
     * Получить список напоминаний на текущее время
     *
     * @param localDateTime время для поиска задач
     * @return список напоминаний
     */

    List<Notification> findAllByNotificationDateTime(LocalDateTime localDateTime);
}
