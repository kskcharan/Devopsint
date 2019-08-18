package testproj.testproj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        WebDriver driver = new FirefoxDriver();

           driver.get("https://mail.google.com/");

    }
}
