package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generatedRandomNum(int boundaryNum) {
		Random rdn = new Random();
		int generatedNumber = rdn.nextInt(boundaryNum);
		return generatedNumber;
	}
	public void selectFromDropdown(WebElement element,String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
	

}
