package _03_array;

//표준 배열
//배열
// - 배열에 저장할 자료형 선언하고, 배열 이름과 크기를 선언해야 함
// - 배열의 원소는 모두 같은 타입
// - 처음 선언한 배열 크기 변경 불가능(단, ArrayList 컬렉션의 경우, 동적으로 크기 조절 가능)

import java.sql.SQLOutput;

public class ArrayEx {
    public static void main(String[] args) {
        //배열 변수 선언
        // - 두 가지 방법이 있으나 관례적으로 첫 번째 방법 사용
        // 1. 타입[] 변수;
        // 2. 타입 변수[];
        int[] arr1;
        int arr2[];

        // - 배열 변수는 "참조 변수". 배열도 객체이므로 힙 영역에 생성되고, 배열 변수는 힙 영역의 주소를 저장
        // null 지정 가능 (null로 초기화)
        // ex. 타입[] 변수 = null;
        // => 배열 변수가 null 값을 가진 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 NullPointerException 발생
        String[] temp = null;
        System.out.println(temp);
        //System.out.println(temp[0]); //NullPointerException
        /////////////////
        //다차원 배열
        // - 배열 안에 또 다른 배열이 존재하는 배열
        // 2 x 3 배열 생성 및 초기화
        //(0,0), (9,1), (9,2)
        //(1,0), (1,1), (1,2)
        int[][] matrix = {{1,2,3}, {4,5,6}};

        //3x2 배열 생성 및 초기화
        int [][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;


        //3차원 배열 생성 및 초기화
        int[][][] threeDimensionArr = {{{1,2}, {3,4}}, {{5,6}, {7,8}}};

        System.out.println("matrix : ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[j].length; j++){
                System.out.println(matrix[i][j] + " ");
            }

            System.out.println();

        }

        //3차원 배열의 값 출력
        System.out.println("matrix3: ");
        for (int i=0; i<threeDimensionArr.length; i++){
            for(int j=0; i<threeDimensionArr[i].length; j++){
                for(int k=0; i<threeDimensionArr[i].length; k++){
                    System.out.println(threeDimensionArr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
