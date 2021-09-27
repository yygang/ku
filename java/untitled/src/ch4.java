public class ch4 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++) {
            int a=i/100%10;
            int b=i/10%10;
            int c=i%10;
            if (a*a*a+b*b*b+c*c*c==i){
                System.out.println("水仙花数："+i);
            }
        }
    }
}
