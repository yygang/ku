import java.util.Scanner;

public class ch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩。");
        double score = scanner.nextDouble();
        int level;
        if (score>=90 && score<=100){
            level=1;
        }else if (score>=80){
            level=2;
        }else if (score>=70){
            level=3;
        }else if (score>=60){
            level=4;
        }else {
            level=5;
        }
        switch (level){
            case 1:
                System.out.println("优秀");break;
            case 2:
                System.out.println("良好");break;
            case 3:
                System.out.println("中等");break;
            case 4:
                System.out.println("及格");break;
            case 5:
                System.out.println("不及格");break;
        }



    }
}
