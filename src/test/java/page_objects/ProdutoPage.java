package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage extends BasePage {

    private By btnAdicionarNoCarrinho     = By.id("add-to-cart-button");
    private By txtDeConfirmacaoDoCarrinho = By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1");
    private By btnAbrirCarrinho             = By.id("hlb-view-cart-announce");

    public ProdutoPage(WebDriver _browser) {
        super(_browser);
    }

    public void adicionarAoCarrinho(){
        waitElementVisible(btnAdicionarNoCarrinho, 10);
        browser.findElement(btnAdicionarNoCarrinho).click();
    }

    public String confirmarProdutoNoCarrinho(){
        return browser.findElement(txtDeConfirmacaoDoCarrinho).getText();
    }

    public void abrirCarrinho(){
        browser.findElement(btnAbrirCarrinho).click();
    }
}
