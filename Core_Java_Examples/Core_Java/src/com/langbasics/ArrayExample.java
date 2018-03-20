package com.langbasics;

public class ArrayExample {

	public static void main(String[] args) {
		// declares an array of integers
        int[] anArray;
        // allocates memory for 10 integers
        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

		System.out.println("Element at index 0: " + anArray[0]);
		System.out.println("Element at index 1: " + anArray[1]);
		System.out.println("Element at index 2: " + anArray[2]);
		System.out.println("Element at index 3: " + anArray[3]);
		System.out.println("Element at index 4: " + anArray[4]);
		System.out.println("Element at index 5: " + anArray[5]);
		System.out.println("Element at index 6: " + anArray[6]);
		System.out.println("Element at index 7: " + anArray[7]);
		System.out.println("Element at index 8: " + anArray[8]);
		System.out.println("Element at index 9: " + anArray[9]);
		
		
//		Alternatively, you can use the shortcut syntax to create and initialize an array:

			int[] anArray_v1 = { 
			    100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};
			
			System.out.println(anArray_v1[4]);
			
			String[][] names = {
		            {"Mr. ", "Mrs. ", "Ms. "},
		            {"Smith", "Jones"}
		        };
	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);
	        System.out.println(names.length);
    
	        //Copying Arrays
//	        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
//				    'i', 'n', 'a', 't', 'e', 'd' };
	        char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				    'h', 'i', 'j', 'k', 'l', 'm' };

	        char[] copyTo = new char[7];

	        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
	        System.out.println(new String(copyTo));

	       //Array Manipulations
	        char[] copyFrom_v1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
				    'h', 'i', 'j', 'k', 'l', 'm' };
            char[] copyTo_v1 = java.util.Arrays.copyOfRange(copyFrom_v1, 2, 7);
            System.out.println(new String(copyTo_v1));

            
	}

}
