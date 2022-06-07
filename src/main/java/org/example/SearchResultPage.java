package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends Utils
{
    //Assert Verification that user is on Correct url
    public void assertUrlVerificationForNike (String searchProductName)
    {
        assertVerificationWithUrl("https://demo.nopcommerce.com/search?q="+searchProductName.toLowerCase(),"Your are on wrong search page");
    }



    //Assert verification for NIKE word search in the results
    public void assertVerificationForProductsContainsNikeWord (){

        ArrayList<String> beforeTitleList = new ArrayList<>();

        //declaring list of name titles with locators
        List<WebElement> elementList = driver.findElements(By.xpath("//h2[@class='product-title']"));


        for (WebElement e : elementList)
        {
            beforeTitleList.add(e.getText());
        }

        System.out.println(beforeTitleList);

        //declaring list of elements again to compare with
        ArrayList<String> afterTitleList = new ArrayList<>();

        for (String s: beforeTitleList) {
            afterTitleList.add(s);
        }

        System.out.println(afterTitleList);


        Assert.assertTrue(afterTitleList.equals(beforeTitleList),"Nike word are missing from some of the products on the page");

    }


}
