import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // Zad1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    //zad 2
    String imie = "Maks";
    int rok = 2008;
    double liczba = 0.66;
    //zad 3
    System.out.println("Mam na imię "+imie+", mam "+(2026-rok)+" lat  i będę pisać maturę za "+liczba+" roku.");

    //zad 4
    Scanner sc = new Scanner(System.in);
    System.out.println("Napisz ile jest stopni na dworze: ");
    Double stopnie = sc.nextDouble();
    Double Fahrenheit = stopnie*1.8+32.0;
    System.out.println("Jest "+Fahrenheit+" stopni fahrenheita");

    //Zad 5
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Napisz pierwszy bok trójkąta: ");
    Double bok1 = sc1.nextDouble();
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Napisz Drugi bok trójkąta: ");
    Double bok2 = sc2.nextDouble();
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Napisz Trzeci bok trójkąta: ");
    Double bok3 = sc3.nextDouble();
    Double obwod = bok1+bok2+bok3;
    System.out.println("Obwód trójkąta wynosi: "+obwod);

    //zad 6
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Napisz pierwsze słowo: ");
    String slowo1 = sc4.next();
    Scanner sc5 = new Scanner(System.in);
    System.out.println("Napisz drugie słowo: ");
    String slowo2 = sc5.next();
    Scanner sc6 = new Scanner(System.in);
    System.out.println("Napisz trzecie słowo: ");
    String slowo3 = sc6.next();
    System.out.println(slowo3+", "+slowo2+", "+slowo1);
    //zad 7
    Scanner sc7 = new Scanner(System.in);
    System.out.println("Napisz wyraz: ");
    String wyraz = sc7.next();
    int liczba_liter = wyraz.length();
    System.out.println("Wyraz jest "+liczba_liter+" literowy");
    //zad 8
    double x = 5;
    double y = 2;
    double wynik1 = x / y;
    System.out.println(wynik1);

    //zad 9
    Scanner sc8 = new Scanner(System.in);
    System.out.println("Napisz  slowo: ");
    String slowo5 = sc8.next();
    System.out.println(slowo5.toUpperCase());

    //zad 10
    Scanner sc9 = new Scanner(System.in);
    System.out.println("Napisz  promien kola: ");
    int promien = sc9.nextInt();
    System.out.println("Pole koła wynosi: "+3.14*promien*promien);
}
