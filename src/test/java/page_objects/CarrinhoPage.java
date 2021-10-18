package page_objects;

import base_class.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarrinhoPage extends BasePage {
    public CarrinhoPage(WebDriver _browser) {
        super(_browser);
    }

    private By txtDoTituloDoCarrinho  = By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1");
    private By btnExcluirProduto      = By.xpath("//*[@id=\"sc-item-C8f82ef74-c825-46c8-bd6f-e98c706b22cd\"]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input");
    private By txtDeExclusaoDoProduto = By.xpath("//*[@id=\"sc-active-cart\"]/div/div/div/h1");

    public String confirmarQueEstaNoCarrinho() {
        return browser.findElement(txtDoTituloDoCarrinho).getText();
    }

    public void excluirProduto(){
        browser.findElement(btnExcluirProduto).click();
    }

    public String confirmarCarrinhoVazio() {
        return browser.findElement(txtDeExclusaoDoProduto).getText();
    }
}
