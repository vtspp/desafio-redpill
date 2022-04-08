# Desafio RedPill

### Sobre o projeto

Foram utilizados as seguintes soluções no projeto:

* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#using-boot-devtools)
* [Banco H2](http://localhost:8080/h2-console/login.do)
* [Swagger-API](http://localhost:8080/swagger-ui/index.html#/)

### Guias

Após subir a aplicação, basta entrar no [Swagger-API](http://localhost:8080/swagger-ui/index.html#/) e enviar uma requisição 'POST' com o seguinte body:

* Obs: É necessário informar um CPF ou CNPJ válido durante o teste, devido a validação aceitar apenas dados conforme as regras da Receita Federal.

{
"identifier": "000.000.000-00",
"identifierType": "cpf",
"name": "Victor Teste"
}: