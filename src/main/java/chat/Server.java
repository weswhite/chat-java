package chat;

public class Server {

    private final long id;
    private final String name;

    public Server(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}