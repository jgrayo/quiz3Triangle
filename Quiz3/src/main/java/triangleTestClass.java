 import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class triangleTestClass{

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
	public void testAreaForFalse() {
		TriangleClass newTri = TriangleClass(3, 4, 5);
		assertFalse(newTri.getArea() == 4);
	}
	@Test
	public void testAreaForFalse2() {
		TriangleClass newTri = TriangleClass(6, 6,8 );
		assertFalse(newTri.getArea() == 20);
	}

	@Test
	public void testAreaForTrue() {
		TriangleClass newTri = TriangleClass(3, 4, 5);
		assertTrue(newTri.getArea() == 6);
	}
	@Test
	public void testAreaForTrue2() {
		TriangleClass newTri = TriangleClass(6, 6, 7);
		assertTrue(newTri.getArea() == 17);
	}
	@Test
	public void testPerimeterForFalse() {
		TriangleClass newTri = TriangleClass(3, 4, 5);
		assertFalse(newTri.getPerimeter() == 10);
	}
	@Test
	public void testPerimeterForFalse2() {
		TriangleClass newTri = TriangleClass(4, 4, 7);
		assertFalse(newTri.getPerimeter() == 20);
	}
	@Test
	public void testPerimeterForTrue() {
		TriangleClass newTri = TriangleClass(3, 4, 5);
		assertTrue(newTri.getPerimeter() == 12);
	}
	@Test
	public void testPerimeterForTrue2() {
		TriangleClass newTri = TriangleClass(5, 6, 7);
		assertTrue(newTri.getPerimeter() == 18);
	}

}