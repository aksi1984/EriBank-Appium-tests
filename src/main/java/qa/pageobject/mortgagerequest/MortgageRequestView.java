package qa.pageobject.mortgagerequest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import qa.base.BaseView;
import qa.pageobject.loginview.AlertFrame;

import java.util.List;

public class MortgageRequestView extends BaseView {

    private final AlertFrame alertFrame;

    public MortgageRequestView(AndroidDriver driver) {

        super(driver);

        alertFrame = new AlertFrame(driver);
    }

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/makePaymentView")
    List<WebElement> parent;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/nameTextField")
    WebElement firstNameField;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/lastNameTextField")
    WebElement lastNameField;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/ageTextField")
    WebElement ageField;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/addressOneTextField")
    WebElement addressField1;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/addressTwoTextField")
    WebElement addressField2;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/countryTextField")
    WebElement countryField;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/nextButton")
    WebElement nextButton;

    @AndroidFindBy(id = "com.experitest.ExperiBank:id/cancelButton")
    WebElement cancelButton;

    public void setFirstName(String firstName) {

        firstNameField.sendKeys(firstName);
    }

    public void setLastName(String lastName) {

        lastNameField.sendKeys(lastName);
    }

    public void setAge(String age) {

        ageField.sendKeys(age);
    }

    public void setAddress1(String address) {

        addressField1.sendKeys(address);
    }

    public void setAddress2(String address) {

        addressField2.sendKeys(address);
    }

    public void setCountry(String country) {

        countryField.sendKeys(country);
    }

    public void tapNextButton() {

        nextButton.click();
    }

    public boolean isNextButtonEnabled() {

        return nextButton.isEnabled();
    }

    public void tapCancelButton() {

        cancelButton.click();
    }

    public boolean isDisplayed() {

        return !parent.isEmpty();
    }

    public AlertFrame getAlertFrame() {

        return alertFrame;
    }
}
