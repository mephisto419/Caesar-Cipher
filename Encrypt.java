import java.util.*;
public class Encrypt {

	public static void main(String[] args) {
		String ctext = "";
        char letter;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to encrypt: ");
        String text = sc.nextLine();
        System.out.println("Enter the text shift value i.e by how many digit text should be shifter E.g- 4:");
        int shift = sc.nextInt();
        for(int i=0; i < text.length();i++) 
        {
            letter = text.charAt(i);
            if(letter >= 'a' && letter <= 'z') 
            {
             letter = (char) (letter + shift);
             if(letter > 'z') {
                letter = (char) (letter+'a'-'z'-1);
             }
             ctext = ctext + letter;
            }

            else if(letter >= 'A' && letter <= 'Z') {

             letter = (char) (letter + shift);    

             if(letter > 'Z') {

                 letter = (char) (letter+'A'-'Z'-1);
             }
             ctext = ctext + letter;
            }
            else {
             ctext = ctext + letter;   
            }
        
    }
    System.out.println("Encrypted Text: " + ctext);

	}

}
