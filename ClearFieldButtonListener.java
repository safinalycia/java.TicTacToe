package Zadanie8.listener;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearFieldButtonListener implements ActionListener { //создали слушателя, который знает что за текст нах в кнопке

    private JTextField inputField;


    public ClearFieldButtonListener(JTextField inputField) {
        this.inputField = inputField;
    }

    @Override
    public void actionPerformed(ActionEvent e) { //при нажатии на кнопку с текстом в поле должен отобразиться текст нажатой кнопки
        inputField.setText("");


    }
}
