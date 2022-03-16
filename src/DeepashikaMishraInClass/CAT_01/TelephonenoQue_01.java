package DeepashikaMishraInClass.CAT_01;
/*
Write a static method to convert a string int corresponding telephone number.
Write a main() method that test in another class named Telephoneno. The static method should use
following rules for substituting letters or symbols with digits.
if current character is an uppercase vowel then replace with 2 and for lower case vowel replace with 3
similarly, for uppercase vowel consonants replace with 4 and for lowercase consonants replace with 5. if any special symbol
is seen, then it must be replaced with its corresponding position(consider starting position is 1)

Example: String 'GoOd82#' will be converted to '4325827'
 */
import java.util.Scanner;

public class TelephonenoQue_01 {
    static void telephone(String string){
        char a;
        int b=0;
        int c;
        for (int i=0;i<string.length();i++){
            a=string.charAt(i);
            c=a;
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
                b=b*10+3;
            else if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
                b=b*10+2;
            else if(c > 97 && c <= 122)
                b=b*10+5;
            else if(c>65 && c<=90)
                b=b*10+4;
            else if (c>48 && c<57)
                b=b*10+(c-48);
            else
                b=b*10+(i+1);
        }
        System.out.println("Your Hash code ---> "+b);
    }
    public static void main(String[] args) {
        System.out.print("Enter your Hash String ---> ");
        Scanner sc=new Scanner(System.in);
        telephone(sc.next());
    }
}