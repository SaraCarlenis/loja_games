# 🎮 Loja Games

Projeto desenvolvido em **Spring Boot** com **Java**, simulando uma loja de games online.  
O sistema permite cadastrar **categorias** e **produtos**, mostrando o relacionamento entre eles.

---

## 📌 Funcionalidades

- Cadastro de **Categorias** (ex.: Aventura, RPG, Esportes, Terror).
- Cadastro de **Produtos** (ex.: jogos como Zelda, FIFA, Minecraft).
- Relacionamento **Uma Categoria → N Produtos**.
- Consultas personalizadas:
  - Buscar produtos por **nome**.
  - Buscar produtos por **preço maior que um valor** (ordem crescente).
  - Buscar produtos por **preço menor que um valor** (ordem decrescente).
- Evita loop infinito nas consultas com `@JsonManagedReference` e `@JsonBackReference`.

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Insomnia** (para testes da API)

---

## 📂 Estrutura do Projeto

- `model/` → Entidades (`Produto`, `Categoria`)
- `repository/` → Interfaces de acesso ao banco (`ProdutoRepository`, `CategoriaRepository`)
- `controller/` → Endpoints REST (`ProdutoController`, `CategoriaController`)

---

👩‍💻 Autora
Projeto desenvolvido por **Sara Hurtado** como parte dos estudos de Spring Boot e JPA
