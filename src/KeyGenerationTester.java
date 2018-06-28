import java.util.Scanner;

public class KeyGenerationTester {

	public static void main(String[] args) {
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.println("Key in hex:");
		String inputtedkey = keyboardScanner.nextLine();
		
		final String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		final String[] binary = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
		String key = "";
		
		for (int i=0; i<inputtedkey.length(); i++) {
			for (int j=0; j<hex.length; j++) {
				if (inputtedkey.substring(i, i+1).equals(hex[j])) {
					key+= binary[j];
					break;
				}
			}
		}
		
		String[] stringkey = new String[key.length()];
		int[] intkey = new int[stringkey.length];
		for (int i=0; i<stringkey.length; i++) {
			stringkey[i] = key.substring(i, i+1);
			intkey[i] = Integer.parseInt(stringkey[i]);
		}
		
		/*int[] keyTest = {0,0,0,0, 1,1,1,0, 0,0,1,1, 0,0,1,0, 1,0,0,1, 0,0,1,0, 0,0,1,1, 0,0,1,0, 
						 1,1,1,0, 1,0,1,0, 0,1,1,0, 1,1,0,1, 0,0,0,0, 1,1,0,1, 0,1,1,1, 0,0,1,1}; */
		KeyGeneration test = new KeyGeneration(intkey);
		int[] returnedKey = test.returnKey(1);
		
		System.out.print("\nK1: ");
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		
		System.out.print("\nK2: ");
		returnedKey = test.returnKey(2);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		
		System.out.print("\nK3: ");
		returnedKey = test.returnKey(3);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK4: ");
		returnedKey = test.returnKey(4);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK5: ");
		returnedKey = test.returnKey(5);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK6: ");
		returnedKey = test.returnKey(6);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK7: ");
		returnedKey = test.returnKey(7);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK8: ");
		returnedKey = test.returnKey(8);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK9: ");
		returnedKey = test.returnKey(9);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK10: ");
		returnedKey = test.returnKey(10);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK11: ");
		returnedKey = test.returnKey(11);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK12: ");
		returnedKey = test.returnKey(12);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK13: ");
		returnedKey = test.returnKey(13);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK14: ");
		returnedKey = test.returnKey(14);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK15: ");
		returnedKey = test.returnKey(15);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		System.out.print("\nK16: ");
		returnedKey = test.returnKey(16);
		for(int i=0; i<returnedKey.length; i++) {
			System.out.print(returnedKey[i]);
		}
		
		

	}

}
