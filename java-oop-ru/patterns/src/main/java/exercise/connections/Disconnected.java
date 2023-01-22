package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection connection;
    public Disconnected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        TcpConnection connection = this.connection;
        connection.setCurrentState(new Connected(connection));
    }

    @Override
    public void disconnect() {
        System.out.println("Error! Connection already disconnected");
    }

    @Override
    public void write(String str) {
        System.out.println("Error! Try to write to disconnected connection");
    }


    @Override
    public String toString() {
        return "disconnected";
    }
}
// END
