package org.example.e06oop.inheritance;

public class Animal {
    protected String name ;
    protected String residence;

    public Animal(String name, String residence){
        this.name = name;
        this.residence = residence;
        System.out.println("동물 생성자");

    }
    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name); //%S->s은 문자열이다. String 이런 규칙이 있음
    }// 일반 메소드 , 반환한 값을 breath에 담는다.


    public String living(){
        return String.format("%s이/가 %s에서 삽니다.", this.name, this.residence);
    }// public앞에 final만 넣으면 오버라이딩이 안됨

}
