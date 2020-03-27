package com.angularcrud.service;

import com.angularcrud.db.UserRepository;
import com.angularcrud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    // GET
    public List<User> getUsers() { return userRepository.findAll(); }
    public User getUserByEmail(String email) { return userRepository.findByEmail(email); }
    public User getUserById(int id) { return userRepository.findById(id).orElse(null); }

    // DELETE
    public String deleteUserById(int id) { userRepository.deleteById(id); return "User removed !!"+id; }

    // POST
    public User saveUser(User user) { return userRepository.save(user); }

    public List<User> saveUsers(List<User> users ) { return userRepository.saveAll(users); }

    // PUT
    public User updateUser(User user) {
        User userChange = userRepository.findById(user.getId()).orElse(null);
        userChange.setExperience(user.getExperience());
        userChange.setDomain(user.getDomain());
        return userRepository.save(userChange);
    }


}
