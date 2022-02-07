package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

/**
 * JSON 데이터 주고 받기 위한 클래스
 * 보통 JSON 데이터는 객체로 바꿔서 사용한다.
 * JSON 형식을 파싱할 수 있도록 객체를 하나 만든다.
 * JSON 라이브러리가 기본으로 getter setter를 호출한다. 자바빈 접근법(자바 프로퍼티 접근법)이라고 한다.
 */

@Getter @Setter
public class HelloData {
    private String username;
    private int age;


}
