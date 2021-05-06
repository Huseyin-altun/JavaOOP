package HepsiOrada.dataAcess;


import java.util.List;

import HepsiOrada.entities.User;

public interface UserDao {
void add(User user);
void delete(User user);
void update(User user);
List<User> getAll(User user);
}
