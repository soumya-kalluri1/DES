
public class HexToBinary {
	
	private String inputhex;
	final String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
	final String[] binary = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	String key = "";
	
	public HexToBinary(String inputtedhex) {
		inputhex = inputtedhex;
	}
	
	public int[] returnBinary() {
		
		for (int i=0; i<inputhex.length(); i++) {
			for (int j=0; j<hex.length; j++) {
				if (inputhex.substring(i, i+1).equals(hex[j])) {
					key+= binary[j];
					break;
				}
			}
		}
		
		String[] stringhex = new String[key.length()];
		int[] inthex = new int[stringhex.length];
		for (int i=0; i<stringhex.length; i++) {
			stringhex[i] = key.substring(i, i+1);
			inthex[i] = Integer.parseInt(stringhex[i]);
		}
		
		return inthex;
	}
}
