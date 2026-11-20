package org.example.e07exception;

import java.io.FileWriter;
import java.io.IOException;

public class E07Exception {
    public static void main(String[] args) {

        try{
            System.out.println("트라이 시작");
            throw  new Exception("아아아 에러"); //강제 예외 발생
            //double result = 10 / 0; //에러


            //System.out.println("트라이 끝");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException 발생"); // 에러가 발생하면 ArithmeticException 지나서 finally로 간다.

        } catch (Exception e){ // 에러가 났을때 실행 안나면 finally로 넘어감
            //catch (Exception e) Exception는 catch의 파라미터
            //Exception는 안에 있는 객체를
            System.out.println("캐치 시작");
            System.out.println("캐치 시작");

        }finally {
            System.out.println("파이널리"); //에러가 나도 무조건 실행됨

        }
        //Try with Resource
        FileWriter file  = null;

        try{
            file = new FileWriter("text.txt"); //()의 파일을 가져와서 쓸때 / "text.txt"는 쓰기모드로 가져옴
            //파일을 연결하기 위한 길을 계속 오픈해둬야한다. -> FileWriter file  = null;
            //작업이 끝났으면 길을 닫아줘야한다.안그러면 메모리에 계속 남게된다.
            //외부에 연결하기 위해 오픈을 해야하고 작업이 끝나면 닫아줘야한다.
            //성공했을때도 닫아줘야하고 실패했을때도 닫아줘야한다.

            file.write("안녕 자바!");

        }catch (IOException e){// IOException 읽거나 입력받을때
            e.printStackTrace();
        }finally {
            //닫아주는 작업, file파일에 접근하려면 try 밖에 있어야한다.
            //닫아주는 작업을 할때도 file.close() 조차도 예외가 발생할수있기 때문에 예외처리로 try로 한번더 감싸주는것이다.
            try{
                if(file != null){
                    file.close();
                }
                //file -> FileWriter
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        // 위에 작업이 너무 기니까
        // Try with Resource을 사용한다.
        // 오픈하는 처리만 해주면 해당 리소스를 자동으로 닫아 준다.
        // 로컬 스코프는 {}안에 이기때문에 ()안에 쓴거는 포함이 아니다. 그래서 file을쓰면 위에서 파일을 공유하고 있기
        // 때문에 에러가 뜬다. 밑에 위치에 쓸꺼면 이름을 다르게 해줘야 한다.
        // 밑에 코드로는 위에  FileWriter file  = null; 내용을 필요가 없다. 밑에 바로 선언을 했기 때문에
        try(FileWriter file1 = new FileWriter("text.txt")){
            file1.write("안녕안녕!");
        }catch (IOException e){
            e.printStackTrace();


        }


    }
}


//ArithmeticException가 Exception보다 밑에 있으면 Exception부터 실행되고  finally로 넘어간다.
//순서가 그렇게 되면 위에 Exception부터을 처리하는데 ArithmeticException을 쓴게 맞냐는 에러문구가 생긴다.
//블록 {}안에 있는 영역
//메인이 로컬 스코프 ->FileWriter파일이 밖에 있으니까 try,catch,finally 은 메인 로컬 스코프에 접근이 가능하다.