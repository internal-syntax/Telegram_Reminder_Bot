package pro.sky.telegrambot.service;


//Сервис обработки команд
public interface CommandHandlerService {

    /**
     * Обработка команды
     *
     * @param chatId идентификатор чата
     * @param command текст команды
     * @return ответ на команду
     */

    String handleCommand(Long chatId, String command);
}
