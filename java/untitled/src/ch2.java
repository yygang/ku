import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score=scanner.nextInt();
        int level2;
        if (score>=85 && score<=100){
            level2=1;
        }else if (score>=70){
            level2=2;
        }else if (score>=60){
            level2=3;
        }else {
            level2=4;
        }
        switch (level2){
            case 1:
                System.out.println("A");break;
            case 2:
                System.out.println("B");break;
            case 3:
                System.out.println("C");break;
            case 4:
                System.out.println("D");break;
        }
    }
}
