public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat  = 3.6;
        var paper = 763789;

        System.out.println(" ");
        System.out.println("Задача 1");
        System.out.println("dog = " + dog + "; cat = " + cat + "; paper = " + paper);

        System.out.println(" ");
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("dog + 4 = " + dog + "; cat + 4 = " + cat + "; paper + 4 = " + paper);

        System.out.println(" ");
        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("dog - 3.5 = " + dog + "; cat - 1.6 = " + cat + "; paper - 7639 = " + paper);

        System.out.println(" ");
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend + 2 = " + friend);
        friend = friend / 7;
        System.out.println("friend / 7 = " + friend);

        System.out.println(" ");
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog * 10 = " + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 = " + frog);
        frog = frog / 4;
        System.out.println("frog / 4 = " + frog);

        System.out.println(" ");
        System.out.println("Задача 6");
        var fighter1 = 78.2;
        var fighter2 = 82.7;
        var obshayaMassa = fighter1 + fighter2;
        var razdnitsaVesov = fighter2 - fighter1;
        System.out.println("Общий вес: " + obshayaMassa + "; Разница между бойцами: " + razdnitsaVesov);

        System.out.println(" ");
        System.out.println("Задача 7");
        var ostatok = fighter2 % fighter1;
        System.out.println("Остаток общей массы: " + ostatok);

        System.out.println(" ");
        System.out.println("Задача 8.1");
        var chelovekoChasi = 640;
        var workerDay = 8;
        var vsegoChelovek = chelovekoChasi / workerDay;
        System.out.print("Всего работников в компании - " + vsegoChelovek);

        System.out.println(" ");
        System.out.println("Задача 8.2");
        var dopolnitelnieCheloveki = vsegoChelovek + 94;
        System.out.print("Если в компании работает " +  dopolnitelnieCheloveki + " человека, то всего " + dopolnitelnieCheloveki * 8 + " часов работы может быть поделено между сотрудниками");
    }
}