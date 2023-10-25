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

    @Value("${telegram.bot.msg.start}")
    private String startMsg;

    @Value("${telegram.bot.msg.error}")
    private String errorMsg;

    @Value("${telegram.bot.msg.success}")
    private String successMsg;

    @Bean
    public TelegramBot telegramBot() {
        return new TelegramBot(token);
    }

}
