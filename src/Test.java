import java.util.Scanner;
class KrishnamurthyNumber {
    public static boolean isKrishnamurthy(int number){
        int sum = 0, lastDigit = 0;
        int tempNum = number;
        while(tempNum != 0) {
            lastDigit = tempNum % 10;
            sum += factorial(lastDigit);
            tempNum /= 10;
        }
        if(sum == number)
            return true;
        return false;
    }
    public static long factorial(int n) {
        long fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void krisno(int a,int b){
        for(int i=a; i<=b; i++) {
            if(isKrishnamurthy(i))
                System.out.print(i +" ");
        }
    }
    public static void main(String[] args) {
        int a = 0, b = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the minimum value of range:"); a = scan.nextInt();
        System.out.print("Enter the maximum value of range:"); b = scan.nextInt();
        System.out.println("The Krishnamurthy numbers from "+ a + " to "+ b+" are: ");
        krisno(a,b);
    }
}
