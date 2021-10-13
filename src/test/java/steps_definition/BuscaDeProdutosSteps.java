package steps_definition;

import base_class.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class BuscaDeProdutosSteps extends BaseSteps {

    /**
     * Cenario: pesquisar o produto valido
     **/
    @Dado("^que eu esteja na pagina inicial da amazon$")
    public void que_eu_esteja_na_pagina_inicial_da_amazon() {
    }

    @Quando("^eu clico no campo de pesquisa$")
    public void eu_clico_no_campo_de_pesquisa() {
    }

    @E("^digito o nome de um produto$")
    public void digito_o_nome_de_um_produto() {
    }

    @E("^clico no botao de pesquisa$")
    public void clico_no_botao_de_pesquisa() {

    }

    @Entao("^o sistema mostra uma lista de resultados$")
    public void o_sistema_mostra_uma_lista_de_resultados() {
    }

    /**
     * Cenario: pesquisar um produto inexistente
     **/
    @E("^digito o nome de um produto que nao existe no catalogo$")
    public void digitoONomeDeUmProdutoQueNaoExisteNoCatalogo() {
    }

    @Entao("^o sistema mostra que nao existem resultados$")
    public void oSistemaMostraQueNaoExistemResultados() {
    }

    /**
     * Cenario: pesquisar com o campo vazio
     **/
    @E("^nao digito o nome de um produto$")
    public void naoDigitoONomeDeUmProduto() {
    }

    @Entao("^o sistema nao mostra um resulato$")
    public void oSistemaNaoMostraUmResulato() {
    }
}
