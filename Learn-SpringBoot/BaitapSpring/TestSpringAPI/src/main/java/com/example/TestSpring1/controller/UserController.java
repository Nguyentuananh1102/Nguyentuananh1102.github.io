package com.example.TestSpring1.controller;

import com.example.TestSpring1.model.User;
import com.example.TestSpring1.model.UserDto;
import com.example.TestSpring1.request.UpsertPasswordRequest;
import com.example.TestSpring1.request.UpsertUserRequest;
import com.example.TestSpring1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;
    //1. Get all
    //GET http://localhost:8080/AllUser
    @GetMapping("AllUser")
    public List<User> getAll(){
        return userService.findAll();
    }


    //2. Tìm kiếm user theo tên
    @GetMapping("gitgti")
    public List<UserDto> getUserByName(@RequestParam String name){
        return userService.getUserByName(name);
    }

    //3. Lấy chi tiết user theo id
    @GetMapping("users/{id}")
    public UserDto findUserById(@PathVariable int id){
        return userService.findUserById(id);
    }

    //4. Tạo userd
    @PostMapping("users")
    public UserDto creatUser(@RequestBody UpsertUserRequest request){
        return userService.creatUser(request);
    }

    //5. Cập nhật thông tin user
    //PUT http://localhost:8080/api/v1/users/{id}
    @PutMapping("users/{id}")
    public UserDto updateUser(@RequestBody UpsertUserRequest request,@PathVariable int id){
        return userService.updateUser(request,id);
    }


    //6. Xóa user
    //DELELTE
    @DeleteMapping("users/{id}")
    public void delUser(@PathVariable int id){
        userService.delUser(id);
    }

    //7. Thay đổi ảnh avatar
    //PUT http://localhost:8080/api/v1/users/{id}/update-avatar
    @PutMapping("users/{id}/update-avatar")
    public void updateAvatar(@RequestBody UpsertUserRequest request,@PathVariable int id){
        userService.updateAvatar(request,id);
    }


    //8. Thay đổi mật khẩu
    //PUT http://localhost:8080/api/v1/users/{id}/update-password
    @PutMapping("users/{id}/change-password")
    public void changePassword(@RequestBody UpsertPasswordRequest request, @PathVariable int id){
        userService.changePassword(request,id);
    }


    //9. Quên mật khẩu
    //POST http://localhost:8080/api/v1/users/{id}/fotgot-password
    @PostMapping("users/{id}/fotgot-password")
    public String fotgotPassword(@PathVariable int id){

        return userService.fotgotPassword(id);
    }

}
