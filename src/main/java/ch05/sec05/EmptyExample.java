package ch05.sec05;

public class EmptyExample {
    // 문자 공백 검사를 하기 위해선 문자열 검사를 위해 equals를 사용한다.
    public static void main(String[] args) {
        String hobby = "";
        if(hobby.equals("")){
            System.out.println("hobby 변수가 참조 String 객체는 빈 문자열");
        }
    }
}
