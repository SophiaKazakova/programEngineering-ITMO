package com.ITMOcourse2;

public class Help {
    /**
    * Here is some info about the Help class
    *
    */
    public static void helpOut() {
        System.out.println("Команда help:");
        System.out.println("\tВыводит все команды и инструкцию по вызову.");
        System.out.println("Команда shot:");
        System.out.print("\tВозвращает результат выстрела. \n " +
                "\tПринимает на вход три параметра: \n\t" +
                "\tвещественное x, абсциссу точки;\n\t" +
                "\tцелое у, ординату точки: одно из значений от -5 до 3 включительно;\n\t" +
                "\tвещественное R, коэффициент масштабирования области: 1, 1.5, 2, 2.5 или 3.\n");
        System.out.println("Команда history:");
        System.out.println("\tВыводит историю выстрелов в формате (x, y) : R : result, где:\n" +
                "\t\tx - абсцисса точки выстрела;\n" +
                "\t\ty - ордината точки выстрела;\n" +
                "\t\tR - коэффициент масштабирования области;\n" +
                "\t\tresult - успешность выстрела.");
        System.out.println("Команда exit:");
        System.out.println("\tВыход из программы.");
    }
}
