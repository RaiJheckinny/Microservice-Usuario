package br.com.usuario.service;

import br.com.usuario.domain.DTO.AlterUserDTO;
import br.com.usuario.domain.DTO.CreateUserDTO;
import br.com.usuario.domain.DTO.LoginUserDTO;
import br.com.usuario.domain.DTO.TokenUserDTO;
import br.com.usuario.domain.User;

import java.util.List;
import java.util.UUID;

public interface IUserService {
    public User create(CreateUserDTO createUserDTO);
    public User alter(AlterUserDTO alterUserDTO, UUID id);
    public User remove(UUID id);
    public User getById(UUID id);
    public List<User> getAll();
    public TokenUserDTO login(LoginUserDTO loginUserDTO);
}
