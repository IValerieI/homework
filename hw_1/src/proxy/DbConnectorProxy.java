package proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbConnectorProxy implements IDbConnector {

    private final DbConnectorImpl dbConnector;
    private final String url = "localhost:5432/";
    private final Map<String, String> cache;

    public DbConnectorProxy(DbConnectorImpl dbConnector) {
        this.dbConnector = dbConnector;
        cache = new HashMap<>();
    }

    @Override
    public String connect(String dbName) {
        if (!cache.containsKey(dbName)) {
            String fullUrl = url + dbName;
            String result = dbConnector.connect(fullUrl);
            cache.put(dbName, result);
            return result;
        } else {
            System.out.println("Connection already exists: ");
            return cache.get(dbName);
        }
    }
}
