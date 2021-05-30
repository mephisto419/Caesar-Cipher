import java.util.*;
public class Decrypt {

	public static void main(String[] args) {
		String dtext = "";
        char letter;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to decrypt: ");
        String text = sc.nextLine();
        System.out.println("Enter the text shift value i.e by how many digit text it was shifted E.g- 4:");
        int shift = sc.nextInt();
        for(int i=0; i < text.length();i++)  

        {
            letter = text.charAt(i);
            if(letter >= 'a' && letter <= 'z')
            {
                letter = (char) (letter - shift);
                if(letter < 'a') {
                    letter = (char) (letter-'a'+'z'+1);
                }
                dtext = dtext + letter; 
            }    
            else if(letter >= 'A' && letter <= 'Z')
            {
               letter = (char) (letter - shift);
                
                if (letter < 'A') {
                    letter = (char) (letter-'A'+'Z'+1);
                }
                dtext = dtext + letter;            
            }
            else 
            {
             dtext = dtext + letter;            
            } 
        }
        System.out.println("Decrypted Text: " + dtext);

	}

}
