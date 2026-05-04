# 🚗 API de Gerenciamento de Carros e Marcas

Esta é uma API RESTful desenvolvida com **Spring Boot** para gerenciar o cadastro de veículos e suas respectivas fabricantes. A aplicação utiliza **JPA/Hibernate** para persistência de dados em um banco **MySQL**.

---

## 🛠️ Tecnologias e Dependências

* **Java 17+**
* **Spring Boot 3**
* **Spring Data JPA**: Para abstração da camada de dados.
* **MySQL Driver**: Conector para o banco de dados.
* **Lombok**: Para geração automática de getters, setters e outros métodos boilerplate.
* **SpringDoc OpenApi**: Para documentação via Swagger.

---

## ⚙️ Configuração do Ambiente

A aplicação está configurada para rodar na porta **8080**.

### Banco de Dados
Certifique-se de ter um servidor MySQL rodando com as seguintes credenciais:
* **URL**: `jdbc:mysql://localhost:3306/api?createDatabaseIfNotExist=true`
* **Usuário**: `root`
* **Senha**: `root_pwd`
* **Dialeto**: `MySQLDialect`

---

## 🛣️ Endpoints da API

### 🏎️ Carros (`/carros`)
Entidade que armazena informações técnicas e comerciais dos veículos.

* **GET `/carros`**: Retorna a lista de todos os carros.
* **GET `/carros/{id}`**: Busca um carro específico pelo ID.
* **POST `/carros`**: Registra um novo veículo.
* **PUT `/carros/{id}`**: Atualiza os dados de um veículo (Nome, Preço, Tipo de Motor, Portas).
* **DELETE `/carros/{id}`**: Remove um veículo do sistema.

### 🏭 Marcas (`/marcas`)
Gerenciamento das fabricantes e controle de estoque de peças.

* **GET `/marcas`**: Retorna todas as marcas cadastradas.
* **GET `/marcas/{id}`**: Busca uma marca específica pelo ID.
* **POST `/marcas`**: Cadastra uma nova marca.
* **PUT `/marcas/{id}`**: Atualiza dados (Nome, Data de Criação, Qtd de Carros, Peças em Estoque).
* **DELETE `/marcas/{id}`**: Remove uma marca do sistema.

---

## 📖 Documentação (Swagger UI)

A documentação interativa da API (Swagger) está configurada para ser acessada diretamente na raiz do servidor:

> **URL:** [http://localhost:8080/](http://localhost:8080/)

---

## 🧪 Como Executar
1. Configure seu MySQL de acordo com o arquivo `application.properties`.
2. Compile o projeto com Maven: `./mvnw clean install`.
3. Execute a classe `Application.java`.

# Para utilizar o docker, utilize este comando:

```sql
docker run -d \
    --name mysql \
    --rm \
    -e MYSQL_ROOT_PASSWORD=root_pwd \
    -e MYSQL_USER=new_user \
    -e MYSQL_PASSWORD=my_pwd \
    -p 3306:3306 \
    mysql
```