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

public class Test05 {
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

        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ImageView[1]");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/btnPrintLive");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[2]");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivAdd");
        el9.click();
        MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[10]/android.widget.TextView");
        el10.click();
        MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.CheckBox");
        el11.click();
        MobileElement el12 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_done");
        el12.click();
        MobileElement el13 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");//add 1 photo (page 1)
        el13.click();
        Dimension dim = driver.manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();

        int startx = (int)(width/2);
        int endx = (int)(width/2);
        int starty = (int)(height*0.35); //swipe vertically
        int endy = (int)(height*0.2);

        action.press(PointOption.point(startx,starty));
        action.moveTo(PointOption.point(endx,endy));
        action.release();
        action.perform();


       // action.press(PointOption.point(370, 756));
       // action.moveTo(PointOption.point(370, 700));
       // action.release();
       // action.perform();
        MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[1]");
        el14.click();
        MobileElement el15 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivAdd");
        el15.click();
        MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[9]/android.widget.TextView[2]");
        el16.click();
        MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.CheckBox");
        el17.click();
        MobileElement el18 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_done");
        el18.click();
        MobileElement el19 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el19.click();
        MobileElement el20 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.HorizontalScrollView[2]/android.widget.LinearLayout/android.view.ViewGroup/android.view.View[2]");
        el20.click();
        MobileElement el21 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivAdd");
        el21.click();
        MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView[2]/android.widget.RelativeLayout[9]/android.widget.TextView[2]");
        el22.click();
        MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[8]/android.widget.CheckBox");
        el23.click();
        MobileElement el24 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/txt_done");
        el24.click();
        MobileElement el25 = (MobileElement) driver.findElementById("ai.photobook.aibook.stage:id/ivActionbarBack");
        el25.click();











    }
}
