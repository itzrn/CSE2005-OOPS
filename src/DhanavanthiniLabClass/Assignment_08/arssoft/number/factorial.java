//package DhanavanthiniLabClass.Assignment_08.arssoft.number;
package Aryan;

public class factorial {
    public int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        else
            return n*fact(n-1);
    }
}
