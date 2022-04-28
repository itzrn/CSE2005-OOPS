//package DhanavanthiniLabClass.Assignment_08.arssoft.number;
package Aryan;

public class Armstrong {
    public boolean armstrong(int n){
        int t=n;
        int c=0;
        while (n>0){
            n=n/10;
            c=c+1;
        }
        n=t;
        int a;
        int sum=0;
        while (n>0){
            a=n%10;
            sum=sum+(int)Math.pow(a,c);
            n=n/10;
        }
        if (sum==t)
            return true;
        else
            return false;
    }
}
