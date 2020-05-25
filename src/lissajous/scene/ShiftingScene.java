package lissajous.scene;

import javafx.scene.paint.Color;

public class ShiftingScene extends AbstractScene{
	
	public ShiftingScene createScene() {
		CurveBuilder cb = CurveBuilder.instance();
		cb.setStroke(Color.BLACK, 1).setRadiusValue(100).setStepIncrement(2).setPhaseShiftInDegrees(90).setSpriteName("shifting");
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++) {
				entities().add(cb.setPosition(i*200-50, j*200-75).setABRatio(i, j).build());
			}
		return this;
	}

}
