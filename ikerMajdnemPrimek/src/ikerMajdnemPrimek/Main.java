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
		for(int i = 1; i < max; i++) {
			//Létrehozok egy számpárt.
			tmpPair = new PrimePair(i, i+1);
			
			//Ha az elsõ szám prím, akkor lépjen tovább a következõre:
			if(isPrime(tmpPair.num1)) {
				continue;
			}
			//Ha a második szám prím, akkor lépjen tovább kettõt (a következõnek az elsõje se legyen prím)
			if(isPrime(tmpPair.num2)) {
				i++;
				continue;
			}
			
			
			//Megnézem az osztóit a két számnak.
			
		}
	}
	
	public static int[] getDividers(int number) {
		ArrayList<int> dividers = new ArrayList<int>();
		final int sqrtOfNum = (int) Math.sqrt(number);
		for(int testDivider = 2; testDivider < sqrtOfNum; testDivider++) {
			//Ha osztható akkor berakja
			if((number / testDivider) % 1 == 0) {
				dividers.add(testDivider);
			}
		}
	}

	public static boolean isPrime(int number) {
		//Hogy ne kellejen a páros számokkal osztani.
		if(number < 2) {
			return false;
		}
		if(number%2==0 && number != 2) {
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
