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
* Lombok

## Arquitetura

O projeto segue uma arquitetura MVC (Model-View-Controller), com as seguintes camadas:

* Controller: Responsável por receber as requisições HTTP e interagir com a camada de serviço.
* Service: Contém a lógica de negócios da aplicação, orquestrando as operações e acessando a camada de repositório.
* Repository: Interface que define as operações de acesso ao banco de dados, utilizando o Spring Data JPA.
* Model: Classes que representam as entidades do domínio (Tarefa).

## Estrutura do Projeto

* **src/main/java/br/com/seuprojeto/todolist/**
    * **controller/**: Contém as classes controladoras que expõem os endpoints da API REST.
        * **TarefaController.java**: Responsável por receber as requisições HTTP e interagir com a camada de serviço para realizar as operações CRUD de tarefas.
    * **model/**: Contém as classes de modelo que representam as entidades do domínio.
        * **Tarefa.java**: Classe que representa a entidade "tarefa", com atributos como id, título, descrição, concluída e data de criação.
    * **repository/**: Contém as interfaces de repositório que definem as operações de acesso ao banco de dados.
        * **TarefaRepository.java**: Interface que define as operações CRUD para a entidade "tarefa", utilizando o Spring Data JPA.
    * **service/**: Contém as classes de serviço que implementam a lógica de negócios da aplicação.
        * **TarefaService.java**: Classe que contém a lógica de negócios para as operações de tarefas, como criar, listar, atualizar e excluir.
    * **config/**: Contém as classes de configuração da aplicação.
        * **SpringFoxConfig.java**: Classe que configura o Swagger para gerar a documentação da API.
    * **TodolistApplication.java**: Classe principal da aplicação Spring Boot, responsável por iniciar a aplicação.
* **src/main/resources/**
    * **application.properties**: Arquivo de configuração da aplicação, contendo propriedades como configurações do banco de dados, servidor e Swagger.
* **pom.xml**: Arquivo de configuração do Maven, contendo as dependências do projeto e outras configurações de build.
* **README.md**: Arquivo que contém a documentação do projeto, incluindo informações sobre como executar, contribuir e a descrição dos arquivos.

## Como executar

1. Clone o repositório: `git clone https://github.com/seu-usuario/to-do-list.git`
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

Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.

Copyright (c) 2025 Hayyra Eduarda Rocha
