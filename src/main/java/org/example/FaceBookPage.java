package org.example;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils {
    public void openFBNopeCommerceChildWindow() {

        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();

        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
            }

        }
    }


    //Assert Verification for user is on FB nopecommerce page
    public void assertVerificationOfUrl ()
    {
        assertVerificationWithUrl("https://www.facebook.com/nopCommerce","URL is Not Matching");
    }



}