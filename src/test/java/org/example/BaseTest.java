package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {

     //Declaration of Object to call static methods
    DriverManager driverManager = new DriverManager();

    @BeforeMethod //Opening Browser Method
      public void setUp()
      {
      driverManager.openBrowser();
      }



      @AfterMethod //Screenshots & closing browser method
      public void tearDown(ITestResult result)
      {
        if(!result.isSuccess())
        {
            takeSnapshot(result.getName());
        }
        driverManager.closeBrowser();
      }





}
