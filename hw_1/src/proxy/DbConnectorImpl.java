package proxy;

public class DbConnectorImpl implements IDbConnector {

    @Override
    public String connect(String connection) {
        return "Connected to " + connection;
    }
}
