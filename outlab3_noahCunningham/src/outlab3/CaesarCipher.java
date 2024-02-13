package outlab3;

public class CaesarCipher {
	
	// make arrays for encryption and decryption with 26 values
	// because there are 26 letters in the alphabet
	protected char[] encoder = new char[26];
	protected char[] encoder2 = new char[26];
	protected char[] encoder3 = new char[26];
	protected char[] decoder = new char[26];
	protected char[] decoder2 = new char[26];
	protected char[] decoder3 = new char[26];
	//constructor that places each letter into the encryption 
	// and decryption arrays
	public CaesarCipher(int rotation, int rotation2, int rotation3 ) {
		for(int k = 0; k < 26; k++) {
//			System.out.println(encoder);
//			System.out.println(encoder2);
//			System.out.println(encoder3);
//			System.out.println(decoder);
//			System.out.println(decoder2);
//			System.out.println(decoder3);
			encoder[k] = (char)('A' + (k + rotation) % 26);
			encoder2[k] = (char)('A' + (k + rotation2) % 26);
			encoder3[k] = (char)('A' + (k + rotation3) % 26);
			decoder[k] = (char)('A' + (k - rotation + 26) % 26);
			decoder2[k] = (char)('A' + (k - rotation2 + 26) % 26);
			decoder3[k] = (char)('A' + (k - rotation3 + 26) % 26);
		}
		
		// abcdefghijklmnopqrstuvwxyz

	}
	// returns the transformed message after encription
	public String encrypt(String message) {
		return transform(message, encoder, encoder2, encoder3);
	}
	// Returns the message after decryption
	public String decrypt(String secret) {
		return transform(secret, decoder, decoder2, decoder3);
	}
	// Transform the message using the key
	public String transform(String original, char[] code, char[] code2, char[] code3) {
		char[] msg = original.toCharArray();//Convert it to a format more usable: an array of characters
		for (int k = 0; k< msg.length; k+=3) {//Set to length of the array
			if(Character.isUpperCase(msg[k])) {//Set to uppercase
				int j = msg[k] - 'A';//Set it to associate it with a value
				msg[k] = code[j];
				
			}
		}//To expand for more than 3, use a nested for loop, rathter than 3 for loops. For now, using three for loops is the easiest way
		for (int i = 1; i< msg.length; i+=3) {
			if(Character.isUpperCase(msg[i])) {
				int j = msg[i] - 'A';
				msg[i] = code2[j];
			}
		}
		for (int v = 2; v< msg.length; v+=3) {
			if(Character.isUpperCase(msg[v])) {
				int j = msg[v] - 'A';
				msg[v] = code3[j];
			}
		
		}
		return new String(msg);	//After decoding, simply return the transformed code
	}
	
	
}