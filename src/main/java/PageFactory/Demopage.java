package PageFactory;

import ResourceUtils.AndroidAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demopage extends AndroidAction {
    AndroidDriver driver;
    public Demopage(AndroidDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
     @FindBy(xpath = "//android.widget.TextView[@content-desc='Preference']")
     WebElement Preference;

    @FindBy(xpath = "(//android.widget.TextView)[1]")
    WebElement Element;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='3. Preference dependencies']")
     WebElement Preferencedependencies;

    @FindBy(id = "android:id/checkbox")
     WebElement WifiCheclbox;

    @FindBy(xpath = "(//android.widget.RelativeLayout)[2]")
      WebElement Wifisettings;

    @FindBy(id ="android:id/edit")
      WebElement WifiText;

    @FindBy(id = "android:id/button1")
     WebElement Okbutton;

    public void UpdateWifisettings(String settings)
    {
        Preference.click();
        Preferencedependencies.click();
        WifiCheclbox.click();
        Wifisettings.click();
        WifiText.sendKeys(settings);
    }

    public void PressLong(){
        LongPressAction(Element);
    }


}
