import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test03 {
    public static void main(String args[]) throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8a3fcefc");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appWaitActivity", "com.muvee.v4.screen.shiok.HomeActivity");
        dc.setCapability("app", "C:\\Users\\muvee\\Downloads\\aiBooks 0.00.10(Staging).apk");
        dc.setCapability("noReset", "true");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);


        TouchAction action = new TouchAction(driver);



        MobileElement el1 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/img_menu");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_sign_in");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/edit_email");
        el3.sendKeys("my_address@gmail.com");
        MobileElement el4 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/edit_password");
        el4.sendKeys("text123");
        MobileElement el5 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/button_login");
        el5.click();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[2]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[9]/android.widget.TextView[2]");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.CheckBox");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_done");
        el9.click();

        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

        MobileElement e20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button\n");
        e20.click();
        MobileElement e21 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/btnNext");
        e21.click();
        MobileElement e22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.TextView[2]");
        e22.click();












    }
}
