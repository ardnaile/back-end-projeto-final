# API para parcerias acadêmicas
Projeto final da matéria de Back-end. 

### Integrantes
- [Eliandra Cardoso](https://github.com/ardnaile)
- [Maria Eduarda Monteiro Marcos](https://github.com/Guna-ME)
- [Suyane Bonfanti dos Santos](https://github.com/suyane924)

### Rotas
/verTodosEstudantes retorna uma lista com todos os estudantes salvos

/salvarEstudante salva um novo estudante. Exemplo de corpo para a requisição:
```json
{
"nome": "Ramon Venson",
"contato": "48999999999" 
}
```

/vincular/{idEstudante}/{idProjeto} vincula um estudante a um projeto. Substitua {idEstudante} e {idProjeto} pelos respectivos ids.

/verTodosProjetos retorna uma lista com todos os projetos salvos

/salvarProjeto salva um novo projeto. Exemplo de corpo para a requisição:
```json
{
"tema": "Java",
"curso": "Engenharia de Software" 
}
```


Mais informações conforme andamento do projeto.
