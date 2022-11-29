package Zadanie8.components;

import javax.swing.*;
import java.awt.*;

public class DigitJButton extends JButton {
    public DigitJButton(String text) { //свойства для кнопки
        super(text);
        setFont(new Font("TimesRoman", Font.PLAIN, 25)); //указали шрифт, размер
        setBackground(new Color(255, 255, 255)); //указали цвет кнопок задний фон
    }
}
