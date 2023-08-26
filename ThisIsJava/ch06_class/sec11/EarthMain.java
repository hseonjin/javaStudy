package sec11;

class Earth {
	// 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;
	
	// 상수 선언
	static final double EARTH_SURFACE_AREA;
	
	// 정적 블록에서 상수 초기화
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}

public class EarthMain {

	public static void main(String[] args) {
		// 상수 읽기
		System.out.println("지구 반지름(km): " + Earth.EARTH_RADIUS);
		System.out.println("지구 표면적(km^2): " + Earth.EARTH_SURFACE_AREA);
	}
}
