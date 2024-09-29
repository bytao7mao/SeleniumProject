package com.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class Main {

    public static void print(Object s){
        System.out.println(s);
    }
    public static void main(String[] args) {

//        print("hello world");
//        print(true);
//        print(1);
        // Set the property for webdriver.chrome.driver to be the location to your local              download of chromedriver
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tao\\Downloads\\chrome-win64");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
//
//        // Create new instance of ChromeDriver
        WebDriver driver = new ChromeDriver(options);
//
//        // And now use this to visit Google
        driver.get("https://formy-project.herokuapp.com/dragdrop");

        // Find the text input element by its name
//        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for
//        element.sendKeys("Cheese!");

        // Now submit the form
//        element.submit();

//        WebElement name = driver.findElement(By.id("name"));
//        name.click();
//        name.sendKeys("Marius Nicolae");
//
//        WebElement button = driver.findElement(By.id("button"));
//        button.click();


//        autocomplete
//        WebElement autocomplete =
//                driver.findElement(By.id("autocomplete"));
//        autocomplete.sendKeys("Strada Ramnicu Valcea, nr. 23A, bloc 10");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        WebElement button = driver.findElement(By.className("dismissButton"));
//        button.click();
//
//        WebElement autocompleteResult =
//                driver.findElement(By.className("pac-item"));
//        autocompleteResult.click();




//        //scroll
//        WebElement name = driver.findElement(By.id("name"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(name);
//        name.sendKeys("Marius Nicolae");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        WebElement date = driver.findElement(By.id("date"));
//        date.sendKeys("01/01/2020");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //switch tab
//        WebElement newTab = driver.findElement(By.id("new-tab-button"));
//        newTab.click();
//        String originalHandle = driver.getWindowHandle();
//        for (String handle: driver.getWindowHandles()){
//            driver.switchTo().window(handle);
//        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.switchTo().window(originalHandle);

//        WebElement alertButton = driver.findElement(By.id("alert-button"));
//        alertButton.click();
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

//        WebElement modalButton = driver.findElement(By.id(
//                "modal-button"));
//        modalButton.click();
//        WebElement closeButton = driver.findElement(By.id(
//                "close-button"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", closeButton);


        //drag and drop
        WebElement image = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();

//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        //Close the browser
        driver.quit();
//        double[] prices = {5.63, -120.2, 0.99, 89.56, 12.81};
//        double result = calculate(prices);
//        print(result);
//        int[] arr = {2, 1, 3};
////        int[] sortedArr = sort(arr);
//        sort(arr);
//        for (int a:arr){
//            System.out.println(a);
//        }
//
//        String abc = "abc";
////        System.out.println(reverse(abc));
//        reverse2(abc);


        Main main = new Main();
        main.test();

    }
    //return highest value
    static double calculate(double[] prices) {
        double highestValue = prices[0];
        // Your code goes here.
        for (int i=0; i<prices.length; i++){
            if (highestValue<prices[i]){
                highestValue=prices[i];
            }
        }
        return highestValue;
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
//            System.out.println("in i arr " + array.length);
            for (int j = i + 1; j < array.length; j++) {
//                System.out.println("in j arr " + array.length);
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    static String reverse(String string){
        //method 1
        char[] stringAsByteArr = string.toCharArray(); //the initial string transformed into array of characters
        char[] result = new char[stringAsByteArr.length]; //the new array of characters in reverse order
        for (int i=0;i<stringAsByteArr.length;i++){
            //for each char in reverse order, put in the new char array
            result[i] = stringAsByteArr[stringAsByteArr.length-i-1];
        }
        return String.valueOf(result);
    }

    static void reverse2(String string){
        char[] try1 = string.toCharArray();
        for (int i = try1.length-1; i>=0; i--)
            System.out.print(try1[i]);
     }
    public void test() {
        Integer immutableInt = 42;
        Integer modifiedInt = immutableInt + 8;

        assertNotSame(immutableInt, modifiedInt);

        assertEquals(42, (int) immutableInt);
        assertEquals(50, (int) modifiedInt);
    }

}