package Zadanie8;

import Zadanie8.components.DigitJButton;
import Zadanie8.components.OperatorJButton;
import Zadanie8.listener.ButtonListener;
import Zadanie8.listener.ClearFieldButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ApplicationForm extends JFrame {//наследовались от класса JFrame


    private JTextField inputField;


    public ApplicationForm(String title) {  //создали конструктор для формы
        super(title);

        setBounds(700, 500, 250, 300);//в каком месте будет находиться форма и размер нашего приложения
        setDefaultCloseOperation(EXIT_ON_CLOSE);//приложение не будет работать после нажатия Закрыть х
        setAlwaysOnTop(true);//приложение будет поверх всех открытых окон


        setLayout(new BorderLayout());//сетка для чисел и операторов
        add(createTopPanel(), BorderLayout.NORTH);//создали панель для вывода информации и создали метод
        setJMenuBar(createMenu());//меню сверху, создали метод для меню
        add(createCenterPanel(), BorderLayout.CENTER);//создали панель для цифр и создали метод
        //add(new Button("Кнопка"), BorderLayout.EAST);//создали кнопку и местонахождение
        //add(new Button("Кнопка2"), BorderLayout.WEST);//создали кнопку и местонахождение

        setVisible(true);


    }


    private JMenuBar createMenu() {
        JMenuBar menuBar = new JMenuBar();//создали элемент нашего меню, далее заполняем пункты меню

        JMenu menuFile = new JMenu("File");
        JMenuItem clear = new JMenuItem("Clear");
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        menuFile.add(clear);//внутри пункта File создали подпункты

        // JMenuItem calc = new JMenuItem("=");
        //  calc.addActionListener(new CalcFieldButtonListener(inputField));
        // menuFile.add(calc);


        menuFile.add(new JMenuItem("Exit"));//внутри пункта File создали подпункты
        menuBar.add(menuFile);//добавили в менюБар менюфайл

        menuBar.add(new JMenuItem("Help")); //создали еще пункты для меню
        menuBar.add(new JMenuItem("About"));//создали еще пункты для меню

        JMenuItem exit = new JMenuItem("Exit");
//        exit.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit("0");
//            }
//        });

        exit.addActionListener(e -> System.exit(0));
        menuBar.add(exit);//создали еще пункты для меню

        return menuBar;
    }


    private JPanel createTopPanel() {
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        inputField = new JTextField();
        inputField.setEditable(false);//запретить изменения, ввод только кнопками
        top.add(inputField);

        inputField.setFont(new Font("Arial", Font.BOLD, 25));//запрет на изменение шрифта
        inputField.setMargin(new Insets(8, 0, 8, 0));//запрет на отступы
        inputField.setBackground(new Color(255, 255, 255));
        //inputField.setText("1+2=3");

        return top;

    }


    private JPanel createCenterPanel() {
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());

        ActionListener buttonListener = new ButtonListener(inputField); //полиморфизм

        centerPanel.add(createDigitPanel(buttonListener), BorderLayout.CENTER);//создали панель для чисел и метод
        centerPanel.add(createOperatorPanel(buttonListener), BorderLayout.WEST);//создали панель для оператора и метод
        return centerPanel;
        //return null;
    }


    private JPanel createDigitPanel(ActionListener buttonListener) {
        JPanel digitsPanel = new JPanel();
        digitsPanel.setLayout(new GridLayout(4, 3));//панель для чисел


        //либо циклом заполнить фицрами нашу панель для цифр:
        for (int i = 0; i < 10; i++) {
            String buttonTitle = (i == 9) ? "0" : String.valueOf(i + 1);//начинаться будет с 0, если i достигнет 9, то i превратится в 0
            JButton btn = new DigitJButton(buttonTitle);//создаем кнопки
            btn.addActionListener(buttonListener);
            digitsPanel.add(btn);//закинули кнопки в панель для кнопок
        }
        JButton calc = new OperatorJButton("=");//создаем кнопки очистить и равно
        calc.addActionListener(buttonListener);
        digitsPanel.add(calc);
        //calc.setEnabled(false);//пока выключим эту кнопку


        JButton clear = new OperatorJButton("C"); //создаем кнопки очистить и равно
        clear.addActionListener(new ClearFieldButtonListener(inputField));
        digitsPanel.add(clear);
        //clear.setEnabled(false);//пока выключим эту кнопку


        return digitsPanel;
    }

    private JPanel createOperatorPanel(ActionListener buttonListener) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton minus = new OperatorJButton("-"); //создаем кнопки - + / *
        minus.addActionListener(buttonListener);
        panel.add(minus);

        JButton plus = new OperatorJButton("+"); //создаем кнопки - + / *
        plus.addActionListener(buttonListener);
        panel.add(plus);

        JButton multiply = new OperatorJButton("*"); //создаем кнопки - + / *
        multiply.addActionListener(buttonListener);
        panel.add(multiply);

        JButton divide = new OperatorJButton("/"); //создаем кнопки - + / *
        divide.addActionListener(buttonListener);
        panel.add(divide);


        return panel;
    }


}
