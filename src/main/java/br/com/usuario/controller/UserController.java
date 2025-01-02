package br.com.usuario.controller;

import br.com.usuario.domain.DTO.CreateUserDTO;
import br.com.usuario.domain.DTO.LoginUserDTO;
import br.com.usuario.domain.DTO.TokenUserDTO;
import br.com.usuario.domain.User;
import br.com.usuario.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody CreateUserDTO createUserDTO){
        User user = userService.create(createUserDTO);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<TokenUserDTO> loginUser(@RequestBody LoginUserDTO loginUserDTO){
        TokenUserDTO tokenUserDTO = userService.login(loginUserDTO);
        return new ResponseEntity<>(tokenUserDTO, HttpStatus.OK);
    }
}
