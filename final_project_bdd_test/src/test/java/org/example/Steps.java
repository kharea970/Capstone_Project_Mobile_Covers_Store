package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.ThreadLocalRandom;

public class Steps {
    WebDriver driver;
    @Given("Application will open in chrome")
    public void applicationWillOpenInChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton1\"]")).click();
        Thread.sleep(2000);


    }


    @Then("Enter registered email and password and login")
    public void enterRegisteredEmailAndPasswordAndLogin() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]")).sendKeys("ashish@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("ashish");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(6000);
    }

    @And("Add items to cart")
    public void addItemsToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton2\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/center/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section[2]/div/div[3]/button[2]")).click();
        Thread.sleep(3000);
    }

    @And("Add address")
    public void addAddress() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"firstname1\"]")).sendKeys("Ashish");
        driver.findElement(By.xpath("//*[@id=\"lastname1\"]")).sendKeys("Khare");
        driver.findElement(By.xpath("//*[@id=\"adderssa\"]")).sendKeys("Evergreen Society Mumbai");
        driver.findElement(By.xpath("//*[@id=\"country1\"]")).sendKeys("India");
        driver.findElement(By.xpath("//*[@id=\"state1\"]")).sendKeys("Maharashtra");
        driver.findElement(By.xpath("//*[@id=\"zip1\"]")).sendKeys("400077");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/form/button")).click();
        Thread.sleep(5000);
    }

    @And("proceed to payment")
    public void proceedToPayment() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[1]/div/input")).sendKeys("ASHISH KHARE");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[2]/div/input")).sendKeys("1221 5665 8998");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[3]/div/input")).sendKeys("11/25");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[4]/div/input")).sendKeys("999");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/form/div/div[7]/button")).click();
        Thread.sleep(5000);
    }
    @And("checking cart items")
    public void checkingCartItems() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")).click();
        Thread.sleep(5000);
    }

    @Then("Enter registered email and wrong password and login")
    public void enterRegisteredEmailAndWrongPasswordAndLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]")).sendKeys("ashish@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("ashish123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[2]/div[1]/form/button")).click();
        Thread.sleep(6000);
    }

    @Then("Entered new email and new  password and create a user")
    public void enteredNewEmailAndNewPasswordAndCreateAUser() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"signup\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput2\"]")).sendKeys("xyzuser");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]")).sendKeys("xyzuser@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("xyzuser");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/div/div/div/div[2]/div[1]/form/button")).click();
    }

    @And("See Review and then add a new review")
    public void seeReviewAndThenAddANewReview() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton2\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/section/center/div/ul/li[1]/a")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[1]/div/div/button[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/button")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput2\"]")).sendKeys("Ashish");
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/textarea")).sendKeys("amazing cover");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/button")).click();

    }

    @And("to check new review is reflected")
    public void toCheckNewReviewIsReflected() {
        driver.navigate().back();
    }
}
