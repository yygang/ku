import java.sql.SQLOutput;

public class ch8 {
    public static void main(String[] args) {
        int[]  arr={1,3,6,10,15,2,5,9,14,4,8,13,7,12,11};
        int i=0;
        while (i<arr.length){
            if (i !=arr.length){
                System.out.println(arr[i]+",");
            }else {
                System.out.println(arr[i]);
                i++;
            }
            for (int j=0;j<arr.length;j++){
                if (j!=arr.length-1){
                    System.out.println(arr[j]+",");
                }else{
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
