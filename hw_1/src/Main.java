import singelton.Logger;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.classLogg(new ArrayList<>(), "Created an array");

    }
}