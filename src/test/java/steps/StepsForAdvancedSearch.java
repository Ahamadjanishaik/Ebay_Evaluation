package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class StepsForAdvancedSearch {
	
WebDriver driver; 	

@Given("Open Browser and enter url")
public void open_browser_and_enter_url() {
	
    driver = new ChromeDriver(); // Object of Chrome browser 
    
    driver.get("https://www.ebay.com/"); // visit ebay site 
    
    driver.manage().window().maximize();  // Maximize window
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));  // Global wait 
    
    
}

@Given("click on Advanced")
public void click_on_advanced() {
   
	driver.findElement(By.cssSelector("a[aria-label='Advanced Search']")).click();   // Click on Advanced
	
}

@Given("user enter keywords keywords_opts exclude category_dropdown")
public void user_enter_keywords_keywords_opts_exclude_category_dropdown() {
    
	driver.findElement(By.cssSelector("input[data-testid='_nkw']")).sendKeys("shoes adidas"); // Enter shoes adidas in the keywords textbox
	
	WebElement K_opts = driver.findElement(By.cssSelector("select[aria-label='Keyword options']"));

	Select s = new Select(K_opts);
	
	s.selectByIndex(2); // Selects Exact words & orders from dropdown 
	
	driver.findElement(By.cssSelector("input[data-testid='_ex_kw']")).sendKeys("adidas, S, L, M");
	
	
	Select s1 = new Select(driver.findElement(By.cssSelector("select[aria-label='In this category']")));
	
	s1.selectByVisibleText("Collectibles"); // Selects Collectibles from dropdown 
	
	


}

@Given("user selects radio buttons classifies_ads condition show results")
public void user_selects_radio_buttons_classifies_ads_condition_show_results() {
    
	driver.findElement(By.xpath("(//input[@class='radio__control'])[4]")).click();  // CLicks on classified ads radio button 
	
	driver.findElement(By.xpath("(//input[@class='radio__control'])[7]")).click();  // Click on Not specifies radio button 
	
	
		driver.findElement(By.xpath("(//span[@class='checkbox'])[5]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[6]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[7]")).click();  // Check all checkboxes
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[8]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[9]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[10]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[11]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[12]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[13]")).click();
		
		driver.findElement(By.xpath("(//span[@class='checkbox'])[14]")).click();
	
	
	
}

@Given("user selects sellers section")
public void user_selects_sellers_section() {
    
	driver.findElement(By.cssSelector("input[aria-label='Seller ID']")).sendKeys("Ambani");
	
	WebElement sort = driver.findElement(By.cssSelector("select[aria-label='Sort By']"));
	
	Select s2 = new Select(sort);
	
	s2.selectByIndex(2);    // Sort dropdown 
	
	WebElement view = driver.findElement(By.cssSelector("select[aria-label='View Results']"));
	
	Select s3 = new Select(view);
	
	s3.selectByIndex(1);    // view dropdown 
	
	WebElement result = driver.findElement(By.cssSelector("select[aria-label='Results Per Page']"));
	
	Select s4 = new Select(result);
	
	s4.selectByIndex(2);    // Result pages dropdown 
	
	driver.findElement(By.xpath("(//*[@type='submit'])[3]")).click();  // Click on search button 
	
 
}

@Then("Validate search result")
public void validate_search_result() {
	 String text = driver.findElement(By.cssSelector("h1[class='srp-controls__count-heading']")).getText();
	  
	  String actual_text = "0 results for \"shoes adidas\" -adidas, -S, -M, -L";

//      Assert.assertEquals(text, actual_text);  // Asserting the results   
		
	  driver.close();
}
	
}
