import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

//    boolean warunek = true;
//
//    if(!warunek){
//        System.out.println("Warunek prawdziwy");
//    }else {
//        System.out.println("Warunek nieprawdziwy");
//    }
//
//    int liczba1 = 5;
//    int liczba2 = 5;
//
//    if(liczba1 > liczba2){
//        System.out.println(liczba1 + " jest większa od " + liczba2);
//    }else if(liczba1 == liczba2){
//        System.out.println("Liczby są równe");
//    }else {
//        System.out.println(liczba2 + " jest większa od " + liczba1);
//    }
//
//    if(liczba1 != liczba2){
//        System.out.println("Liczby " + liczba1 + " i " + liczba2 + " są różne");
//    }
//
//    String napis1 = "napis";
//    String napis2 = "napis";
//
//    if(napis1.equals(napis2)){
//        System.out.println("Napisy są takie same");
//    }
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj liczbę: ");
//    int liczba = sc.nextInt();
//
//    switch (liczba){
//        case 0:
//            System.out.println("Zmienna ma wartość 0");
//            break;
//        case 5:
//            System.out.println("Zmienna ma wartość 5");
//            break;
//        default:
//            System.out.println("Zmienna nie ma wartości ani 0 ani 5");
//    }
//
//    boolean wyrazenie1 = true && true; // 1 && 1 -> 1
//    boolean wyrazenie2 = false || false; // 0 || 0 -> 0
//    System.out.println(wyrazenie1);

    //Logowanie
//    String login, haslo;
//    login = "user";
//    haslo = "psswd";
//
//    String loginPodany, hasloPodane;
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Podaj login: ");
//    loginPodany = sc.nextLine();
//    System.out.println("Podaj hasło: ");
//    hasloPodane = sc.nextLine();
//
//    if(login.equals(loginPodany) && haslo.equals(hasloPodane)){
//        System.out.println("Udało się! Jesteś zalogowany");
//    }else if(login.equals(loginPodany)&& !haslo.equals(hasloPodane)){
//        System.out.println("Złe haslo");
//    }else {
//        System.out.println("Zły login lub hasło");
//    }


    String poraRoku = "Lato";
    String tlumaczenie = switch (poraRoku) {
        case "Wiosna":
            yield "Spring"; // case "Wiosna" -> "Spring";
        case "Lato":
            yield "Summer";
        case "Jesień":
            yield "Autumn";
        case "Zima":
            yield "Winter";
        default:
            yield "Nieznane słowo";
    };
    System.out.println(tlumaczenie);

    String temperatura = switch (poraRoku) {
      case "Wiosna", "Lato" -> "ciepło";
      case "Jesień", "Zima" -> "zimno";
        default -> "wartość nieznana";
    };
    System.out.println(temperatura);

    // operator warunkowy trójargumentowy (warunek) ? tak : nie
    int liczba =  10;
    String wynik = (liczba > 0) ? "Dodatnia" : "Ujemna lub 0";
}
