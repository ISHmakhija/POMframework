package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class DriverManager extends Utils {

    //>>>>>>>>>Declaring Global browser name with String<<<<<<<<<<<<<<<<<<<<<<<<<<<<
<<<<<<< main
    String browserName = "firefox";
=======
    String browserName = "edge";
>>>>>>> local


    //>>>>>>>>>>>>>>>>Open & close Browser Method<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void openBrowser()
    {
       if(browserName.equalsIgnoreCase("Chrome"))
       {
           System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");


           //open Chrome browser:
           driver = new ChromeDriver();

       }else
           if(browserName.equalsIgnoreCase("Firefox"))
           {

               System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe");

               //Open Firefox Browser
               driver = new FirefoxDriver();
           }
           else
           if(browserName.equalsIgnoreCase("Edge"))
           {
               System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver.exe");

               //Open Edge Browser
               driver = new EdgeDriver();
           }else
           {
               System.out.println("You have input wrong browser option");
           }


        //>>>>>>>>>>>>>>>>>>>>>>> Implicit wait method <<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //>>>>>>>>>>>>>>>>> Maximizing chrome window <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.manage().window().maximize();

        //>>>>>>>>>>>>>>>>>> Driver to type URL <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.get("https://demo.nopcommerce.com/");

    }


     //>>>>>>>>>>>>>>>>>>>>>> METHOD FOR QUITING DRIVER <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
   public void closeBrowser()
    {
        driver.quit();
    }



}
