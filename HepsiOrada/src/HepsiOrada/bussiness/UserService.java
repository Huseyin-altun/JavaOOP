package HepsiOrada.bussiness;

import java.util.List;
import java.util.Vector;

import HepsiOrada.entities.User;

public interface UserService {
void add(User user);
void login(Vector<User> us,User user);

}
