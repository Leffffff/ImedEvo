package imedevo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import imedevo.model.User;
import imedevo.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public List<User> getAll() {
    return userRepository.findAll();
  }

  public User getById(long id) {
    return userRepository.findById(id);
  }

  public User save(User user) {
    return userRepository.save(user);
  }

  public User updateUser(User updatedUser) {
    return userRepository.updateUser(updatedUser);
  }

  public void delete(long id) {
    userRepository.delete(id);
  }
}
