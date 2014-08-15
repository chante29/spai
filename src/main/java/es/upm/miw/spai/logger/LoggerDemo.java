package es.upm.miw.spai.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerDemo {
    static final Logger logger = LogManager.getLogger(LoggerDemo.class.getName());

    public static void main(String[] args) {
        logger.error("Log de error");
    }

}
