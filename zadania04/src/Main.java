//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //zad 1
    int[] tablica1 = new int[10];
    int[] tablica2 = new int[9];
    for (int i = 0; i < tablica1.length; i++) {
        tablica1[i] = i * 2;
        System.out.println("Kolejna komorka to: " + tablica1[i]);
    }
    for (int i1 = 0; i1 < tablica2.length; i1++) {
        tablica2[i1] = i1 * 2 + 1;
        System.out.println("Kolejna komorka to: " + tablica2[i1]);
    }
    //zad 2
    int najwieksza = 1;
    int[] tablica3 = new int[10];
    for (int i2 = 0; i2 < tablica3.length; i2++) {
        tablica3[i2] = i2 * 5;
        if (najwieksza < tablica3[i2]) {
            najwieksza = tablica3[i2];
        }

    }
    System.out.println("Najwieksza komorka to: " + najwieksza);

//zad 3

    String[] slowa = {"czesc", "lol", "pa", "java"};

    for (String słowo : slowa) {
        System.out.println(słowo.toUpperCase());


    }


    //zad 4
    Scanner sc = new Scanner(System.in);
    String[] slowa4 = new String[5];

    System.out.println("Podaj 5 słów:");
    for (int i3 = 0; i3 < 5; i3++) {
        slowa4[i3] = sc.nextLine();
    }

    System.out.println("Wynik:");
    for (int i4 = 4; i4 >= 0; i4--) {
        String odwrócone = new StringBuilder(slowa4[i4]).reverse().toString();
        System.out.print(odwrócone + (i4 > 0 ? ", " : ""));
    }
    System.out.println();

    //zad 5
    int[] liczby = new int[8];

    System.out.println("Podaj 8 liczb:");
    for (int i = 0; i < 8; i++) {
        liczby[i] = sc.nextInt();
    }

    Arrays.sort(liczby);

    System.out.println("Posortowane liczby:");
    for (int i = 0; i < liczby.length; i++) {
        System.out.print(liczby[i] + (i < liczby.length - 1 ? ", " : ""));
    }
    System.out.println();




}
