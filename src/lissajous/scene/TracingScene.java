package lissajous.scene;

import javafx.scene.paint.Color;

public class TracingScene extends AbstractScene{

	
	public TracingScene createScene() {
		CurveBuilder cb = CurveBuilder.instance();
		cb.setStroke(Color.BLACK, 1).setRadiusValue(50).setStepIncrement(2).setPhaseShiftInDegrees(90).setSpriteName("tracing");
		for(int i = 0; i < 7; i++)
			for(int j = 0; j < 7; j++) {
				entities().add(cb.setPosition(i*100, j*100-25).setABRatio(i, j).build());
			}
		return this;
	}
}
