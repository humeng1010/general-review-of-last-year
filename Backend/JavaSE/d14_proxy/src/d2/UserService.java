package d2;

public interface UserService {
    String login(String name, String password);

    boolean delete(int id);

    String select(String query);
}
