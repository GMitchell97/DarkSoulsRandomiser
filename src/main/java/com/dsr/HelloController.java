package com.dsr;

import com.dsr.pojo.Display;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    public Label Label_MajorGimmick;
    @FXML
    public Label Label_MinorGimmick;
    @FXML
    public Button Button_NextRandom;

    private DSR dsr;

    @FXML
    public void initialize() {
        dsr = new DSR();
    }

    @FXML
    protected void onNextRandomClick() {
        Display display = dsr.nextRandom();
        Label_MajorGimmick.setText(display.getMajor());
        Label_MinorGimmick.setText(display.getMinor());
    }
}