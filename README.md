# system-ticket
# Projeto de Venda de Ingressos para Eventos

Este é um projeto em desenvolvimento para a venda de ingressos para shows, festas e outros tipos de eventos. O projeto é desenvolvido em Java, utilizando o framework Spring Boot, o banco de dados PostgreSQL e o sistema de gerenciamento de dependências Maven.

## Funcionalidades

- [x] Cadastro de eventos.
- [x] Cadastro de categorias para o evento. (Ex: VIP, CAMAROTE, PISTA)
- [x] Geração de ingressos. 
- [ ] Venda de ingressos.
- [ ] Gerenciamento de estoque de ingressos.
- [ ] Histórico de vendas.

## Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas em seu sistema:

- Java SDK
- Spring Boot
- PostgreSQL
- Maven

## Configuração do Banco de Dados

1. Crie um banco de dados PostgreSQL chamado `eventos`.
2. Configure as informações de conexão com o banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/eventos
spring.datasource.username=postgress
spring.datasource.password=root
