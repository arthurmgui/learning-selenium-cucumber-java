package steps_definition;

import base_class.BaseSteps;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CarrinhoDeComprasSteps extends BaseSteps {


    @Quando("^abro o primeiro produto$")
    public void abro_o_produto_o_primeiro_produto() {
    }

    @E("^clico no botao \"([^\"]*)\"$")
    public void clico_no_botao(String arg1) {
    }

    @Entao("^o sistema diz que o porduto foi adicionado ao carrinho$")
    public void o_sistema_diz_que_o_porduto_foi_adicionado_ao_carrinho() {
    }

}
