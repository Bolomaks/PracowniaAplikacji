//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //zad 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbę całkowitą dodatnią: ");
    int liczba = sc.nextInt();
    int i = 1;

while(i<=liczba){
    System.out.println(i);
    i+=2;
}

//zad 2
    System.out.println("Podaj liczbe całkowitą dodatnia n: ");
    int n = sc.nextInt();
    int i1 = 0;
    int wynik = 2;
    while(wynik<n){
        System.out.println(wynik);
        wynik *= 2;
        i1++;
    }

}
