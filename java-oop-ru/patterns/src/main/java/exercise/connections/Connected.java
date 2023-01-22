package exercise.connections;

import exercise.TcpConnection;

// BEGIN
class Connected implements Connection {
    private TcpConnection connection;
    public Connected(TcpConnection connection) {
        this.connection = connection;
    }

    @Override
    public void connect() {
        System.out.println("Error! Try to connect when connection already established");

    }

    @Override
    public void disconnect() {
        TcpConnection connection = this.connection;
        connection.setCurrentState(new Disconnected(connection));
    }

    @Override
    public void write(String str) {
        System.out.println(str);
    }


    @Override
    public String toString() {
        return "connected";
    }
}
// END
