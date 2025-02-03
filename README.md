# To-Do List API

Uma API RESTful para gerenciamento de listas de tarefas (to-do lists), construída com Spring Boot e documentada com Swagger.

## Descrição

Este projeto consiste em uma API RESTful que permite criar, listar, atualizar e excluir tarefas. A API foi desenvolvida utilizando Spring Boot, o que garante alta performance e escalabilidade. A documentação interativa da API é gerada automaticamente pelo Swagger, facilitando o consumo por outros sistemas.

## Funcionalidades

* Criação de tarefas (POST /api/tarefas)
* Listagem de tarefas (GET /api/tarefas)
* Atualização de tarefas (PUT /api/tarefas/{id})
* Exclusão de tarefas (DELETE /api/tarefas/{id})

## Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* H2 Database (para desenvolvimento)
* Springdoc OpenAPI (Swagger)
* Maven

## Arquitetura

O projeto segue uma arquitetura MVC (Model-View-Controller), com as seguintes camadas:

* Controller: Responsável por receber as requisições HTTP e interagir com a camada de serviço.
* Service: Contém a lógica de negócios da aplicação, orquestrando as operações e acessando a camada de repositório.
* Repository: Interface que define as operações de acesso ao banco de dados, utilizando o Spring Data JPA.
* Model: Classes que representam as entidades do domínio (Tarefa).

## Como executar

1. Clone o repositório: `git clone https://github.com/Hrdudx/to-do-list.git`
2. Acesse a pasta do projeto: `cd to-do-list`
3. Execute o comando Maven: `mvn spring-boot:run`
4. A API estará disponível em: `http://localhost:8080`
5. Acesse a documentação Swagger em: `http://localhost:8080/swagger-ui.html`

## Como contribuir

1. Fork o repositório
2. Crie uma branch com sua feature: `git checkout -b minha-feature`
3. Faça as alterações
4. Commit suas alterações: `git commit -m "Minha feature"`
5. Envie suas alterações para o repositório: `git push origin minha-feature`
6. Crie um Pull Request

## Licença

MIT
