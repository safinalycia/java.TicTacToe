package Zadanie8.listener;

import Zadanie8.components.OperatorJButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFieldButtonListener implements ActionListener {
    private JTextField inputField; //создали слушателя, который знает что за текст нах в кнопке


    public  CalcFieldButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //при нажатии на кнопку с текстом в поле должен отобразиться текст нажатой кнопки
        inputField.setText(inputField.getText());



    }
}
