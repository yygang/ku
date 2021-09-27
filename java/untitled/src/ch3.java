import java.util.Scanner;

public class ch3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数：");
        int n=scanner.nextInt();
        double flag=1,i,j;
        double sum=0,k=1;
        for ( i=1;i<=n;i++){
           k*=1;
           sum+=flag/k;
           flag=-flag;
        }
        System.out.println("1-1/2!+1/3!-·····(-1)^(n-1)/n!="+sum);
    }
}
