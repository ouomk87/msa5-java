package org.example.e06oop.abstractclass;

public abstract class Mammal {
//abstract 메소드 하나 추가될뿐 다른건 같다.
    protected  String name;
    protected  String residence;

    public String breath(){
        return String.format("%s이/가 숨을 쉽니다.", this.name);
    }
    /**
     * 해당 메소드는 반드시 사는곳을 출력하기위해 문자열을 반환하는 작업을 해라
     * @return
     */

    //추상 메소드 : 상속 관계에서 자식 클래스에게 특정기능을 반드시 구현하도록 강제하는 메소드
    public abstract String living();//구형부가 없는상태,선언문만 있는 상태


}
