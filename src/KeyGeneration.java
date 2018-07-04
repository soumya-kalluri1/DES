
public class KeyGeneration {
	
	private int[] key;
	private static final int[] KEYROTATION = {1,2,4,6,8,10,12,14,15,17,19,21,23,25,27,28};
	
	private static final int[]  LI = {57,49,41,33,25,17,9,1,58,50,42,34,26,18,
	                                  10,2,59,51,43,35,27,19,11,3,60,52,44,36};
	private static final int[]  RI = {63,55,47,39,31,23,15,7,62,54,46,38,30,22,
									  14,6,61,53,45,37,29,21,13,5,28,20,12,4};
	private static final int[] PC2 = {14,17,11,24,1,5,3,28,15,6,21,10,
									  23,19,12,4,26,8,16,7,27,20,13,2,
									  41,52,31,37,47,55,30,40,51,45,33,48,
									  44,49,39,56,34,53,46,42,50,36,29,32};
	
	private int[] key1;
	private int[] key2;
	private int[] key3;
	private int[] key4;
	private int[] key5;
	private int[] key6;
	private int[] key7;
	private int[] key8;
	private int[] key9;
	private int[] key10;
	private int[] key11;
	private int[] key12;
	private int[] key13;
	private int[] key14;
	private int[] key15;
	private int[] key16;
	
	public KeyGeneration (int[] inputtedkey) {
		key = new int[inputtedkey.length];
		for (int i=0; i<inputtedkey.length; i++) {
			key[i] = inputtedkey[i];
			System.out.print(key[i]);
		}
	}
	
	public KeyGeneration(String inputtedkey) {
		HexToBinary runner = new HexToBinary(inputtedkey);
		key = runner.returnBinary();
	}

