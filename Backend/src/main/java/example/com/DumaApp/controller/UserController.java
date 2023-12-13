package example.com.DumaApp.controller;

import example.com.DumaApp.model.User;
import example.com.DumaApp.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/register")
    public User register(@RequestBody User user)

    {
        System.out.println( user);
     return  userService.register(user);
    }
    @GetMapping("/login/{contact}")
    public String login(@PathVariable String contact)
    {

        return userService.login(contact);
    }
}
