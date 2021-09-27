import java.util.Scanner;

public class ch6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个浮点型数：");
        float m=scanner.nextFloat();
        int a=(int)m;
        float b=m-a;
        System.out.println("整数部分："+a);
        System.out.println("小数部分："+b);
    }
}
