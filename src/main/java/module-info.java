module com.dsr.darksoulsrandomiser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.dsr to javafx.fxml;
    exports com.dsr;
}