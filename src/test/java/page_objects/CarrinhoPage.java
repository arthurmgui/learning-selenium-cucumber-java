package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage {
    public CarrinhoPage(WebDriver _browser) {
        super(_browser);
    }

    private By txtDoTituloDoCarrinho  = By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1");
    private By btnExcluirProduto      = By.cssSelector("input[type=\"submit\"][value=\"Excluir\"][data-action=\"delete\"]");
    private By txtDeExclusaoDoProduto = By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1");

    public String confirmarQueEstaNoCarrinho() {
        waitElementVisible(txtDoTituloDoCarrinho, 20);
        return browser.findElement(txtDoTituloDoCarrinho).getText();
    }

    public void excluirProduto(){
        waitElementVisible(btnExcluirProduto, 20);
        browser.findElement(btnExcluirProduto).click();
    }

    public String confirmarCarrinhoVazio() throws InterruptedException {
        Thread.sleep(3000);
        waitElementVisible(txtDeExclusaoDoProduto, 20);
        return browser.findElement(txtDeExclusaoDoProduto).getText();
    }
}
