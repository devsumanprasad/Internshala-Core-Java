module com.internshala.connect4 {
	requires javafx.controls;
	requires javafx.fxml;

	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires org.kordamp.bootstrapfx.core;

	opens com.internshala.connect4 to javafx.fxml;
	exports com.internshala.connect4;
}