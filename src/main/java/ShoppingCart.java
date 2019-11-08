import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart {

    private WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    // header of Shopping Cart
    @FindBy(xpath = "//hi")
    private WebElement titlePage;
    @FindBy(xpath = "//span[@class='heading-counter']")
    private WebElement counterProduct;
    @FindBy(xpath = "//p[contains(@class,'alert')]")
    private WebElement alertCart;

    // row of product table
    @FindBy(xpath = "//tr[contains(@id,'product')]")
    private WebElement productRow;
    @FindBy(xpath = "//a[contains(@class,'cart_quantity_up')]")
    private WebElement buttonPlus;
    @FindBy(xpath = "//td[@class='cart_total']")
    private WebElement totalValue;
    @FindBy(xpath = "//a[@title='Delete']")
    private WebElement buttonDelete;

    // footer of product table
    @FindBy(xpath = "//td[@id='total_product']")
    private WebElement totalProductsValue;
    @FindBy(xpath = "//td[@id='total_shipping']")
    private WebElement totalShippingValue;
    @FindBy(xpath = "//td[@id='total_price']")
    private WebElement totalPriceValue;
    @FindBy(xpath = "//td[@id='total_tax']")
    private WebElement totalTaxValue;
    @FindBy(xpath = "//td[@id='total_price_container']")
    private WebElement totalContainerValue;


    public String getTitlePage() {
        return titlePage.getText();
    }
    public String getCounterProduct() {
        return counterProduct.getText();
    }
    public boolean isAlertCart() {
        return alertCart.isDisplayed();
    }

    public ShoppingCart increaseQuantity() {
        buttonPlus.click();
        return this;
    }
    public String getTotalValue() {
        return totalValue.getText();
    }

}
