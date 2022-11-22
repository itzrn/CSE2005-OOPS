import java.util.Scanner;

class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ---> ");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=n;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            for (int l=1;l<i;l++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=2;i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print("* ");
            }
            for (int l=n-1;l>=i;l--){
                System.out.print("*  ");
            }

            System.out.println();
        }
    }
}
