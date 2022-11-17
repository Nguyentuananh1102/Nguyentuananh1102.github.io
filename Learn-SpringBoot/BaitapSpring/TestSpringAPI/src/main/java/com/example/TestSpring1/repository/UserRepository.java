package com.example.TestSpring1.repository;

import com.example.TestSpring1.database.FakeDB;
import com.example.TestSpring1.exception.BadRequestException;
import com.example.TestSpring1.exception.NotFoundException;
import com.example.TestSpring1.model.User;
import com.example.TestSpring1.model.UserDto;
import com.example.TestSpring1.request.UpsertPasswordRequest;
import com.example.TestSpring1.request.UpsertUserRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Repository
public class UserRepository {

    public List<User> findALl(){

        return FakeDB.users;
    }

    private List<Integer> getAllID(){
        List<Integer> list = new ArrayList<>();
        for(User user : FakeDB.users){
            list.add(user.getId());
        }
        return list;
    }
    public List<UserDto> getUserByName(String name) {
        List<UserDto> result = new ArrayList<>();
        for(User user : FakeDB.users){
            if(findName(user.getName()).equals(name)){
                UserDto userDto = new UserDto(
                        user.getId(),
                        user.getName(),
                        user.getEmail(),
                        user.getPhone(),
                        user.getAddress(),
                        user.getAvatar()
                );
                result.add(userDto);
            }
        }
        return result;
    }
    private String findName(String name){
        String[] strings = name.split(" ");
        return strings[strings.length -1].trim().toLowerCase();
    }

    public Optional<User> findUserById(int id) {
        return FakeDB.users
                .stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }

    public User creatUser(UpsertUserRequest request) {
        Random rd = new Random();
        int id;
        do {
            id = rd.nextInt(200);
        }while (getAllID().contains(id));
        User user = new User(
                id,
                request.getName(),
                request.getEmail(),
                request.getPhone(),
                request.getAddress(),
                request.getAvatar(),
                request.getPassword()
        );
        FakeDB.users.add(user);
        return user;
    }


    public void updateUser(UpsertUserRequest request, int id) {
        User user = findUserById(id).orElseThrow(()->{
            throw new NotFoundException("Not found exception with " + id);
        });
        user.setName(request.getName());
        user.setAddress(request.getAddress());
        user.setPhone(request.getPhone());
    }

    public void delUser(int id) {
        FakeDB.users.removeIf(user -> user.getId() == id);
    }

    public void updateAvatar(UpsertUserRequest request, int id) {
        if(findUserById(id).isPresent()){
            for(User user1 : FakeDB.users){
                if(user1.getId()==id){
                    user1.setAvatar(request.getAvatar());
                }
            }
        }
        else throw new NotFoundException("Not found exception with " + id);

    }

    public void changePassword(UpsertPasswordRequest request, int id) {
        User user = findUserById(id).orElseThrow(()->{
            throw new NotFoundException("Not found exception with " + id);
        });
        if(!request.getOldPassword().equals(user.getPassword()))
            throw new NotFoundException("Mật khẩu cũ không chính xác");
        if (request.getOldPassword().equals(request.getNewPassword()))
            throw new BadRequestException("MK mới trùng khớp MK cũ ");
        for(User user1 : FakeDB.users){
            if(user1.getId()==id){
                user.setPassword(request.getNewPassword());
            }
        }
    }

    public String fotgotPassword(int id) {
        User user = findUserById(id).orElseThrow(()->{
            throw new NotFoundException("Not found exception with " + id);
        });
        user.setPassword(user.getPassword()+'1');
        return user.getPassword();
    }



}
