import adapter.Computer;
import adapter.MemoryCard;
import adapter.MemoryCardAdapter;
import factory.CoffeeFactory;
import factory.CoffeeMachine;
import factory.CoffeeType;
import factory.GrindingMachine;
import proxy.DbConnectorImpl;
import proxy.DbConnectorProxy;
import singelton.Logger;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testSingleton();
        testFactory();
        testAdapter();
        testProxy();


    }

    private static void testSingleton() {
        Logger logger = Logger.getInstance();
        logger.classLogg(new ArrayList<>(), "Created an array");
    }

    private static void testFactory() {
        GrindingMachine grindingMachine = new GrindingMachine();
        CoffeeMachine coffeeMachine = new CoffeeMachine(grindingMachine);
        coffeeMachine.start(CoffeeType.AMERICANO);
    }

    private static void testAdapter() {
        System.out.println();
        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter adapter = new MemoryCardAdapter(memoryCard);
        Computer computer = new Computer();
        computer.readFrom(adapter);
    }

    // Я не до конца поняла условие задания с Proxy,
    // поэтому выполнила основные пункты в таком формате:
    // 1. Прокси упрощает "подключение к БД",
    // так как нужно только передать название БД, можно не знать полный url
    // 2. Дальше прокси добавляет к названию БД полный адрес,
    // передает готовый адрес настоящему классу для подключения к БД
    // 3. Если к этой БД уже подключались, то прокси сохранит подключение в кэш
    // и не нужно будет подключаться еще раз
    private static void testProxy() {
        System.out.println();
        String dbName = "student_db";
        DbConnectorImpl dbConnector = new DbConnectorImpl();
        DbConnectorProxy dbProxy = new DbConnectorProxy(dbConnector);
        System.out.println(dbProxy.connect(dbName));
        System.out.println(dbProxy.connect(dbName));
    }

}