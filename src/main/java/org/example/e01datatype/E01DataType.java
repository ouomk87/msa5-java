package org.example.e01datatype;

public class E01DataType {
    public  void execute() {
        boolean bool = true;
        bool = false;
        // bool = 1 ; 선언할때의 데이터 타입과 다를 경우, 타입에러가 발생한다.
        System.out.println(bool);
        System.out.println(bool);
        System.out.printf("현재 변수 bool의 값은 %s", bool);

        // 변수 선언
        int age; // 이름만 선언 테이터타입 + 변수명
        age = 1; //초기화
        // age = 'a' 아스키코드 97로 인식되서 숫자로 들어가게됨
        char ch = 'a';
        String str = "a";

        // 상수  final 키워드만 붙여주면 된다.
        final String USER_NAME = "길동이";
        // USER_NAME = "sad";

        //Underscore 표기법 _로 자리수 보기 편하게 해주기 위해 쓰고 인식은 따로 하지않는다.
        int num = 1_012_203_015;

        // 두변수의 값을 스와핑 해보자. swap1 이랑 swap2의 값을 바꾸기
        int swap1 = 1;
        int swap2 = 2;
        int tmp;
        tmp = swap1;
        swap1 = swap2;
        swap2 = tmp;

        // 데이터 타입
        boolean bool2 = true;
        byte bt = -128;
        short sh = 32763;
        int integer = 21334554; // 사용할수 있는 범위가 넘어가면 에러로 알려줌
        long longer = 2323243434L; //L을 붙여서 롱타입이라도 인식시켜줌 int보다 큰 숫자 넣으면 에러남 소문자는 헤갈림 안붙이면 int로 인식됨

        double db = 3.141592;
        float ft = 3.14592F; // float 타입은 반드시 가장 뒤에 'F'을 붙여줄 것 안붙이면 기본 double으로 인식됨
        char ch1 = 'g';





    }
}
