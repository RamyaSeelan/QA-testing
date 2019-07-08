import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Test04 {
    public static void main(String args[]) throws MalformedURLException {


        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8a3fcefc");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appWaitActivity", "com.muvee.v4.screen.shiok.HomeActivity");
        dc.setCapability("app", "C:\\Users\\muvee\\Downloads\\aiBooks 0.00.10(Staging).apk");
        dc.setCapability("noReset", "true");
        dc.setCapability("setWebContentsDebuggingEnabled", "true");


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

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[1]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout/android.widget.FrameLayout");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/btnPrintLive");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[2]");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivLayout");
        el10.click();
        el10.click();
        el10.click();
        el10.click();
        el10.click();
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el11.click();

        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();

        int startx = (int)(width/2);
        int endx = (int)(width/2);
        int starty = (int)(height*0.245); //swipe vertically
        int endy = (int)(height*0.2);

        action.press(PointOption.point(startx,starty));
        action.moveTo(PointOption.point(endx,endy));
        action.release();
        action.perform();

        MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[1]");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivLayout");
        el13.click();
        el13.click();
        el13.click();
        el13.click();
        el13.click();
        el13.click();
        MobileElement el14 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[2]");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivLayout");
        el16.click();
        el16.click();
        el16.click();
        el16.click();
        el16.click();
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el17.click();

        int starta = (int)(width/2);
        int enda = (int)(width/2);
        int startb = (int)(height*0.23); //swipe vertically
        int endb = (int)(height*0.2);

        action.press(PointOption.point(starta,startb));
        action.moveTo(PointOption.point(enda,endb));
        action.release();
        action.perform();


        MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[1]");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivLayout");
        el19.click();
        el19.click();
        el19.click();
        el19.click();
        el19.click();
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[2]");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivLayout");
        el22.click();
        el22.click();
        el22.click();
        el22.click();
        el22.click();
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el23.click();





    }
}
