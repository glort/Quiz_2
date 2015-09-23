package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Test {

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

	@org.junit.Test
	public void testCalcMonthlyPayment() {
		assert(TuitionPayment.CalcMonthlyPayment(0.0525, 50000.0, 30) == 276.10); 
		
	}
	
	@org.junit.Test
	public void testCalcTotal(){
		assert(TuitionPayment.CalcTotal(1,10) == 150);
	}

}
