package seconproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basetestnew {
	
	public static Properties p;
	public static FileInputStream fis;
	public static String projectpath ="./";
	
	
	
	public static WebDriver driver;
	
	public static void init() throws IOException{
	 p=new Properties();
	//fis = new FileInputStream( "Users/manpreetkaur/Documents/workspace/seconproject/manpreet.properties");
	fis = new FileInputStream("projectpath" +"\\Manno.properties");
	 p.load(fis);
	
	}
	
	public static void launch(String Browser){
		if (p.getProperty(Browser).equalsIgnoreCase("chrome")){
			
			driver=new ChromeDriver();
				
			
		}
				
			else if (p.getProperty(Browser).equalsIgnoreCase("firefox")){
			
				driver=new FirefoxDriver();
				
				
		
				
			}
	}
				
			public static void navigate(String url){
					
				driver.get(p.getProperty(url));
					
					
				}
				}
				
		
		
	
	
			

			
	
	 