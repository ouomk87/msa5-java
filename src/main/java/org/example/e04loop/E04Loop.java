package org.example.e04loop;

public class E04Loop {

    public static void main(String[] args){

    // for(초기값; 조건; 증감연산)
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }


        for(int i = 0; i < 2; i++){
            System.out.println(i);
            for(int z = 0; z < 5; z++){
                System.out.printf("i값:%d, z값:%d%n", i, z);
            } //하위가 먼저 돌고 상위로 돈다. 3중for문은 사용 잘 안한다.
            // 남아있는 아이템이 있으면 계속돈다.
        }


        // 구구단 2~9단을 출력
        // 예시)
        // ** 2단 **
        // 2 X 1 = 2
        // 2 X 2 = 4
        // ...
        // ** 3단 **
        // 3 X 1 = 3
        // 3 X 2 = 6
        // ...
        // 9 X 8 = 72
        // 9 X 9 = 81







    }
}
