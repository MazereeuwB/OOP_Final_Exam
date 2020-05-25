package lissajous.entity.sprite;

public class SpriteFactory {

	private SpriteFactory() {
	}
	
	public static <T> T getSprite(String name) {
		if(name == null) throw new NullPointerException();
		else if(name.equals("tracing"))
			return (T) new TracingCurveSprite();
		else if(name.equals("shifting"))
			return (T) new ShiftingCurveSprite();
		else throw new UnsupportedOperationException();
	}
}
