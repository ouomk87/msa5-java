package org.example.e02Operator;

public class E02Operator {

    public static void main(String[] args){

        // 대입 연산자
        int num1 = 2;
        int num2 = 5;

        // 산술 연산자
        System.out.println(num1 + num2); //7
        System.out.println(num1 - num2); //-3
        System.out.println(num1 / num2); //0
        System.out.println(num1 * num2); //10
        System.out.println(num1 % num2); //2

        // 산술 대입 연산자
        int num3 = 1;
        num3 = num3 + 3;
        num3 += 3; //num3에 3을 더한 값을 num3에 대입한다.
        num3 -= 3;
        num3 /= 3;
        num3 *= 3;
        num3 %= 3;

        // 증감 연산자
        int num5 = 0;
        ++num5; // 1 ,
        System.out.println(num5++); //후위 증감 연산자 0 출력, 그 다음에 num5가 1이 된다
        System.out.println(++num5); //전위 증감 연산자 num5가 2가 된 다음 2 출력

        // 비교연산자
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);

        // 문자열의 비교
        String str1= "str1"; // String pool
        String str2= "str2";
        String str3= new String("str1"); //풀과 별개로 힙에 새 객체 생성 (str1과 주소가 다름)

        System.out.println(str1.equals(str2));// 문자열 비교는 무조건 equals을쓰면 String pool 생각안해도 된다.
        System.out.println(str1 == (str3));
        System.out.println(str3);

        // 논리 연산자
        int num10 = 0;
        int num11 = 2;
        System.out.println(num10 > 0 && num11 <= 11); // false
        System.out.println(num10 > 0 || num11 <= 11); // true
        System.out.println(!(num10 > 0)); // true

        // 삼항 연산자 연산한 결과가 두결과로만 나올때!
        String result = num1 > num2 ? "num1 크다" : "num1이 작다" ; // 참 : 거짓





    }

}
