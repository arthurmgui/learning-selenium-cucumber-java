package steps_definition;

import base_class.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import page_objects.HomePage;
import page_objects.ResultadosProdutosPage;

public class BuscaDeProdutosSteps extends BaseSteps {

    /**
     * Paginas necessaria
     **/
    HomePage pageHome = new HomePage(BaseSteps.browser);
    ResultadosProdutosPage pageResultadoPesquisaProduto = new ResultadosProdutosPage(BaseSteps.browser);

    /**
     * Cenario: pesquisar o produto valido
     **/
    @Dado("^que eu esteja na pagina inicial da amazon$")
    public void que_eu_esteja_na_pagina_inicial_da_amazon()
    {
        pageHome.abrirAmazon();
        String pageEsperada = pageHome.getUrl();
        String pageEmExecucao = browser.getCurrentUrl();
        Assert.assertTrue( pageEsperada.equals(pageEmExecucao) );
    }

    @Quando("^digito o nome de um produto$")
    public void digito_o_nome_de_um_produto()
    {
        pageHome.preencherPesquisa("carregador iphone");
    }

    @E("^clico no botao de pesquisa$")
    public void clico_no_botao_de_pesquisa()
    {
        pageHome.clickBtnPesquisar();
    }

    @Entao("^o sistema mostra uma lista de resultados$")
    public void o_sistema_mostra_uma_lista_de_resultados()
    {
        String txtDaPesquisa = pageResultadoPesquisaProduto.resultadosPesquisa();
        Assert.assertEquals("resultados para", txtDaPesquisa);
    }

    /**
     * Cenario: pesquisar um produto inexistente
     **/
    @Quando("^digito o nome de um produto que nao existe no catalogo$")
    public void digitoONomeDeUmProdutoQueNaoExisteNoCatalogo()
    {
        pageHome.preencherPesquisa("poiuytrewq");
    }

    @Entao("^o sistema mostra que nao existem resultados$")
    public void oSistemaMostraQueNaoExistemResultados()
    {
    }

    /**
     * Cenario: pesquisar com o campo vazio
     **/
    @Quando("^nao digito o nome de um produto$")
    public void naoDigitoONomeDeUmProduto()
    {
        pageHome.preencherPesquisa("");
    }

    @Entao("^o sistema nao mostra um resulato$")
    public void oSistemaNaoMostraUmResulato()
    {
    }
}
