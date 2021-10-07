package steps_definition;

import base_class.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class GooglePesquisaSteps extends BaseSteps
{
    /**
     * Cenario: Pesquisa Valida
     * @pesquisaSuccess
     **/
    @Dado("^que eu esteja na pagina inicial do google$")
    public void que_eu_esteja_na_pagina_inicial_do_google()
    {
    }

    @Quando("^eu pesquisar por um assunto$")
    public void eu_pesquisar_por_um_assunto()
    {
    }

    @Entao("^me retorna os resultados indexados$")
    public void me_retorna_os_resultados_indexados()
    {
    }



    /**
     * Cenario: Pesquisa Valida
     * @pesquisaSuccess
     **/
    @Quando("^eu pesquisar sem preencher o assunto$")
    public void eu_pesquisar_sem_preencher_o_assunto()
    {
    }

    @Entao("^continuarei na mesma pagian aguardando um assunto$")
    public void continuarei_na_mesma_pagian_aguardando_um_assunto()
    {
    }
}
