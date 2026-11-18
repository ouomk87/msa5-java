package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 길이 3의 인트 배열을 생성 및 초기화(지정한곳에 값이 들어간 상태):빈배열이 들어가있는 상태
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3}; // 길이 3의 인트 배열을 생성 및 초기화됨과 동시에 값도 함께 준다.
       // System.out.println(arr.toString()); // 그 배열의 주소값이 나옴
       // System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999; //얇은 복사는 하면 원본까지 변경하게 됨 그래서 깊은 복사를 해야함 메서드가 따로 있음

        // System.arraycopy() 이용해서 깊은 복사
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2]; // .length 배열의 길이를 반환해 줌,
        // 길이를 한번 정하면 수정할수 없음 그래서 int 6인 배열을 만들게 된다.
        System.arraycopy(
             originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length //배열 전체를 가지고 올꺼기때문에
        );
        copyArrSystem[0] = 999;

        // Arrays.copyOf() 이용해서 깊은 복사 : 조금더 짧고 쉬움
        int[] originArrays = {1, 2, 3};
        int[] copyArrays =  Arrays.copyOf(originArrays,originArrays.length); // 새로운 배열을 반환 copyArrays로 대입만 해주면 됨.
        copyArrays[0] = 999;

        // 직접 구현해보자 위에 Arrays.copyOf(originArrays,originArrays.length)부분이 밑에 처럼 구현되는것이다.
        int[] originFro = {1, 2, 3};
        int[] copyFor = new int [originFro.length * 2];
        for(int i = 0; i < originFro.length ; i++){
            copyFor[i] = originFro[i];
        }
        int idx = 0;
        for(int val : originFro){
            copyFor[idx] = val;
            idx++;
        }
        // val은 인덱스 값은 못들고옴
        //두가지중 편한 방식으로 사용하면 됨

        // 다차원 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(multiArr[1][1]); // 5에 접근하려면

        // 배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};

        // 배열의 길이
        System.out.println(arr3.length);

        // 배열이 같은지 비교
        System.out.println(Arrays.equals(arr3, arr4));

        // Array.deepEquals(arr1, arr2) : 다차원 배열 비교
        int[][] deepArr1 = {{1,2,3},{4,5,6}};
        int[][] deepArr2 = {{1,2,3},{4,5,7}};
        System.out.println(Arrays.deepEquals(deepArr1,deepArr2));

        // Arrary.sort(arr) : 배열의 정렬 : 잘안씀
        int[] sortArr = {43, 6, 7, 8, 4, 34, 2};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));





    }
}
