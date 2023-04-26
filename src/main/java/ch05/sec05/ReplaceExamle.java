package ch05.sec05;
/*
replace() 메소드는 문자열에서 특정 문자열을 다른 문자열로 대체할 때 사용된다.
replace()가 리턴하는 문자열은 원래 문자열의 새로운 수정본이 아니라 새로운 문자열이고,
따라서 새로운 힙 메모리에 수정본이 생성된다.
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ReplaceExamle {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바","JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
