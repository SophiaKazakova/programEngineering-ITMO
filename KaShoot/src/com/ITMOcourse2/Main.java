package com.ITMOcourse2;

import java.util.Scanner;

public class Main {
    /**
     * This is about Main class
     * @param args
     */
    public static void main(String[] args) {
        /**
        * Here is some info about main fun
        *
        */
        String command;
        int y;
        double x, R;
        Scanner in = new Scanner(System.in);
        Log theLog = new Log();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("Введите команду shot, чтобы сделать выстрел, или help, чтобы получить справку: ");
            command = in.next();
            switch (command) {
                case "shot": {
                    x = in.nextDouble();
                    y = in.nextInt();
                    R = in.nextDouble();
                    Shot newShot = new Shot(x, y, R);
                    boolean res = newShot.shotSuccess();
                    theLog.addShot(newShot, res);
                    System.out.println(res);
                    break;
                }
                case "help": {
                    Help.helpOut();
                    break;
                }
                case "history": {
                    History.historyOut(theLog);
                    break;
                }
                case "exit": {
                    in.close();
                    Exit.exit();
                    break;
                }
                default: {
                    System.out.println("Поведение не определено. Используйте команду help, чтобы узнать возможные команды.");
                }
            }
        }
    }
}
