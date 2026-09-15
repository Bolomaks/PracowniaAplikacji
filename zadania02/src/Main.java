//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//zad 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Napisz liczbę: ");
    int liczba = sc.nextInt();

    if(liczba % 3 == 0){
        System.out.println("Liczba jest podzielna przez 3");
    }else {
        System.out.println("Liczba nie jest podzielna przez 3");
    }
// zad 2
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Napisz pierwsza liczbe: ");
    int liczba1 = sc1.nextInt();
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Napisz druga liczbe: ");
    int liczba2 = sc2.nextInt();
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Napisz trzecia liczbe: ");
    int liczba3 = sc3.nextInt();

    int wynik1 = liczba1 + liczba2;
    int wynik2 = liczba1 + liczba3;
    int wynik3 = liczba2 + liczba3;
    if(wynik1>liczba3 && wynik2>liczba2 && wynik3>liczba1){
        System.out.println("Da się zrobic trójkąt");
    }else{
        System.out.println("Nie da sie zrobic trójkąta");
    }

    //zad 3
    Scanner sc4 = new Scanner(System.in);
    System.out.println("Napisz pierwsza liczbe: ");
    int liczba4 = sc4.nextInt();
    Scanner sc5 = new Scanner(System.in);
    System.out.println("Napisz druga liczbe: ");
    int liczba5 = sc5.nextInt();

    if(liczba4 > liczba5){
        System.out.println(liczba4 + " jest największa");
    }else{
        System.out.println(liczba5 + " jest największa");
    }
}
