package thetrainingarc;

import java.util.ArrayList;
import java.util.Arrays;

public class PeerTest {

	public static void main(String[] args) {
		
		//Task 1 tests
		/*
		testNonFactorial();
		test11();
		test7();
		test10();
		test4();
		test18();
		*/
		
		//Task 2 tests
		/* 
		testFirst();
		testSeventyThird();
		testHundredth();
		testBeyond();
		testFiftySecond();
		*/
		
		// Task 3 tests
		/*
		testExample();
		testLight();
		testHeavy();
		testCold();
		testHot();
		testZeroes();
		testExtremeWeight();
		testExtremeHeat();
		testExtreme();
		*/
		
		//Task 4 tests
		/*
		testQA1();
		testQA2();
		testQA3();
		testQA4();
		testQA5();
		*/
	}
	
	//Task 1 test methods - no issues
	static void testNonFactorial() {
		reverseFactorial(21);
	}		
	static void test11() {
		reverseFactorial(39916800);
	}	
	static void test7() {
		reverseFactorial(5040);
	}
	static void test10() {
		reverseFactorial(3628800);
	}
	static void test4() {
		reverseFactorial(24);
	}
	//the QA page says this factorial of 12 should = 18 lmao
	static void test18() {
		reverseFactorial(479001600);
	}
	
	//Task 2 test methods - 11th, 12th, 13th have wrong suffix, formatting issues
	static void testFirst() {
		doggo(1);
	}
	static void testSeventyThird() {
		doggo(73);
	}
	static void testHundredth() {
		doggo(100);
	}	
	static void testBeyond() {
		doggo(142);
	}
	static void testFiftySecond() {
		doggo(52);
	}
	
	//Task 3 test methods - no message for when 0 chairs are valid
	static void testExample() {
		Goldilocks(100, 80);
	}
	static void testLight() {
		Goldilocks(50, 80);
	}
	static void testHeavy() {
		Goldilocks(150, 80);
	}
	static void testCold() {
		Goldilocks(100, 40);
	}
	static void testHot() {
		Goldilocks(100, 120);
	}
	static void testZeroes() {
		Goldilocks(0, 0);
	}
	static void testExtremeWeight() {
		Goldilocks(400, 40);
	}
	static void testExtremeHeat() {
		Goldilocks(40, 400);
	}
	static void testExtreme() {
		Goldilocks(400, 400);
	}
	
	//Task 4 test methods -
	static void testQA1() {
		Calculator(4, 2, 8);
	}
	static void testQA2() {
		Calculator(6, 2, 12);
	}
	static void testQA3() {
		Calculator(6, 2, 3);
	}
	static void testQA4() {
		Calculator(9, 12, 108);
	}
	static void testQA5() {
		Calculator(4, 16, 64);
	}
	
	public static String reverseFactorial(int num) {
        int n = num;
        int divide_by = 2;
        while(n % divide_by == 0){
            n /= divide_by;
            divide_by++;
        }
        if(n == 1){
            System.out.println(num + " = " + (divide_by - 1) + "!");
            return String.valueOf(divide_by - 1);
        }
        else{
            System.out.println(num + " NONE");
            return "NONE";
        }
    }
	
	public static ArrayList<String> doggo(int placement) {
		ArrayList<String> str = new ArrayList<>();
		
		for(int i =1; i<=100; i++) {
			String num = String.valueOf(i);
			String dog = String.valueOf(placement);
			if(Math.abs(i) % 10 == 1) {
				str.add(num + "st"); 
			}
			else if(Math.abs(i) % 10 == 2) {
				str.add(num + "nd");
			}
			else if(Math.abs(i) % 10 == 3) {
				str.add(num + "rd");
			}
			else {
				str.add(num + "th");
			}
			str.remove(dog + "st");
			str.remove(dog + "nd");
			str.remove(dog + "rd");
			str.remove(dog + "th");
			
	}
    System.out.print(str);
    return str;
}
	
	public static int Goldilocks(int weight, int maxTemp) {
		int chairCapacity;
    	int porridgeTemp;
    	String temp = "";
    	int count = 0;
    	
    	ArrayList<Integer> chair = new ArrayList<Integer>();
    	chair.add(30);
    	chair.add(130);
    	chair.add(90);
    	chair.add(150);
    	chair.add(120);
    	chair.add(200);
    	chair.add(110);
    	ArrayList<Integer> porridge = new ArrayList<Integer>();
    	porridge.add(50);
    	porridge.add(60);
    	porridge.add(100);
    	porridge.add(110);
    	porridge.add(40);
    	porridge.add(90);
    	porridge.add(100);
    	for(int i = 0; i<chair.size(); i++) {
    		if(weight < chair.get(i) && maxTemp > porridge.get(i)) {
    			temp+= "#" + i + " ";
    			count++;
    		}
    	}
    	String output = "Seats " + temp + " have both good enough chairs to not collapse under Goldilocks,\r\n"
            + "and porridge that is cool enough for her to eat";
    System.out.println(count);
    System.out.println(output);
     return count;
	}
	
	public static String Calculator(int num1, int num2, int num3) {
        int[] ints = {num1, num2, num3};
        Arrays.sort(ints);
        String relate = "Results are " + ints[0] + "*" +ints[1] + "=" + ints[2] 
                + ", " + ints[2] + "/" + ints[0] + "=" + ints[1] + ", " 
                        + ints[2] + "/" + ints[1] + "=" + ints[0] ;
        System.out.println(Arrays.toString(ints));
        System.out.println(relate);
        return relate;
    }
	
}