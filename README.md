# Java Quarkus API REST

![Java](https://img.shields.io/badge/Java-17-blue) 
![Quarkus](https://img.shields.io/badge/Quarkus-Framework-red) 
![H2](https://img.shields.io/badge/DB-H2-lightgrey) 
![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen)  

## Descrição

API REST simples construída com **Java + Quarkus**, usando **H2** como banco em emória para fins de desenvolvimento e demonstração. Implementa operaçoes CRUD para gerenciamento de produtos e foi testa com Postman.


## Objetivo do projeto

Demonstrar competências práticas em:  
- Desenvolvimento dee APIs REST com Quarkus  
- Peresistência de dados (Hibernate ORM / Panache)  
- Testes manuais via Postman  
- Preparaçao containerização e CI/CD nas próximas etapas  

## Stack técnica

- Linguagem: **Java 17**  
- Framework: **Quarkus**  
- Build: **Maven** (`./mvnw`)  
- ORM: **Hibernate ORM + Panache**  
- Banco (dev): **H2 (in-memory)**  
- Testes manuais: **Postman**  

---  

## Como executar localmente

1. Clone o repositório  
```bash
git clone https://github.com/magnofnobrega/java-quarkus-api-rest.git
cd java-quarkus-api-rest
```  

2. Build e execute com quarkus  
```bash
./mvnw quarkus:dev`  
```  
<img src="/img/rodandoQuarkus.jpg" width="50%"><img src="/img/rodandoQuarkus2.jpg" width="50%">  

  
3. Acesse a API no navegador ou no Postman  
```bash
http://localhost:8080/produtos  
```

***O banco H2 é em memória. Ao reiniciar a aplicação, os dados serão perdidos.***  

---  

## Endpoints da API

# Listar produtos  

`GET /produtos`  

Retorna todos os produtos cadastrados.  

# Criar produto  

`POST /produtos`  

Exemplo de JSON:  
```json
{
    "nome": "Mouse Gamer",
    "preco": 299.00
}
```
![POST](/img/POST.jpg)  

---  

# Atualizar produto  

`PUT /produtos/{id}`  

```json
{
    "nome": "Teclado Mecânico",
    "preco": 249.00
}
```  
![POST](/img/PUT.jpg)  

---  

# Deletar produto  

`DELETE /produtos/{id}`  

![POST](/img/DELETE.jpg)  

---  

# Testes realizados (Postman)  

- GET retorna a lista de produtos  
- POST cria novo produto  
- PUT atualiza produto existente  
- DELETE remove produto  
- Persistência em memória (H2) funcionando  

---  