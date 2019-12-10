package org.Webta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspacesukanya\\ActionClass\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < 3; i++) {
			WebElement tRow =tRows.get(i);
		List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
		for (int j = 0; j < 1; j++) {
			WebElement tdata = tDatas.get(j);
			String text = tdata.getText();
			System.out.println("text");
			
			
		}
		}
	}
}