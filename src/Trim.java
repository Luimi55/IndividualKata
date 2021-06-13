
public class Trim {

	public static void main(String[] args) {
		
		
	}
	
	public static String makeTrim(String str) {
		String trimString = "";
		String tempString = "";
		boolean backWord = false;
		
		for(int i = 0; i< str.length(); i++) {
			int ascii = str.charAt(i);
			
			if(ascii != 32 && ascii != 9 && ascii != 10) {
				if(backWord) {
					trimString += tempString;
					tempString = "";
					backWord = false;
				}
			trimString += str.charAt(i);
			tempString = "";
			backWord = true;
			
			}
			else {
				tempString += str.charAt(i);
				
			}
		}
		
		return trimString;
	}
	
	
}
