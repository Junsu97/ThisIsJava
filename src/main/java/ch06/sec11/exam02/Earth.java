package ch06.sec11.exam02;

public class Earth {
    /*
    상수는 불변의 값을 저장하는 필드이다.
    상수는 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에
    static이면서 final인 특성을 가져야 한다.

    상수 이름은 모두 대문자로 작성하는 것이 관례이다.
    * */

    //상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    //상수선언
    static final double EARTH_SURFACE_AREA;

    //정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI *  EARTH_RADIUS * EARTH_RADIUS;
    }
}
