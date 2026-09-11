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
    
}
