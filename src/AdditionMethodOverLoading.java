import java.util.Scanner;

class Add
{
    int add(int a,int b)
    {
        return a+b;

    }
    double add(int a,double b)
    {
        return a+b;
    }
    double add(double a,int b)
    {
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    void add(String str1,String str2)
    {

        String s=str1+str2;
        System.out.println("method 5:concatinated string ="+s);
    }
    void add(int[] nums)
    {
        int sum=0;
        int n=6;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];

        }
        System.out.println("method 6:sum:"+sum);

    }
}
public class AdditionMethodOverLoading extends Add{
    public static void main(String[] args)
    {
        Scanner cs=new Scanner(System.in);
        AdditionMethodOverLoading sc=new AdditionMethodOverLoading();
        System.out.println("method 1:sum:"+sc.add(cs.nextInt(), cs.nextInt()));
        System.out.println("method 2:sum:"+sc.add(cs.nextInt(), cs.nextDouble()));
        System.out.println("method 3:sum:"+sc.add(cs.nextDouble(), cs.nextInt()));
        System.out.println("method 4:sum:"+sc.add(cs.nextDouble(), cs.nextDouble()));
        sc.add("shree","ya");
        int b[]= {1,2,3,4,5,6};
        sc.add(b);
    }

}