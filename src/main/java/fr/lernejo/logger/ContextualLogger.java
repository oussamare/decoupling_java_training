package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements  Logger{
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    private Logger delegateLogger;
    private String callerClass ;

    public ContextualLogger(String callerClass, Logger delegateLogger) {
        this.callerClass=callerClass;
        this.delegateLogger=delegateLogger;

    }


    @Override
    public void log(String message) {
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " +  callerClass  + " " + message);
    }
}
