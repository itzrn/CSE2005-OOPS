//package DhanavanthiniLabClass.Assignment_08.arssoft.number;
package Aryan;

public class Palindrome {
    public boolean palindrome(int n){
        int rev=0;
        int t=n;
        int a;
        while (n>0){
            a=n%10;
            rev=rev*10+a;
            n=n/10;
        }
        if (t==rev)
            return true;
        else
            return false;
    }
}
