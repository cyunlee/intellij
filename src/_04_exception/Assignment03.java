package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("배열의 크기를 입력하세요.");
            int size = sc.nextInt();
            int[] arr2 = new int[size];
            double sum = 0;

            System.out.println("요소를 입력하세요.");
            for(int i=0; i<size; i++){
                arr2[i] = sc.nextInt();
                sum+=arr2[i];
            }
            double result = sum/size;
            System.out.println("평균 값 >> " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스가 범위를 벗어났습니다.");
        } catch (InputMismatchException e){
            System.out.println("정수를 입력해주세요");
        } catch (ArithmeticException e){
            System.out.println("나누기 중 에러가 발생했습니다");
        }
    }
}
