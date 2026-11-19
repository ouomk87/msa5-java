package org.example.e06oop.interfaceedu;

class Whale extends Mammal implements Swim, Flight {
    Whale(){
        super("고래", "바다");
    }

    @Override
    public String residence() {
        return String.format("%s이/가 %s에 삽니다.", this.name, this.residence);
        //상속받았다면 this로 쓰면 부모꺼는 내꺼처럼 쓸수 있음 this를 super로 써도 됨 둘다 가능!!
    }
    public String swimming(){
        return String.format("%s이/가 헤엄칩니다.", this.name);
    }

    @Override
    public String flying() {
        return String.format("$s이/가 날압갑니다.", this.name);
    }
}
