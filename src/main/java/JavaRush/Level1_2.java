package JavaRush;

import java.util.Scanner;

public class Level1_2 {

    public static void main(String[] args) {

        //System.out.print("Я думаю, быть    программистом круто");

        //int a = 1, b = 2;
        //обьявление переменных и присвоение им значений

        /*
        int a = 3126-8;
        System.out.println(a);
        //можно и воттаквот
         */

        /*
        int centimeters = 243;
        int meters = 0; //напишите тут ваш код
        meters = centimeters / 100;
        System.out.println(meters);
         */

        /*
         // объявляем переменную number типа int и сразу же в строке объявления
        // присваиваем ей значение 546
        int number = 546;

        // создаем переменную lastDigit типа int, в которую помещаем значение
        // последней цифры числа number
        // (number % 10 дает остаток от деления number на 10, а это и будет
        // последняя цифра числа number)
        int lastDigit = number % 10;

        // выводим на экран значение переменной lastDigit
        System.out.println(lastDigit);
         */

        /*
        int six = 6;
        six++;
        six++;                  //инкриминтирование шестерки в девятку
        six++;
        System.out.println(six);
         */

        /*
        String word = "1", phrase = "2", line = "gafgf", text = "falasjf";
        // обьявление String
         */

        /*
         String s1 = "Do";
        String s2 = "It";
        String s3 = "Just";

        String tagline = s3 + s1 + s2; //выводим JustDoIt в консоль

        System.out.println(tagline);
         */

        /*
         // объявляем переменную x типа int и присваиваем ей значение
        int x = 2;
        // объявляем переменную y типа int и присваиваем ей значение
        int y = 4;
        // объявляем переменную z типа int и присваиваем ей значение
        int z = 0;

        // объявляем переменную digits типа String и присваиваем ей результат
        // соединения (конкатенации) чисел x, y, z и пустой строки "" при этом
        // сложение идет слева направо и сначала будут суммированны x и y,
        // причем как числа, после этого будет добавлена пустая строка и
        // результат автоматически будет преобразован в строку, а далее будет
        // добавлено число z уже как строка, так как при добавлении числа к
        // строке число преобразуется в строку и складываются уже строки
        String digits = x + y + "" + z;

        // выводим на экран значение переменной digits
        System.out.println(digits);// получаем 60
         */

        /*
         String bigAmount = "500";
        String greatAmount = "100000";
        int hugeAmount = Integer.parseInt(bigAmount) + Integer.parseInt(greatAmount);
        System.out.println(hugeAmount);
        //преобразование строк в инты Integer.parseInt
         */

        /*      //.length
        String emptyString = "";
        System.out.println(emptyString.length());
        System.out.println("Gomu Gomu no Bazooka!".length());
        System.out.println((emptyString + 2 + 2 + "22").length());
        //вывод длинн строк
         */

        /*
        .toLowerCase(), .toUpperCase();
         */

        /*      // ввод с клавиатуры Scanner scan = new Scanner(System.in);
        Scanner stroka = new Scanner(System.in);

        String a = stroka.nextLine();
        String b = stroka.nextLine();
        String c = stroka.nextLine();

        System.out.println(c);
        System.out.println(b.toUpperCase());
        System.out.println(a.toLowerCase());
         */
        Scanner scanner = new Scanner(System.in);


        int i1 = scanner.nextInt();
        int i2 = scanner.nextInt();
        int i3 = scanner.nextInt();

        // выводим на экран значение - результат вычисления выражения
        // (i1 + i2 + i3) / 3
        System.out.println((i1 + i2 + i3) / 3);
    }
}