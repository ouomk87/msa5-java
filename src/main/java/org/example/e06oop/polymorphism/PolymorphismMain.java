package org.example.e06oop.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Whale whale = new Whale();
        Mammal whale2 = new Whale();

        Monkey monkey1 = new Monkey();
        Mammal monkey2 = new Monkey();
        //Whale Monkey 둘이 Mammal를 상속받고 있기때문에 부모클래스의 형태도 가질수있다.

        Saba saba1 = new Saba();
        //Mammal saba2 = new saba(); //saba는 상속하는 문구를 적지 않았기 때문에 에러가 난다.

        //--------------------------------------------------

        // 배열성 데이터를 쓸때 이런 다양성을 많이 쓴다.
        // int[] arr = 이렇게 배열을 하는데 원숭이 고래 둘다 담아야 한다면 하나로 묶을 이런 Mammal이 필요하다.
        Mammal[] arr = new Mammal[5];
        arr[0] = new Whale();
        arr[1] = new Mammal();
        arr[2] = new Mammal();
        //추가 할게 많아지면 루프를 돌린다.

        // 다양성 쓸때 조심해야하는
        // 업캐스팅:자식 클래스가 부모클래스 타입으로 캐스팅 되는것
        // -부모클래스로 캐스팅 되면 자식클래스에 있는 멤버에는 접근이 불가능
        Mammal upCasing1 = new Whale(); //Mammal의 형태를 따라감
        //upCasing1.swimming();// 자식클래스의 swimming() 접근안됨
        //업캐스팅하는 이유는 위에 Mammal[] arr을 사용해서 두가지 다 가져오기 위해서이다.

        // 다운캐스팅:업캐스팅한 인스턴스를 다시 본인의 데이터 타입으로 캐스팅하는것
        Whale downCasting1 = (Whale) upCasing1;
        // 바꾸고 싶은 데이터타입을 ()안에 적고 뒤에 변수를 적으면됨. Whale이라는 타입으로 캐스팅 하겠다. 라는 문법
        downCasting1.swimming();
        //다운캐스팅해도 상속관계를 깨지지않고 나자신으로 돌아 온다.
        Mammal mammal = new Mammal(); // Mammal은 다운캐스팅 할수없음 업캐스팅 하지않았기 때문에
        Whale whale13 = (Whale) mammal; //에러는 표시 안되지만 나중에 에러남 위에 이유로


    }
}
