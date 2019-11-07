package alex.training.toSelenium;

import org.openqa.selenium.By;
/*
 * Selectors of the Amazon's Header Bar. Ordered from left to right.
 */

public class headerBarMenu {
	
	private static final By menuHamburgerButton = By.xpath("//a[@id='nav-hamburger-menu']");
		
	private static final By logoAmazonButton = By.xpath("//a[@class='nav-logo-link']");
	private static final By searchDropdown = By.xpath("//select[@id='searchDropdownBox']");
	private static final By searchTextBox = By.xpath("//input[@id='twotabsearchtextbox']");
	private static final By searchButton = By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	private static final By accountList = By.xpath("//a[@id='nav-link-accountList']");
	private static final By ordersButton = By.xpath("//a[@id='nav-orders']");
	private static final By amazonPrimeButton = By.xpath("//a[@id='nav-link-prime']");
	private static final By shoppingCartButton = By.xpath("//a[@id='nav-cart']");
	
}
