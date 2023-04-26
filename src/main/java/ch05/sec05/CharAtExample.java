package ch05.sec05;

/*charAt()메소드는 매개값으로 주어진 인덱스의 문자를 리턴하고 0부터 문자열의 길이 - 1까지의 번호다.*/
public class CharAtExample {
    public static void main(String[] args) {
        String ss = "9506241230123";
        char sex = ss.charAt(6);

        switch (sex){
            case '1': case '3':
                System.out.println("남자입니다.");
                break;
            case'2': case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
