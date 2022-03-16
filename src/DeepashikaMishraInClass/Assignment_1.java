package DeepashikaMishraInClass;

public class Assignment_1 {
    int fact(int n){
        int m=1;
        for(int j=1;j<=n;j++){
            m=m*j;
        }
        return m;
    }
    int krisno(int a, int b){
        int c;
        int c1=0;
        int sum=0;
        for(int i=a;i<=b;i=i+1){
            int i1=i;
            while (i!=0){
                c=i%10;
                sum=sum+fact(c);
                i=i/10;
            }
            if(i1==sum) {
                System.out.println(i1 + " ---> is a Krishnamurti number");
                c1=c1+1;
                return sum;
            }
        }
        return c1;
    }
}
