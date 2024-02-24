package _02_control_statement;
import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");
        double a = sc.nextInt();
        double b = sc.nextInt();

        System.out.println("덧셈 결과 : " + (a + b));
        System.out.println("뺄셈 결과 : " + (a - b));
        System.out.println("나눗셈 결과 : " + (a / b));
        System.out.println("곱셈 결과 : " + (a * b));
    }
}
