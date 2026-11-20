package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        //LocalDateTime은 now(), of(), parse() 같은 static 메서드가 대신 만들어서 돌려주기 때문에 new가 필요 없다.
        LocalDateTime now = LocalDateTime.now(); // 현재시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026, 11,1,11,30,40);

        //ISO 표준 시계열 문자열 => 날짜 객체
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");
        //T는 여기서 부터 시간을 나타냄 T를 기준으로 앞뒤가 뭔지 읽는다.

        //ISO 표준 시계열 이외의 문자열 => 날짜 객체 (포멧터를 이용)
        //표준기법은 아니지만 맞춤형으로 커스텀해서 아래 처럼할수 있다. mySQL에서 db를 받았을경우 같은 양식으로 적용하고 싶을때(애초에 ISO표준기법으로 주지않기 때문에)
        String date= "2026-11-01 11:30:12"; // 여기는 T가 없어서 위처럼 구분할수 없기 때문에 아래내용을 함께 쓴다.
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);
        // 위에 꺼는 아래로 표시 해줘야한다.
        // LocalDateTime은 년/월/일 다 따로 저정하기 때문에 구분이 되야한다. 쪼개는 기준이 있어야 하기 때문에 우리가 정한 포맷에 맞춰서 자르게 된다.

        System.out.println(now);
        System.out.println(parsedDate1);
        System.out.println(parsedDate2);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);

        //날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L); // longtime을 받음 1은 int타입인데 int타입은 long으로 받음
        //불변객체(immutable object, 이뮤터블 오브젝트) 는 한 번 만들어진 뒤에는 안에 담긴 값을 바꿀 수 없는 객체를 말한다.
        //하루 더하는 연산을 했을때 now자체의 값이 변하지 않는 객체를 불변객체라고 한다.
        System.out.println(now);// now의 값을 바탕으로 하루를 더한 새 객체를 만들어서 반환한다. (now 자체는 바뀌지 않고 힙 영역에는 LocalDateTime 객체가 두 개 생긴다. (원본 객체 1개 + 하루 뒤 값의 새 객체 1개))
        System.out.println(addOneDayFromNow);//원본은 바뀌지않고 원본의 기준으로 값을 변환해서 출력된다.(하루만 더해서 출력된다.)

        //상대적인 날짜 계산 (TemporalAdjusters)
        LocalDateTime firstDayOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDayOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(firstDayOfMonth); //이번달의 첫번째 데이트
        System.out.println(lastDayOfMonth);
        System.out.println(firstDayOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        // 두 날짜의 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025,9,10);
        System.out.println(d1.isBefore(d2)); // false
        System.out.println(d1.isAfter(d2)); //true
        System.out.println(d1.isEqual(d2)); // 같은지 false

        // period 객체 : 두 날짜의 연/월/일을 단위로 분해해서 각각의 차를 구하는 객체
        Period p1 = Period.between(d1, d2); //두 차이를 p1이 가져오고
        // System.out.println(p1.getYears()); // 가져온걸 년으로 가져오면  -1 음수
        System.out.println(Math.abs(p1.getYears())); // 절대값처리 1
        System.out.println(Math.abs(p1.getMonths())); // 개월수 차이 2
        System.out.println(Math.abs(p1.getDays())); //  10
        // System.out.println(p1); // p1.toString()이 따라옴

        // ChronoUnit 객체
        Long untilDays = d1.until(d2, ChronoUnit.DAYS);
        System.out.println(untilDays); // 음수 -436
        System.out.println(Math.abs(untilDays)); // 양수 436

        //LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate(); // 원본은 변하지 않음
        System.out.println(extractLocalDateFromNow);

    }
}
