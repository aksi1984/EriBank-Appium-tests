package qa.pageobject.loginview;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import qa.base.BaseView;

import java.util.List;

public class AlertFrame extends BaseView {

    public AlertFrame(AndroidDriver driver) {

        super(driver);
    }

    @AndroidFindBy(id = "android:id/parentPanel")
    List<WebElement> parentPanel;

    @AndroidFindBy(id = "android:id/alertTitle")
    WebElement alertTitle;

    @AndroidFindBy(id = "android:id/message")
    WebElement message;

    @AndroidFindBy(id = "android:id/button3")
    List<WebElement> button;

    public boolean isDisplayed() {

        return !parentPanel.isEmpty();
    }

    public boolean isButtonDisplayed() {

        return !button.isEmpty();
    }

    public String getTitle() {

        return alertTitle.getText();
    }

    public String getMessage() {

        return message.getText();
    }

    public void tapButton() {

        button.get(0).click();
    }
}
