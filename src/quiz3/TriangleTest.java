package quiz3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_getArea() {
		Triangle A  = new Triangle(1.0, 1.0, 1.0);
		assertSame(A.getArea(), Math.sqrt(2.25));
	}
	
	@Test
	public void test_getAreas() {
		Triangle A  = new Triangle(1.0, 1.0, 1.0);
		assertNotSame(A.getArea(), 12);
	}
	
	
	@Test
	public void test_getPerimeter() {
		Triangle A  = new Triangle(1.0, 1.0, 1.0);
		assertSame(A.getPerimeter(), 3);
	}

	@Test
	public void test_getPerimeters() {
		Triangle A  = new Triangle(1.0, 1.0, 1.0);
		assertNotSame(A.getPerimeter(), 24);
	}
	
}
