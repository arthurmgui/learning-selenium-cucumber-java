package steps_definition;

import base_class.BaseSteps;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import page_objects.ProdutoPage;
import page_objects.ResultadosProdutosPage;

public class CarrinhoDeComprasSteps extends BaseSteps {

    ResultadosProdutosPage pageResults = new ResultadosProdutosPage(BaseSteps.browser);
    ProdutoPage pageProduto            = new ProdutoPage(BaseSteps.browser);

    @Quando("^abro o primeiro produto$")
    public void abro_o_produto_o_primeiro_produto() {
      pageResults.abrirPrimeiroProduto();
    }

    @E("^clico no botao \"([^\"]*)\"$")
    public void clico_no_botao(String arg1) {
        pageProduto.adicionarAoCarrinho();
    }

    @Entao("^o sistema diz que o porduto foi adicionado ao carrinho$")
    public void o_sistema_diz_que_o_porduto_foi_adicionado_ao_carrinho() {
        String txtDeConfirmDoCarrinho = pageProduto.confirmarProdutoNoCarrinho();
        Assert.assertEquals("Adicionado ao carrinho", txtDeConfirmDoCarrinho);
    }

}
