import java.util.Scanner;

public class ch5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数：");
        int n=scanner.nextInt();
        int a=n/1000%10;
        int b=n/100%10;
        int c=n/10%10;
        int d=n%10;
        int sum=a+b+c+d;
        System.out.println("和"+sum);
    }
}
