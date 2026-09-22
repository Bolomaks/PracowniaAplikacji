//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //zad 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę całkowitą dodatnią: ");
    int liczba = sc.nextInt();
    int i = 1;

    while (i <= liczba) {
        System.out.println(i);
        i += 2;
    }

//zad 2
    System.out.println("Podaj liczbe całkowitą dodatnia n: ");
    int n = sc.nextInt();
    int wynik = 2;
    while (wynik < n) {
        System.out.println(wynik);
        wynik *= 2;
    }

    //zad 3
    System.out.println("Napisz liczbę: ");
    int liczba1 = sc.nextInt();

    while (liczba1 != 0) {
        System.out.println("Jeszcze raz");
        liczba1 = sc.nextInt();
    }

    //zad 4
    int i2 = 0;
    int min = 0;
    int max = 0;


    System.out.println("Podaj ciąg liczb całkowitych: ");
    int ciag = sc.nextInt();


    if(ciag!=0){
        min = ciag;
        max = ciag;
    }
    while (ciag != 0) {

        i2++;
        if (ciag < min) {
            min = ciag;
        }

        if (ciag > max) {
            max = ciag;
        }

        System.out.println("Podaj ciag liczb calkowitych: ");
        ciag = sc.nextInt();
    }
        if (i2 > 0) {
            int suma1 = min + max;
            double srednia = (double) suma1 / 2;

            System.out.println("Najmniejsza liczba: " + min);
            System.out.println("Najwieksza liczba: " + max);
            System.out.println("Suma najwiekszej i najmniejszej: " + suma1);
            System.out.println("Srednia najwiekszej i najmniejszej: " + srednia);
        } else {
            System.out.println("Nie podano zadnych liczb");
        }
    }

