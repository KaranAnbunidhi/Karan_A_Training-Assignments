package objectrepository;

import org.openqa.selenium.By;

public class Locators {
	
	public static By userName=By.id("user-name");
	public static By password=By.id("password");
	public static By loginButton=By.id("login-button");
	public static By verifyLogin=By.cssSelector("[data-test='title']");
	public static By selectProduct=By.id("item_1_title_link");
	public static By verifyProduct=By.cssSelector("[data-test='inventory-item-name']");
	public static By addToCart=By.id("add-to-cart");
	public static By cartIcon=By.id("shopping_cart_container");
	public static By checkoutButton=By.id("checkout");
	public static By firstName=By.id("first-name");
	public static By lastName=By.id("last-name");
	public static By postalCode=By.id("postal-code");
	public static By confirmDetails=By.id("continue");
	public static By confirmOrder=By.id("finish");
	public static By options=By.id("react-burger-menu-btn");
	public static By logout=By.id("logout_sidebar_link");
	
}
