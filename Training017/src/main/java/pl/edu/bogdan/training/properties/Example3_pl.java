package pl.edu.bogdan.training.properties;

import java.util.ArrayList;
import java.util.ListResourceBundle;

public class Example3_pl extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return new Object[][] {
			{"key1", "polski1"},
			{"key2", "Klasa"}
		};
	}

}
