package com.soft1851.qjusercenter.controller;


import com.soft1851.qjusercenter.domain.dto.UserDto;
import com.soft1851.qjusercenter.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 小半吻
 */
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/{id}")
    public UserDto getUserDto(@PathVariable int id){
        return userService.getUserDto(id);
    }
}
