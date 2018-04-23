package core.comp3111;

import javafx.scene.Scene;
import javafx.scene.chart.Chart;
import javafx.stage.Stage;

public class GeneralChart {
	protected String chartName;
	protected Chart chart;
	
	public String getTitle() {
		return this.chartName;
	}
	
	public Chart getChart() {
		return this.chart;
	}
	
	public void show() {
		Stage dialog = new Stage();
		Scene dialogScene = new Scene(this.chart, 800, 600);
		dialog.setScene(dialogScene);
		dialog.show();
	}
}