	//redundant, it's in returnKey now
/*
	private int[] generateKeys() {
		int[] lefthalf = new int[LI.length];
		int[] righthalf = new int[RI.length];
		for (int i=0; i<lefthalf.length; i++) {
			lefthalf[i] = key[LI[i]];
		}
		
		for (int i=0; i<righthalf.length; i++) {
			righthalf[i] = key[LI[i]];
		}
		
		int[] mixedkey = new int[lefthalf.length + righthalf.length];
		for (int i=0; i<mixedkey.length; i++) {
			if (i<lefthalf.length) {
				mixedkey[i]=lefthalf[i];
			}
			else {
				int j=0;
				mixedkey[i] = righthalf[j];
				j++;
			}
		}
		return mixedkey;
	}
*/
	public int[] returnKey(int keyNum) {
		//split and mix
		int[] lefthalf = new int[LI.length];
		int[] righthalf = new int[RI.length];
		
		//System.out.println("\nlefthalf:");
		for (int i=0; i<lefthalf.length; i++) {
			lefthalf[i] = key[LI[i]-1];
			//System.out.print(lefthalf[i]);
		}
		//System.out.println("\nrighthalf:");
		
		for (int i=0; i<righthalf.length; i++) {
			righthalf[i] = key[RI[i]-1];
			//System.out.print(righthalf[i]);
		}
		//System.out.println("");
		
		//rotate according to which key we want back
		int rotate = KEYROTATION[keyNum-1];
		int store;
		for (int i=0; i<rotate; i++) {
			store = lefthalf[0];
			for (int j=0; j<lefthalf.length-1; j++) {
				lefthalf[j] = lefthalf[j+1];
			}
			lefthalf[lefthalf.length-1] = store;
		}
		/*System.out.println("\n\nrotated lefthalf:");
		for (int i=0; i<lefthalf.length; i++) {
			System.out.print(lefthalf[i]);
		}
		
		System.out.println("\n\nrotated righthalf:"); */
		for (int i=0; i<rotate; i++) {
			store = righthalf[0];
			for (int j=0; j<righthalf.length-1; j++) {
				righthalf[j] = righthalf[j+1];
			}
			righthalf[righthalf.length-1] = store;
		}
		/*for (int i=0; i<righthalf.length; i++) {
			System.out.print(righthalf[i]);
		}
		System.out.println("");*/
		
		//put it back together
		int[] mixedkey = new int[lefthalf.length + righthalf.length];
		int j = 0;
		for (int i=0; i<mixedkey.length; i++) {
			if (i<lefthalf.length) {
				mixedkey[i]=lefthalf[i];
			}
			else {
				mixedkey[i] = righthalf[j];
				j++;
			}
		}
		
		//PC2 (permutation)
		if (keyNum == 1) {
			key1 = new int[PC2.length];
			for (int i=0; i<key1.length; i++) {
				key1[i] = mixedkey[PC2[i]-1];
			}
			return key1;
		}
		
		if (keyNum == 2) {
			key2 = new int[PC2.length];
			for (int i=0; i<key2.length; i++) {
				key2[i] = mixedkey[PC2[i]-1];
			}
			return key2;
		}
		
		if (keyNum == 3) {
			key3 = new int[PC2.length];
			for (int i=0; i<key3.length; i++) {
				key3[i] = mixedkey[PC2[i]-1];
			}
			return key3;
		}
		
		if (keyNum == 4) {
			key4 = new int[PC2.length];
			for (int i=0; i<key4.length; i++) {
				key4[i] = mixedkey[PC2[i]-1];
			}
			return key4;
		}
		
		if (keyNum == 5) {
			key5 = new int[PC2.length];
			for (int i=0; i<key5.length; i++) {
				key5[i] = mixedkey[PC2[i]-1];
			}
			return key5;
		}
		
		if (keyNum == 6) {
			key6 = new int[PC2.length];
			for (int i=0; i<key6.length; i++) {
				key6[i] = mixedkey[PC2[i]-1];
			}
			return key6;
		}
		
		if (keyNum == 7) {
			key7 = new int[PC2.length];
			for (int i=0; i<key7.length; i++) {
				key7[i] = mixedkey[PC2[i]-1];
			}
			return key7;
		}
		
		if (keyNum == 8) {
			key8 = new int[PC2.length];
			for (int i=0; i<key8.length; i++) {
				key8[i] = mixedkey[PC2[i]-1];
			}
			return key8;
		}
		
		if (keyNum == 9) {
			key9 = new int[PC2.length];
			for (int i=0; i<key9.length; i++) {
				key9[i] = mixedkey[PC2[i]-1];
			}
			return key9;
		}
		
		if (keyNum == 10) {
			key10 = new int[PC2.length];
			for (int i=0; i<key10.length; i++) {
				key10[i] = mixedkey[PC2[i]-1];
			}
			return key10;
		}
		
		if (keyNum == 11) {
			key11 = new int[PC2.length];
			for (int i=0; i<key11.length; i++) {
				key11[i] = mixedkey[PC2[i]-1];
			}
			return key11;
		}
		
		if (keyNum == 12) {
			key12 = new int[PC2.length];
			for (int i=0; i<key12.length; i++) {
				key12[i] = mixedkey[PC2[i]-1];
			}
			return key12;
		}
		
		if (keyNum == 13) {
			key13 = new int[PC2.length];
			for (int i=0; i<key13.length; i++) {
				key13[i] = mixedkey[PC2[i]-1];
			}
			return key13;
		}
		
		if (keyNum == 14) {
			key14 = new int[PC2.length];
			for (int i=0; i<key14.length; i++) {
				key14[i] = mixedkey[PC2[i]-1];
			}
			return key14;
		}
		
		if (keyNum == 15) {
			key15 = new int[PC2.length];
			for (int i=0; i<key15.length; i++) {
				key15[i] = mixedkey[PC2[i]-1];
			}
			return key15;
		}
		
		if (keyNum == 16) {
			key16 = new int[PC2.length];
			for (int i=0; i<key16.length; i++) {
				key16[i] = mixedkey[PC2[i]-1];
			}
			return key16;
		}
		
		return null;
	}
	
}
