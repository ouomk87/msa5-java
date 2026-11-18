package org.example.e06oop;

public class MainOOP {
    public static void main(String[] args) {

    Whale whale = new Whale();
    FlyingFish flingFish = new FlyingFish();
    System.out.println(whale.name);
    whale.swimming();
    whale.name = "돌고래";
    System.out.println( whale.name);

    AccessModifier accessModifier = new AccessModifier();
    accessModifier.fnProtected();

    //오버로딩(OverLoading)
    // 메소드의 시그니처가 다르거나, 동일한 이름을 가지는 메소드를 중복하여 정의
        //메소드를 선언문에 파라미터리스트를 시그니처라고 부른다.
        System.out.println();
        System.out.println(OverloadingOOP.add(1));
        System.out.println(OverloadingOOP.add(1, 2));

    }
}
