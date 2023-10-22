package pro.sky.telegrambot.config;


import com.pengrad.telegrambot.TelegramBot;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Конфигурация бота
@Configuration
@Data
public class BotConfig {

    @Value("6618489022:AAEt7Pt70VeolCaeVee0bUSlr61qVXn-SGU")
    private String token;

    @Value("Добро пожаловать! Я ваш бот для напоминаний, для создания напоминания отправьте мне сообщение вида: дд.мм.гггг чч:мм Текст напоминания")
    private String startMsg;

    @Value("Не верный формат сообщения, попробуйте ещё раз")
    private String errorMsg;

    @Value("Напоминание успешно создано!")
    private String successMsg;

    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(token);
    }

}
