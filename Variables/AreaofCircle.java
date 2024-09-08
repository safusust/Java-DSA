package Variables;

import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        float ans=3.1416f*radius*radius;
        System.out.println(ans);
    }
}
