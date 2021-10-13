#language: pt
Funcionalidade: busca de produtos

  Cenario: pesquisar o produto valido
    Dado que eu esteja na pagina inicial da amazon
    Quando eu clico no campo de pesquisa
    E digito o nome de um produto
    E clico no botao de pesquisa
    Entao o sistema mostra uma lista de resultados

  Cenario: pesquisar um produto inexistente
    Dado que eu esteja na pagina inicial da amazon
    Quando eu clico no campo de pesquisa
    E digito o nome de um produto que nao existe no catalogo
    E clico no botao de pesquisa
    Entao o sistema mostra que nao existem resultados

  Cenario: pesquisar com o campo vazio
    Dado que eu esteja na pagina inicial da amazon
    Quando eu clico no campo de pesquisa
    E nao digito o nome de um produto
    E clico no botao de pesquisa
    Entao o sistema nao mostra um resulato
