/**
 * 
 */
package ikerMajdnemPrimek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ambru
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Console = new Scanner(System.in);  // Reading from System.in
		int max = Integer.parseInt(Console.nextLine());
		
		int num1;
		int num2;
		
		ArrayList<PrimePair> primePairs = new ArrayList<PrimePair>();
		
		PrimePair tmpPair;
		for(int i = 4; i < max; i++) {
			tmpPair = new PrimePair(i, i+1);
						
		}
	}
	public static boolean isPrime(int number) {
		//Hogy ne kellejen a páros számokkal osztani.
		if(number%2==0) {
			return false;
		}
		final int sqrtOfNum = (int) Math.sqrt(number);
		for(int testDivider = 3; testDivider <= sqrtOfNum; testDivider += 2) {
			if(number % testDivider == 0) {
				return false;
			}
		}
		return true;
	}

}
