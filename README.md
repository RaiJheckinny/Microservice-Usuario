# Cadastro de Usuário com Spring Security e JWT

Projeto de cadastro de usuários utilizando Spring Boot, Spring Security com autenticação via JWT e banco de dados H2.

## Tecnologias Utilizadas

- **Java**: 17
- **Spring Boot**: Framework para desenvolvimento de aplicações Java.
- **Spring Security**: Framework de segurança para autenticação e autorização.
- **JWT (JSON Web Token)**: Método de autenticação baseado em tokens.
- **Swagger**: Ferramenta para documentação da API.
- **H2 Database**: Banco de dados relacional em memória para desenvolvimento e testes.

## Endpoints

### Cadastro de Usuário
- **URL**: `/api/auth/register`
- **Método HTTP**: `POST`
- **Descrição**: Registra um novo usuário no sistema. Requer nome, email e senha.

### Login de Usuário
- **URL**: `/api/auth/login`
- **Método HTTP**: `POST`
- **Descrição**: Realiza o login e retorna um token JWT.

### Obter Dados do Usuário
- **URL**: `/api/user/me`
- **Método HTTP**: `GET`
- **Descrição**: Retorna as informações do usuário autenticado, requer token JWT no cabeçalho de autorização.
