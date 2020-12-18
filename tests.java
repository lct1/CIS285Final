



public class Largest {
	public Largest() {}
    public int largest(int[] list){
        int index;
        int max =0;
        for (index = 0; index < list.length; index++){
            if (list[index] < max) {
                max = list[index];
            }
        }
        return max;
    }
}

import static org.junit.Assert.*;
import org.junit.Test;

public class TestLargest  {
	private Largest temp1;

A.		public void testPositive(){
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        temp1 = new Largest();
        int maxValue = temp1.largest(list);

	@Test 
	assertEquals(11, maxValue);  

	/** The result is stored in the variable so it returns true because the expected equls the actual. 
	/** add tests to check for this unit test **/	



    }



public void testNegative(){

int[] arr = new int[4];
        arr[0] = -11;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        temp1 = new Largest();
        int maxValue = temp1.largest(list);

@Test
assertEquals(-9, maxValue);  
