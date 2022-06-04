# mudi-spring
Aplicação Java utilizando Spring e também Vue.Js

# Apresentação

Trata-se de uma aplicação usando JAVA que se utiliza de um banco de dados, controllers, Modells, Repositories e view, fazendo a comunicação também com banco de dados a partir de página carregada no lado do cliente.

A entrega das requisições e também as solicitações são validadas e o  recebimento e resposta são feitas em JSON.


## Conteúdo da aplicação

- controller
> inclui tanto os referentes a autenticação quando o CRUD da aplicação, mapeados com os verbos da requisição da API
- DTO
> Fazem as respostas das entidades, criando uma ponte entre os controllers e as entidades entregando apenas o necessário dessas
- Entity
> as entidades em classes no modelo Java
- repository
> fazem a ligação com o banco de dados usando JPA, permitem que seja possível usar as namedQueys da interface `JpaRepository`. a injeção de dependência é facilitada pelo Spring nas controllers.

- As views encontram-se na pasta resources


## Status
<img src="https://img.shields.io/badge/%E2%9C%93-primeira%20etapa-green">
