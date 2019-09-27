package springvietdemologin.service;

import springvietdemologin.model.User;

public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}
