//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    system.out.println("Hello World"); // sout
    System.out.println("Cokolwiek");
    // komentarz jednoliniowy (ctrl+/)
    int calkowita=5;
            double rzeczywista=1.5;
            System.out.println("Wartość zmiennej calkowite to " + calkowita/2);
    System.out.println("Wartość zmiennej rzeczywista to " + rzeczywista);


    char litera= 97;
    string napis = "napis";
    System.out.println(litera);
    system.out.println(napis);

    boolean czyPrawda = true; //false
    system.out.println("Wartość 1+2+3= "+ (1 + 2 + 3));
    system.out.println(1 + 2 + 3 + " to wartość 1 + 2 + 3");

    System.out.println("Podaj wiek: ");

    Scanner sc = new Scanner(System.in);

    int wiek = sc.nextInt();
}
