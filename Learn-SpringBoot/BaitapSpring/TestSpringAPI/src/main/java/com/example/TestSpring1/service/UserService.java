package com.example.TestSpring1.service;

import com.example.TestSpring1.exception.NotFoundException;
import com.example.TestSpring1.model.User;
import com.example.TestSpring1.model.UserDto;
import com.example.TestSpring1.repository.UserRepository;
import com.example.TestSpring1.request.UpsertPasswordRequest;
import com.example.TestSpring1.request.UpsertUserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;


    public List<UserDto> getUserByName(String name) {

        return userRepository.getUserByName(name);
    }


    public List<User> findAll() {
        return userRepository.findALl();
    }
    public UserDto findUserById(int id) {
        if(userRepository.findUserById(id).isPresent()){
            UserDto userDto = new UserDto(
                    userRepository.findUserById(id).get().getId(),
                    userRepository.findUserById(id).get().getName(),
                    userRepository.findUserById(id).get().getEmail(),
                    userRepository.findUserById(id).get().getPhone(),
                    userRepository.findUserById(id).get().getAddress(),
                    userRepository.findUserById(id).get().getAvatar()
            );
            return userDto;
        }
        else throw new NotFoundException("Not found exception with " + id);
    }

    public UserDto creatUser(UpsertUserRequest request) {
        UserDto userDto = new UserDto(
                userRepository.creatUser(request).getId(),
                userRepository.creatUser(request).getName(),
                userRepository.creatUser(request).getEmail(),
                userRepository.creatUser(request).getPhone(),
                userRepository.creatUser(request).getAddress(),
                userRepository.creatUser(request).getAvatar()
        );
        return userDto;
    }

    public UserDto updateUser(UpsertUserRequest request,int id) {
        userRepository.updateUser(request,id);
        return findUserById(id);
    }

    public void delUser(int id) {
        userRepository.delUser(id);
    }


    public void updateAvatar(UpsertUserRequest request, int id) {
        userRepository.updateAvatar(request,id);
    }

    public void changePassword(UpsertPasswordRequest request, int id) {
        userRepository.changePassword(request,id);
    }


    public String fotgotPassword(int id) {
        return userRepository.fotgotPassword(id);
    }


}
