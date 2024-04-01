import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;

        num = s.nextInt();


        if ((num%3 == 0)&&(num%5 == 0))
            System.out.println("3의 배수와 5의 배수가 모두 만족하는지");
        else if (num%3 == 0)
            System.out.println("3의 배수입니다");
        else if (num%5 == 0)
            System.out.println("5의 배수입니다");



    }

}
