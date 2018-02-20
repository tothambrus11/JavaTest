/**
 * 
 */
package ikerMajdnemPrimek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author T�th Ambrus
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner Console = new Scanner(System.in);  // Reading from System.in
		int max = Integer.parseInt(Console.nextLine());
		
		//ArrayList<PrimePair> primePairs = new ArrayList<PrimePair>();
		//PrimePair tmpPair;
		for(int i = 1; i < max; i++) {
			//L�trehozok egy sz�mp�rt.
			//tmpPair = new PrimePair(i, i+1);
			
			//Megn�zem, hogy mind a kett� f�lpr�m-e
			if(!isSemiPrime(i)) { //Ha az els� nem f�lpr�m
				continue; //Tov�bbl�p
			}
			else if(!isSemiPrime(i+1)) { //Ha a m�sodik nem f�lpr�m
				i++; //Ne legyen a k�vetkez� sz�mp�rnak az els� tagja egy biztosan nem f�lpr�m. 
				continue; //Tov�bbl�p
			}
			else {//Mind2 1/2 pr�m.
				//OK
				System.out.println(i+"\t"+(i+1));
			}
		}
	}
	public static boolean isSemiPrime(int number) {
		if(isPrime(number)) {
			return false;
		}
		int[] dividers = getDividers(number);
		for(int i = 0; i < dividers.length; i++) {
			//Ha az oszt� �s a h�nyados pr�m, akkor ez egy f�lpr�m.
			if(isPrime(dividers[i]) && isPrime(number/dividers[i])) {
				return true;
			}
		}
		return false;
	}
	public static int[] getDividers(int number) {
		ArrayList<Integer> dividers = new ArrayList<Integer>();
		final int max = (int) Math.sqrt(number);
		for(int testDivider = 2; testDivider <= max; testDivider++) {
			//Ha oszthat� akkor berakja
			if(number % testDivider == 0) {
				dividers.add(testDivider);
			}
		}
		
		//List to array
		int[] temp = new int[dividers.size()];
		for(int i = 0; i < dividers.size(); i++) {
			temp[i] = dividers.get(i);
		}
		return temp;
	}

	public static boolean isPrime(int number) {
		
		if(number < 2) {
			return false;
		}
		//Hogy ne kellejen a p�ros sz�mokkal osztani.
		if(number%2==0 && number != 2) {
			return false;
		}
		
		final int sqrtOfNum = (int) Math.sqrt(number); //Hogy ne kelljen minden l�p�sn�l kisz�molni a gy�k�t
		for(int testDivider = 3; testDivider <= sqrtOfNum; testDivider += 2) {
			if(number % testDivider == 0) {
				return false;
			}
		}
		return true;
	}
}
