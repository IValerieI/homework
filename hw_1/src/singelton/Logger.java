package singelton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger logger;
    private static Date currentDate;
    private static SimpleDateFormat dateFormat;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
            currentDate = new Date();
            dateFormat = new SimpleDateFormat("dd.MM.yy");
        }
        return logger;
    }

    public void classLogg(Object obj, String info) {
        System.out.println("Log info: " + getTodayDate() + " - " + obj.getClass().getSimpleName() + " - " + info);
    }

    private static String getTodayDate() {
        return dateFormat.format(currentDate);
    }
}
