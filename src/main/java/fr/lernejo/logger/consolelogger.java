package fr.lernejo.logger;

public class consolelogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("message");
    }
}
