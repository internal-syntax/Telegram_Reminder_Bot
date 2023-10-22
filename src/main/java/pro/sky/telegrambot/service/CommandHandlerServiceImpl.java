package pro.sky.telegrambot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pro.sky.telegrambot.config.BotConfig;
import pro.sky.telegrambot.entity.Notification;
import pro.sky.telegrambot.exception.IncorrectCreateTaskCommandException;
import pro.sky.telegrambot.util.MessageUtil;

@Service
@RequiredArgsConstructor
public class CommandHandlerServiceImpl implements CommandHandlerService {

    private final NotificationTaskService notificationTaskService;
    private final BotConfig config;

    private static final String START_COMMAND = "/start";

    @Override
    public String handleCommand(Long chatId, String command) {
        if (START_COMMAND.equals(command)) {
            return config.getStartMsg();
        } else {
            return handleCreateTaskCommand(chatId, command);
        }
    }

/*    @Override
    public String handleCommand(Long chatId, String command) {
        switch (command) {
            case START_COMMAND:
                return config.getStartMsg();
            default:
                return handleCreateTaskCommand(chatId, command);
        }
    }*/

    private String handleCreateTaskCommand(Long chatId, String command) {
        try {
            Notification notification = MessageUtil.parseCreateCommand(chatId, command);
            notificationTaskService.save(notification);
            return config.getSuccessMsg();
        } catch (IncorrectCreateTaskCommandException e) {
            return config.getErrorMsg();
        }
    }
}