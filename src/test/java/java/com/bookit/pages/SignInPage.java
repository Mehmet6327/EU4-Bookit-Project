package java.com.bookit.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.com.bookit.utilities.Driver;

public class SignInPage {

    public SignInPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name="email")
    public WebElement email;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[.='sign in']")
    public WebElement signInButton;

}
