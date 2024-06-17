# API para parcerias acadêmicas
Projeto final da matéria de Back-end. 

### Integrantes
- [Eliandra Cardoso](https://github.com/ardnaile)
- [Maria Eduarda Monteiro Marcos](https://github.com/Guna-ME)
- [Suyane Bonfanti dos Santos](https://github.com/suyane924)

### Rotas
/verTodosEstudantes retorna uma lista com todos os estudantes salvos

/verEstudante/{idEstudante} retorna o estudante com o id especificado

/salvarEstudante salva um novo estudante. Exemplo de corpo para a requisição:
```json
{
"nome": "Ramon Venson",
"contato": "48999999999" 
}
```

/vincular/{idEstudante}/{idProjeto} vincula um estudante a um projeto. Substitua {idEstudante} e {idProjeto} pelos respectivos ids.

/deletarEstudante/{idEstudante} deleta o estudante com o id especificado

/buscarEstudante/tema/{temaPreferido} busca uma lista de estudantes com base no tema preferido especificado

-----------------------------------------------------------------------------------------------------------------------------------------

/verTodosProjetos retorna uma lista com todos os projetos salvos

/verProjeto/{idProjeto} retorna o projeto com o id especificado

/salvarProjeto salva um novo projeto. Exemplo de corpo para a requisição:
```json
{
"tema": "Java",
"curso": "Engenharia de Software" 
}
```

/deletarProjeto/{idProjeto} deleta o projeto com o id especificado

/buscarProjeto/tema/{tema} busca uma lista de projetos com base no tema especificado

-----------------------------------------------------------------------------------------------------------------------------------------

/verTodosCursos retorna uma lista com todos os cursos salvos

/verCurso/{idCurso} retorna o curso com o id especificado

/salvarCurso salva um novo curso. Exemplo de corpo para a requisição:
```json
{
"nomeCurso": "Engenharia de Software" 
}
```

/deletarCurso/{idCurso} deleta o curso com o id especificado

-----------------------------------------------------------------------------------------------------------------------------------------

Mais informações conforme andamento do projeto.
