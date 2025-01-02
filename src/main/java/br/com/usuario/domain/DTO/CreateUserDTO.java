package br.com.usuario.domain.DTO;

import br.com.usuario.domain.UserRole;

public record CreateUserDTO(String name, UserRole role, String email, String passworld) {
}
