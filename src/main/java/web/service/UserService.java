package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void addUser(User user);
    void deleteUser(int id);
    void updateUser(User user);
    List<User> listUsers();
    User getUserById(int id); // Добавьте этот метод
}