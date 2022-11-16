package Zadanie4;

import javax.swing.plaf.BorderUIResource;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    //private static final char = '*';
    //инициализация, это прописать переменные, константы
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    public static final String HEADER_FIRST_SYMBOL = "*";
    public static final String SPACE_MAP_SYMBOL = " ";

    private static final char[][] MAP = new char[SIZE][SIZE];

    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;


    public static void main(String[] args) {

        turnGame();
        playMore();


    }

    public static void turnGame() {
        initMap();
        printMap();
        playGame();

    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;  //в i и j будет подставляться символ пустоты '.'

            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();

    }

    //создаем печать массива, поле и вывод на консоль
    private static void printHeaderMap() {
        printMapNumber(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP_SYMBOL);
        }
        System.out.println();
    }

    private static void printMapNumber(String i) {
        System.out.print(i);
    }

    private static void printBodyMap() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i + 1 + SPACE_MAP_SYMBOL);
            for (int j = 0; j < SIZE; j++) {
                printMapNumber(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();

        }
    }

    //делаем игру, для того, чтобы начать ходить:
    private static void playGame() {
        while (true) {
            //ход человека:
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            iaTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }


        }
    }


    //ход человека:
    private static void humanTurn() {
        System.out.println("\nХОД ЧЕЛОВЕКА!");
        int rowNumber;
        int columnNamber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;
            System.out.print("Введите координату столбца: ");
            columnNamber = in.nextInt() - 1;
            //проверка на то, что в веденной ячейке ничего нет, чтобы избежать повтора:
            if (isCellFree(rowNumber, columnNamber)) {
                break;
            }
            System.out.printf("ОШИБКА!! Ячейка с координатами %s:%s уже используется %n", rowNumber + 1, columnNamber + 1);
        }
        MAP[rowNumber][columnNamber] = DOT_HUMAN;
        turnsCount++;
    }

    //ход компьютера:
    private static void iaTurn() {
        System.out.println("\nХОД КОМПЬЮТЕРА!");
        int rowNumber;
        int columnNamber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNamber = random.nextInt(SIZE);
            //проверка на то, что в веденной ячейке ничего нет, чтобы избежать повтора:
        }
        while (!isCellFree(rowNumber, columnNamber));

        MAP[rowNumber][columnNamber] = DOT_AI;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNamber) {
        return MAP[rowNumber][columnNamber] == DOT_EMPTY;
    }

    private static boolean checkEnd(char symbol) {
        //победа:
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {
                System.out.println("УРА!! Вы победили");
            } else {
                System.out.println("Восстания близко...Скайнет победил...");

            }

            return true;
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    //ничья:
    private static boolean checkDraw() {
        // for (char[] chars : Map) {
        // for (char symbol : chars){
        //if (symbol == DOT_EMPTY){
        //       return false;
        //    }
        //    }
        // }
        //return true;
        return turnsCount >= SIZE * SIZE;
    }


    private static boolean checkWin(char symbol) {

        //if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol)
        //return true;
        //if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol)
        //return true;
        //if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol)
        //return true;
        //if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol)
        //return true;
        //if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol)
        //return true;
        //if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol)
        //return true;
        //if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol)
        //return true;
        //if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol)
        //return true;

        //пробую другой вариант проверки на победу:

        boolean toright, toleft; //для диагоналей
        toright = true;
        toleft = true;
        for (int i = 0; i < 3; i++) {
            toright &= (MAP[i][i] == symbol);
            toleft &= (MAP[3 - i - 1][i] == symbol);
        }

        if (toright || toleft)
            return true;
//проверка горизонтальных и вертикальных линий:
        boolean cols, rows;
        for (int col = 0; col < 3; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < 3; row++) {
                cols &= (MAP[col][row] == symbol);
                rows &= (MAP[row][col] == symbol);
            }

            if (cols || rows)
                return true;
        }
        return (false);
    }

    private static void playMore() {
        do {
            System.out.println(" Игра начинается  ");
            initMap();
            printMap();
            playGame();
        } while (continueGame());
    }

    private static boolean continueGame() {
        Scanner ex = new Scanner(System.in);
        String re;
        do {
            System.out.print("Хотите продолжить игру? ");
            re = ex.next();
            if (re == "Y") {
            } else if(re == "N") {
                //НЕ ПОНЯЛА ДО КОНЦА, КАКОЙ ЗДЕСЬ МЕТОД ВЫЗВАТЬ, playGame?
                break;
            }
        }
        while (re == ("Y") || re == "N");


   }

}





