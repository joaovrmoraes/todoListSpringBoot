package br.com.joaovrmoraes.todolist.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/") // localhost:8080/user
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.username);
        System.out.println(userModel.name);
        System.out.println(userModel.password);
    }
}
