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
    for (int i5 = 0; i5 < 8; i5++) {
        liczby[i5] = sc.nextInt();
    }

    Arrays.sort(liczby);

    System.out.println("Posortowane liczby:");
    for (int i6 = 0; i6 < liczby.length; i6++) {
        System.out.print(liczby[i6] + (i6 < liczby.length - 1 ? ", " : ""));
    }
    System.out.println();

//zad 6

    int[] liczby3 = new int[5];

    System.out.println("Podaj 5 liczb:");
    for (int i7 = 0; i7 < 5; i7++) {
        liczby3[i7] = sc.nextInt();
    }

    for (int l : liczby3) {
        long silnia = 1;
        for (int i8 = 1; i8 <= l; i8++) {
            silnia *= i8;
        }
        System.out.println("Silnia z " + l + " wynosi: " + silnia);
    }

    //zad 7
    String[] tablica4 = {"kot", "pies", "chomik"};
    String[] tablica5 = {"kot", "pies", "chomik"};

    boolean takiesame = Arrays.equals(tablica4, tablica5);

    if(takiesame){
        System.out.println("Tablice są takie same");
    }else{
        System.out.println("Tablice nie są takie same");
    }


    //zad 8

    int[] tablica6 = new int[10];
    Random random = new Random();


    for (int i8 = 0; i8 < tablica6.length; i8++) {
        tablica6[i8] = random.nextInt(21) - 10;
    }

    System.out.println("Tablica: ");
   for(int n : tablica6){
       System.out.print(n + " ");
   }
    System.out.println();

    int min = tablica6[0];
    int max = tablica6[0];
    int suma = 0;

    for (int n1 : tablica6) {
        if (n1 < min) min = n1;
        if (n1 > max) max = n1;
        suma += n1;
    }

    double srednia = (double) suma/ tablica6.length;


    int mniejsze = 0;
    int wieksze = 0;
    for (int n2 : tablica6) {
        if (n2 < srednia) mniejsze++;
        if (n2 > srednia) wieksze++;
    }

    System.out.println("Najmniejszy element: " + min);
    System.out.println("Największy element: " + max);
    System.out.println("Średnia arytmetyczna: " + srednia);
    System.out.println("Elementów mniejszych od średniej: " + mniejsze);
    System.out.println("Elementów większych od średniej: " + wieksze);

    System.out.print("Tablica w odwrotnej kolejności: ");
    for (int i9 = tablica6.length - 1; i9 >= 0; i9--) {
        System.out.print(tablica6[i9] + " ");
    }
    System.out.println();

//zad 9
    int[] tablica7 = new int[20];

    for (int i10 = 0; i10 < tablica7.length; i10++) {
        tablica7[i10] = random.nextInt(10) + 1;
    }

    System.out.print("Wygenerowana tablica: ");
    for (int n4 : tablica7) {
        System.out.print(n4 + " ");
    }
    System.out.println();


    int[] zliczenia = new int[11];
    for (int n5 : tablica7) {
        zliczenia[n5]++;
    }


    for (int i11 = 1; i11 <= 10; i11++) {
        System.out.println("Liczba " + i11 + " powtarza się " + zliczenia[i11] + " razy.");
    }

}
