package Jayesh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lappi {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Software\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");

}
}

