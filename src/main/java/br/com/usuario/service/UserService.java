package br.com.usuario.service;

import br.com.usuario.domain.DTO.AlterUserDTO;
import br.com.usuario.domain.DTO.CreateUserDTO;
import br.com.usuario.domain.DTO.LoginUserDTO;
import br.com.usuario.domain.DTO.TokenUserDTO;
import br.com.usuario.domain.User;
import br.com.usuario.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService implements IUserService {
    @Autowired
    IUserRepository repository;


    @Override
    public User create(CreateUserDTO createUserDTO) {
        User user = new User(createUserDTO);
        repository.save(user);
        return user;
    }

    @Override
    public User alter(AlterUserDTO alterUserDTO, UUID id) {
        User user = repository.findById(id).get();
        user.setName(alterUserDTO.name());
        user.setEmail(alterUserDTO.email());
        user.setPassworld(alterUserDTO.passworld());

        repository.save(user);
        return user;
    }

    @Override
    public User remove(UUID id) {
        User user = repository.findById(id).get();
        repository.delete(user);
        return user;
    }

    @Override
    public User getById(UUID id) {
        return repository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }

    @Override
    public TokenUserDTO login(LoginUserDTO loginUserDTO) {
        User user = repository.findByEmail(loginUserDTO.email()).get();
        if (user == null){
            new RuntimeException("Usuario nao registrado");
        }

        if(user.getPassworld() != loginUserDTO.passworld()){
            new RuntimeException("Senha ou Email invalido");
        }

        TokenUserDTO tokenUserDTO = new TokenUserDTO("9df8g5687d87");

        return tokenUserDTO;
    }
}
