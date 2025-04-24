package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SaucedemoPageObject {
    WebDriver driver;

    public SaucedemoPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user-name")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "login-button")
    public WebElement login;

    @FindBy(className = "product_sort_container")
    public WebElement filter;

    @FindBy(xpath = "//div[text()='Sauce Labs Onesie']")
    public WebElement product;

    @FindBy(css = "#add-to-cart")
    public WebElement AddtoCart;

    @FindBy(css = ".shopping_cart_link")
    public WebElement Cart;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(id = "first-name")
    public WebElement firstName;

    @FindBy(id = "last-name")
    public WebElement lastname;

    @FindBy(id = "postal-code")
    public WebElement postalCode;

    @FindBy(id = "continue")
    public WebElement book;

    @FindBy(id = "finish")
    public WebElement finish;

    @FindBy(id = "back-to-products")
    public WebElement backToProducts;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    public WebElement confirmMessage;
}
