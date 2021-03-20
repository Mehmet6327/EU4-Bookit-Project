package java.com.bookit.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.com.bookit.utilities.Driver;

public class MySelfPage extends TopNavigationBar {
    public MySelfPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "(//*[@class='title is-6'])[3]")
    public WebElement teamName;

}