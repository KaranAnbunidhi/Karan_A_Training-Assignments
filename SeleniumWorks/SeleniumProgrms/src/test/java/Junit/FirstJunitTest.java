package Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FirstJunitTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Test Case Execution Started");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Test Case Execution Finished");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println();
	}

	@Test @Order(1)
	void loginTest() {
		System.out.println("Login Test");
		Assertions.assertEquals("Selenium", "Selenium");
	}

	@Test @Order(3)
	void searchTest() {
		System.out.println("Search Test");
		Assertions.assertTrue(true);
	}

	@Test @Order(2)
	void addToCartTest() {
		System.out.println("AddtoCart Test");
		Assertions.assertFalse(false);
	}

}
