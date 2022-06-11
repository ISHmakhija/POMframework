package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class DriverManager extends Utils {


    LoadProp loadProp = new LoadProp();
    DesiredCapabilities caps = new DesiredCapabilities();

    public final String AUTOMATE_USERNAME = loadProp.getProperty("bsUsername");
    public final String AUTOMATE_ACCESS_KEY = loadProp.getProperty("bsAccessKey");
    public final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));

    // String browserName ="chrome";

    String browserName = System.getProperty("browser");


    //>>>>>>>>>>>>>>>>Open & close Browser Method<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    public void openBrowser() {
        //making decision cloud true or false
        //this will be run if cloud true (In cloud)
        if (cloud) {
            System.out.println("Test cases are running in cloud (V.M)");
            //applying conditional loop for different browser options
            if (browserName.equalsIgnoreCase("Chrome")) {

                System.out.println("Your Test cases are running in Chrome Browser");

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "101.0");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");
            }
            if(browserName.equalsIgnoreCase("firefox")) {
                System.out.println("Your Test cases are running in Firefox Browser");

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            }if (browserName.equalsIgnoreCase("edge")){
                System.out.println("Your Test cases are running in Edge Browser");

                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            }
            else {
                System.out.println("Your Browser name is Wrong");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        } else {
            //This will run locally
            System.out.println(" Test Cases Running in Local Machine / Laptop ");


            if (browserName.equalsIgnoreCase("Chrome")) {
                System.out.println("Your test cases are running in Chrome Browser");

                System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");

                //open Chrome browser:
                driver = new ChromeDriver();


            } else if (browserName.equalsIgnoreCase("Firefox")) {
                System.out.println("Your test cases are running FireFox Browser.");

                System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");

                //Open Firefox Browser
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("Edge")) {

                System.out.println("Your test cases are running in Edge Browser.");

                System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");

                //Open Edge Browser
                driver = new EdgeDriver();
            } else {
                System.out.println("You have input wrong browser option");
            }
        }

        //>>>>>>>>>>>>>>>>>>>>>>> Implicit wait method <<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //>>>>>>>>>>>>>>>>> Maximizing chrome window <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.manage().window().maximize();

        //>>>>>>>>>>>>>>>>>> Driver to type URL <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        driver.get("https://demo.nopcommerce.com/");

    }


        //>>>>>>>>>>>>>>>>>>>>>> METHOD FOR QUITING DRIVER <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        public void closeBrowser ()
        {
            driver.quit();
        }



}

