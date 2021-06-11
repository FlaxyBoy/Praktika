package cv.bloody.ua.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class AppController {


    public TextField mainFiled;
    public TextField responseFiled;

    public void onAction(ActionEvent actionEvent) {
        double num;
        try {
            num = Double.parseDouble(mainFiled.getText());
        }catch (Exception e) {
            responseFiled.setText("Неправильний формат числа");
            return;
        }
        if(num < -2 || num > 3) {
            responseFiled.setText("Число не входить в діапазон");
        }else {
            responseFiled.setText("Число входить в діапазон");
        }
    }
}
