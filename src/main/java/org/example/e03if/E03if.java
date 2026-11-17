package org.example.e03if;

public class E03if {
    public static void main(String[] args){

        // IF로 만들어주세요.
        // 성적
        // 범위 :
        //		100   : A+
        //		90이상 100미만 : A
        //		80이상 90미만 : B
        //		70이상 80미만 : C
        //		60이상 70미만 : D
        //		60미만: F

        //출력 문구 : "당신의 점수는 XXX점 입니다. <등급>"
        // 테스트 1최소 17개
        // 0~100의 숫자가 아닐 경우, 오동작한다.
        // 해당 현상을 아래처럼 수정하시오.
        // 0~100의 숫자가 아닐 경우, "유효한 점수가 아닙니다." 출력
        // 그 외 패턴은 기존과 동일

        int score = -2;
        String grade = "";

        if(score >= 0 && score <= 100 ){
            if(score == 100){
                grade = "A+";
            } else if(score >= 90){ // 100점을 위에 빠져있기때문에 해줄필요없음 89,90,91 테스트
                grade = "A";
            } else if(score >= 80 ){ //79,80,81 테스트
                grade = "B";
            } else if(score >= 70 ){
                grade = "C";
            } else if(score >= 60){
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf(" 당신의 점수는 %d점 입니다. <%s> ", score, grade);
        } else {
            System.out.printf("유효한 점수가 아닙니다.");
        }

        // Switch 문
        int num = 1;
//        if(num == 1){
//            System.out.println("1등");
//        }

        switch (num){
            case 1: //case1 의 값이 맞으면 밑에 출력됨
                System.out.println("1등");
                break; // 조건이 맞아서 실행하고 break가 있으면 그대로 완료 없으면 조건이 맞아도 다음실행으로 넘어간다.
            case 2:
                System.out.println("2등");
                break;
            case 3:
                System.out.println("3등");
                break;
            default:
                System.out.println("등수 외");
                break;
        }



    }

}
