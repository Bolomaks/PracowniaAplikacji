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

}
