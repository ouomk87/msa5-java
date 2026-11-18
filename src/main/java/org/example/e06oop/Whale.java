package org.example.e06oop;

public class Whale {


    // 필드(Field)변수
    public String name = "고래"; // 인스턴스 변수
    //public static int age = 20; // 클래스 변수
    //static 인스턴스 시키지 않아도 필드랑 메소드는 미리 올려둔다. 그래서 바로 호출할수 있음.
    //정적메소드, static 클래스
    //static 다 만들지 않는 이유
    //내가 여기저기 다 쓸거라면 설정해 주고 static으로 올려둠(제한적인 상황에만 쓴다.)

    //생성자 메소드
    Whale(){}

    // 메소드(Method)함수
    public void swimming(){
        System.out.println("고래가 헤엄칩니다.");


    }
}
