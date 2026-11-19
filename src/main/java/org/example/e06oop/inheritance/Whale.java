package org.example.e06oop.inheritance;

public class Whale extends Animal{
    // extends Animal 부모상속을 위해 클래스 명을 적는다.
     public Whale(String name, String residence){
        // 자식이 부모쪽에 접근 하고 싶을때 this는 자기자신한테 접근
        super(name,residence); //부모의 생성자가 호출하게 된다.
        System.out.println("고래 생성자");

    }

    public String swimming() {
        return String.format("%s가 헤엄칩니다.", super.name);
    }
    //오버라이딩(Overriding): 부모에게서 상속받은 메소드를 자식이 재정의 하여 사용
    @Override // 부모한테 받은걸 표시하기 위해 꼭 적어준다. 안적어주면 구버전에 에러가 났는데 현재 자바버전은 안 적어도 됨
    public String living(){
        return "수정했다.";
    }

}
