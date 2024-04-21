
# 🚀 Back-end Ecommerce API básica



Este projeto foi desenvolvido com o objetivo de aprofundar os conhecimentos em desenvolvimento de APIs utilizando Java Spring Boot, focando nas operações básicas de busca, inserção, atualização e deleção (CRUD) de entidades no backend, integradas de forma eficiente com um banco de dados relacional.

## 🧠 Aprendizados

Um dos principais aprendizados foi aprofundar meu conhecimento sobre o Spring Boot e Spring Data JPA, compreendendo melhor como esses frameworks facilitam o desenvolvimento de aplicativos Java, especialmente no contexto de APIs RESTful e persistência de dados.


## 🧑‍💻 Stack utilizada

**Back-end:** Java, Spring Boot, H2 Database, Postman


## 📃 Documentação da API

#### Retorna todos os usuários

```http
  GET /api/users
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |

#### Retorna um usuário

```http
  GET /api/user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Deleta um usuário

```http
  DELETE /api/user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer apagar |


#### Atualiza um usuário

```http
  PUT /api/user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. Os dados do usuário no body da requisição em formato de JSON|

#### Adiciona um usuário

```http
  POST /api/user/
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**.Os dados do usuário no body da requisição em formato de JSON |

---


#### Retorna todos os produtos

```http
  GET /api/products/
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. A chave da sua API |


#### Retorna um produto

```http
  GET /api/products/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do produto que você quer |


---



#### Retorna todos os pedidos

```http
  GET /api/orders/
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. A chave da sua API |


#### Retorna um pedido

```http
  GET /api/orders/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do pedido que você quer |

---


#### Retorna todas as categorias

```http
  GET /api/categories/
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. A chave da sua API |


#### Retorna uma categoria

```http
  GET /api/categories/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID da categoria que você quer |

## 📦️ Como baixar o projeto

Para copiar o projeto, utilize os comandos:

```bash
  # Clonar o repositório
  ❯ git clone https://github.com/Jefferson-Duartte/ecommerce-api.git

  # Entrar no diretório
  ❯ cd ecommerce-api

```
## 🤔️ Como contribuir
    1. Faça o `fork` deste repositório
    2. Crie uma branch com sua feature:
    - `$ git checkout -b minha_feature`
    3. Confirme sua branch:
    - `$ git commit -m "feature: Meu novo recurso"`
    4. Envie sua branch:
    - `$ git push origin minha_feature`

---



## Autores

- [@Jefferson-Duartte](https://www.github.com/Jefferson-Duartte)

