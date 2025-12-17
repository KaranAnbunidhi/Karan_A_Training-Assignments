package TestNG;

import org.testng.annotations.Test;
public class Flipkart {
  @Test(groups = {"UAT Test", "Regression Test"})
 public void fLogin() {
	  System.out.println("This is  Flipkart Login Page");
 }
 @Test(groups = {"Smoke Test"})
 public void fSearchProduct() {
	  System.out.println("This is Flipkart Search Page");
 }
  @Test(groups = {"Regression Test"})
 public void fSelectProduct() {
	  System.out.println("This is Flipkart Display products page");
 }
 }

