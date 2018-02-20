/**
 * 
 */
package ikerMajdnemPrimek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tóth Ambrus
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner Console = new Scanner(System.in);  // Reading from System.in
		int max = Integer.parseInt(Console.nextLine());
		
		//ArrayList<PrimePair> primePairs = new ArrayList<PrimePair>();
		//PrimePair tmpPair;
		for(int i = 1; i < max; i++) {
			//Létrehozok egy számpárt.
			//tmpPair = new PrimePair(i, i+1);
			
			//Megnézem, hogy mind a kettõ félprím-e
			if(!isSemiPrime(i)) { //Ha az elsõ nem félprím
				continue; //Továbblép
			}
			else if(!isSemiPrime(i+1)) { //Ha a második nem félprím
				i++; //Ne legyen a következõ számpárnak az elsõ tagja egy biztosan nem félprím. 
				continue; //Továbblép
			}
			else {//Mind2 1/2 prím.
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
			//Ha az osztó és a hányados prím, akkor ez egy félprím.
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
			//Ha osztható akkor berakja
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
		//Hogy ne kellejen a páros számokkal osztani.
		if(number%2==0 && number != 2) {
			return false;
		}
		
		final int sqrtOfNum = (int) Math.sqrt(number); //Hogy ne kelljen minden lépésnél kiszámolni a gyökét
		for(int testDivider = 3; testDivider <= sqrtOfNum; testDivider += 2) {
			if(number % testDivider == 0) {
				return false;
			}
		}
		return true;
	}
}
