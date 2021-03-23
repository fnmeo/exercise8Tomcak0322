package q1.computation;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import p1.computation.Computation;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
   int mInput1, mInput2, mExpected;
   Computation com = new Computation();

   @Parameters
   public static Collection<Object[]> data() {
	   return Arrays.asList(new Object[][] { //
           { 100, 1, 20 }, // 1st input, 2nd input, expected value
           { 100, 2, 30 }, //
           { 102, 3, 40 } });
   }

   public TestComputation_Parameterized(int input1, int input2, int expected) throws Exception 
   {
	   Computation com = new Computation();
	   int result = com.getDiscount(input1, input2);
	   Assert.assertEquals(expected, result);
   }

   @Test
   public void testGetDiscount() throws Exception 
   {
	   	Computation com = new Computation();
		int input1 = 100, input2 = 2;
		int expected = 30;
		int result = com.getDiscount(input1, input2);
		Assert.assertEquals(expected, result);
   }
}
