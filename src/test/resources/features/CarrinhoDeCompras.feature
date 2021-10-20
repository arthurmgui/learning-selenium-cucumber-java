#language: pt
Funcionalidade: carrinho de compras

  Contexto:
    Dado que eu esteja na pagina inicial da amazon
    Quando digito o nome de um produto
    E clico no botao de pesquisa
    Entao o sistema mostra uma lista de resultados

  Cenario: adicionar o produto no carrinho
    Quando abro o primeiro produto
    E clico no botao "adicionar ao carrinho"
    Entao o sistema diz que o porduto foi adicionado ao carrinho

  Cenario: remover o produto do carrinho
    Quando abro o primeiro produto
    E clico no botao "adicionar ao carrinho"
    Entao o sistema diz que o porduto foi adicionado ao carrinho
      Quando eu abro o carrinho
      E excluo o produto do carrinho
      Entao o sistema mostra que o carrinho esta vazio


