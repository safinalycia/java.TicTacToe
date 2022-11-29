package Zadanie8.components;

import javax.swing.*;
import java.awt.*;

public class OperatorJButton extends JButton {
    public OperatorJButton(String text) {
        super(text);
        setFont(new Font("TimesRoman", Font.BOLD, 30)); //указали шрифт, размер
        setBackground(new Color(255, 255, 255)); //указали цвет кнопок

    }
}
