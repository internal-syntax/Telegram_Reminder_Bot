package pro.sky.telegrambot.exception;


/*
Не корректный формат команды создания напоминания
*/

public class IncorrectCreateTaskCommandException extends Exception {
    public IncorrectCreateTaskCommandException(String message) {
        super(message);
    }
}
