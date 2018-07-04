
public class Encoder {

	//text = to be encoded
	private String fulltext;
	private String sixfourtext;
	private int[] inttext;
	private int[] mixedtext;
	private static final int[] IP = 
			{58,50,42,34,26,18,10,2,
			60,52,44,36,28,20,12,4,
			62,54,46,38,30,22,14,6,
			64,56,48,40,32,24,16,8,
			57,49,41,33,25,17,9,1,
			59,51,43,35,27,19,11,3,
			61,53,45,37,29,21,13,5,
			63,55,47,39,31,23,15,7};
	
	public Encoder (String inputtedtext) {
		fulltext = inputtedtext;
		sixfourtext = inputtedtext.substring(0,16);
		HexToBinary test = new HexToBinary(inputtedtext);
		inttext = test.returnBinary();
		mixedtext = new int[inttext.length];
	}
	
	public void returnAllText() {
		System.out.println("fulltext = " + fulltext);
		System.out.println("sixfourtext = " + sixfourtext);
		for (int binary:inttext) {
			System.out.print(binary);
		}
		System.out.println("");
		for (int mixed:mixedtext) {
			System.out.print(mixed);
		}
		System.out.println("\n");
	}
	
	public void mixText() {
		for (int i=0; i<mixedtext.length; i++) {
			mixedtext[i] = inttext[IP[i]-1];
		}
	}
	
	public void encode(String key) {
		KeyGeneration getkey = new KeyGeneration(key);
		int[] tempkey;
		int[] lefthalf;
		int[] righthalf;
		for (int i=1; i<=16; i++) {
			tempkey = getkey.returnKey(i);
			
			
			
			
			
		}
	}
	
	
}
