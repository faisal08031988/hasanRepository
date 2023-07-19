package myproject;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPage {

	public static void main(String[] args) {
//		WebDriver driver;
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	    driver.get("https://www.amazon.com/");
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
//	    System.out.println(driver.getTitle());
//	    System.out.println(driver.getCurrentUrl());
//	    driver.close();
	    
	    
	    int num=5;
	    double num1=5.3;
	    double numTotal =num + num1;
	    String name= "md ahmad";
	    char letter='d';
	    boolean status=true;
	    System.out.println("Total="+numTotal);
	    
	    
	    ArrayList<String> a= new ArrayList<String>();
	    a.add("Ahmad");
	    a.add("Tanvir");
	    a.add("Sumon");
	    a.add("Hasan");
	    a.add("Rajib");
	    a.add("Hoque");
	   
	    
	   for (String b :a) {
		   
		   System.out.println(b);
		  
	   }
	    }
	    }
	 
	    
	


