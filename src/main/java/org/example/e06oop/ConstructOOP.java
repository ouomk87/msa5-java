package org.example.e06oop;

public class ConstructOOP {
    private final String name;//name필드
    //ConstructOOP 생성할떄 name을 초기화(값을 넣고싶다) 하고 싶을때
    private int age; //age필드

    //생성자(constructor) 메소드 -> 오버로딩가능함
    //클래스를 인스턴스화 할때, 최초 1회만 실행되는 메소드
    //주로 객체의 초기화 또는 인스턴스 생성시, 실행되어야 할  작업을 위해 사용

    //기본 생성자:개발자가 생성자를 별도로 정의 하지 않으면 자동으로 생성되는 생성자
    public  ConstructOOP(){
        this("무명", 20);
    }
    //커스텀 생성자
    public  ConstructOOP(String name){
        //this(); 기본생성자 호출이 생략되어 있음
        //this 참조 변수 : 클래스 자기 자신(전체 내부)을 가르킴
        this.name = name ;
        //this.name => private String name 필드네임을 뜻함 this.은 나자신에 안에
        //뒤에 name은 파라미터(String name) name을 가져와서 씀

    }
    public ConstructOOP(String name, int age){

        //this.name = name;위에 name을 적어놨기때문에 실무에선 이렇게 안쓰고
        this(name); //이렇게 참조로  쓴다. ConstructOOP(String name)
        this.age = age;
    }

}