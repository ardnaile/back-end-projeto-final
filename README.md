# API para parcerias acadêmicas
Projeto final da matéria de Back-end. 

### Integrantes
- [Eliandra Cardoso](https://github.com/ardnaile)
- [Maria Eduarda Monteiro Marcos](https://github.com/Guna-ME)
- [Suyane Bonfanti dos Santos](https://github.com/suyane924)

### Rotas
GET /verTodosEstudantes retorna uma lista com todos os estudantes salvos

GET /verEstudante/{idEstudante} retorna o estudante com o id especificado

POST /salvarEstudante salva um novo estudante. Exemplo de corpo para a requisição:
```json
{
"nome": "Ramon Venson",
"contato": "48999999999" 
}
```

GET /vincular/{idEstudante}/{idProjeto} vincula um estudante a um projeto. Substitua {idEstudante} e {idProjeto} pelos respectivos ids.

DELETE /deletarEstudante/{idEstudante} deleta o estudante com o id especificado

GET /buscarEstudante/tema/{temaPreferido} busca uma lista de estudantes com base no tema preferido especificado

-----------------------------------------------------------------------------------------------------------------------------------------

GET /verTodosProjetos retorna uma lista com todos os projetos salvos

GET /verProjeto/{idProjeto} retorna o projeto com o id especificado

POST /salvarProjeto salva um novo projeto. Exemplo de corpo para a requisição:
```json
{
"tema": "Java",
"curso": "Engenharia de Software" 
}
```

DELETE /deletarProjeto/{idProjeto} deleta o projeto com o id especificado

GET /buscarProjeto/tema/{tema} busca uma lista de projetos com base no tema especificado

-----------------------------------------------------------------------------------------------------------------------------------------

GET /verTodosCursos retorna uma lista com todos os cursos salvos

GET /verCurso/{idCurso} retorna o curso com o id especificado

POST /salvarCurso salva um novo curso. Exemplo de corpo para a requisição:
```json
{
"nomeCurso": "Engenharia de Software" 
}
```

DELETE /deletarCurso/{idCurso} deleta o curso com o id especificado

-----------------------------------------------------------------------------------------------------------------------------------------

Mais informações conforme andamento do projeto.
