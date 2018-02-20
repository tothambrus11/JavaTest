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
			//L�trehozok egy sz�mp�rt.
			tmpPair = new PrimePair(i, i+1);
			
			//Ha az els� sz�m pr�m, akkor l�pjen tov�bb a k�vetkez�re:
			if(isPrime(tmpPair.num1)) {
				continue;
			}
			//Ha a m�sodik sz�m pr�m, akkor l�pjen tov�bb kett�t (a k�vetkez�nek az els�je se legyen pr�m)
			if(isPrime(tmpPair.num2)) {
				i++;
				continue;
			}
			
			
			//Megn�zem az oszt�it a k�t sz�mnak.
			
		}
	}
	
	public static int[] getDividers(int number) {
		ArrayList<int> dividers = new ArrayList<int>();
		final int sqrtOfNum = (int) Math.sqrt(number);
		for(int testDivider = 2; testDivider < sqrtOfNum; testDivider++) {
			//Ha oszthat� akkor berakja
			if((number / testDivider) % 1 == 0) {
				dividers.add(testDivider);
			}
		}
	}

	public static boolean isPrime(int number) {
		//Hogy ne kellejen a p�ros sz�mokkal osztani.
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
