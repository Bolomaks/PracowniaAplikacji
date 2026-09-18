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

    if(liczba4 >= liczba5){
        System.out.println(liczba4 + " jest największa");
    }else{
        System.out.println(liczba5 + " jest największa");
    }

    //zad 4
    Scanner sc6 = new Scanner(System.in);
    System.out.println("Napisz pierwsza liczbe: ");
    int liczba6 = sc6.nextInt();
    Scanner sc7 = new Scanner(System.in);
    System.out.println("Napisz druga liczbe: ");
    int liczba7 = sc7.nextInt();
    Scanner sc8 = new Scanner(System.in);
    System.out.println("Napisz trzecia liczbe: ");
    int liczba8 = sc8.nextInt();

    if(liczba6>=liczba7){
        if(liczba6>=liczba8){
            System.out.println(liczba6 + " jest największa");
        }else{
            System.out.println(liczba8 + " jest największa");
        }
    }else if(liczba7>=liczba6){
        if(liczba7>=liczba8){
            System.out.println(liczba7 + " jest największa");
        }else{
            System.out.println(liczba8 + " jest największa");
        }
    }else if(liczba8>=liczba6){
        if(liczba8>=liczba7){
            System.out.println(liczba8 + " jest największa");
        }else{
            System.out.println(liczba7 + " jest największa");
        }
    }

    //zad 5
    Scanner sc9 = new Scanner(System.in);
    System.out.println("Podaj numer miesiąca: ");
    int miesiac = sc9.nextInt();

    String poraRoku = switch (miesiac){
        case 1:
            yield "Styczeń";
        case 2:
            yield "Luty";
        case 3:
            yield "Marzec";
        case 4:
            yield "Kwiecień";
        case 5:
            yield "Maj";
        case 6:
            yield "Czerwiec";
        case 7:
            yield "Lipiec";
        case 8:
            yield "Sierpień";
        case 9:
            yield "Wrzesień";
        case 10:
            yield "Październik";
        case 11:
            yield "Listopad";
        case 12:
            yield "Grudzień";
        default:
            yield "Nieprawidłowy numer miesiąca";
    };
    System.out.println(poraRoku);

    //zad 6
    Scanner sc10 = new Scanner(System.in);
    System.out.println("Podaj Imie: ");
    String imie = sc10.next();

    if(imie.equals("Maks")){
        System.out.println("Mamy takie samo imie");
    }else {
        System.out.println("Mamy inne imiona");
    }

    //zad 7
    Scanner sc11 = new Scanner(System.in);
    System.out.println("Podaj Wiek: ");
    int wiek = sc11.nextInt();

    boolean pelnoletni = wiek >=18 ? true : false;

    System.out.println("Czy jest pełnoletni: "+pelnoletni);


//zad 8
    Scanner sc12 = new Scanner(System.in);
    System.out.println("Podaj rok: ");
    int rok = sc12.nextInt();

    boolean przestepny = rok % 400 == 0;
    if(przestepny == true){
        System.out.println("Rok jest przestepny");
    }else{
        System.out.println("Rok nie jest przestepny");
    }
    // zad 9
    Scanner sc13 = new Scanner(System.in);
    System.out.println("Podaj wage: ");
    double waga = sc13.nextDouble();

    System.out.println("Podaj wzrost: ");
    double wzrost = sc13.nextDouble();

    double BMI = waga/(wzrost*wzrost);

    if(BMI>=18.5 && BMI<=24.9){
        System.out.println("Waga prawidłowa");
    }else if(BMI<18.5){
        System.out.println("Niedowaga");
    }else if(BMI>24.9){
        System.out.println("Nadwaga");
    }

    //zad 10
    System.out.println("Podaj cene towaru: ");
    double cenaTowaru = sc13.nextDouble();
    System.out.println("Podaj liczbe rat: ");
    int raty = sc13.nextInt();

    double oprocentowanie;
    if(cenaTowaru<100){
        System.out.println("Podaj cene towaru wieksza od 100: ");
    }else if(cenaTowaru>10000){
        System.out.println("Podaj cene towaru mniejsza od 10000: ");
    }

        if(raty<6){
            System.out.println("Podaj liczbe rat wieksza od 6: ");
        }else if(raty >48){
            System.out.println("Podaj liczbe rat mniejsza od 48: ");
        }else{
            if(raty>=6 && raty <=12){
                System.out.println("Rata na miesiac wynosi: "+(cenaTowaru + cenaTowaru*0.025)/raty);
            }else if(raty>=13 && raty<=24){
                System.out.println("Rata na miesiac wynosi: "+(cenaTowaru + cenaTowaru*0.05)/raty);
            }else if(raty>=25 && raty<=48){
                System.out.println("Rata na miesiac wynosi: "+(cenaTowaru + cenaTowaru*0.1)/raty);
            }
        }





    //zad 11
    System.out.println("To jest prosty kalkulator, wykonuje on operacje dodawania, odejmowania, mnożenia i dzielenia dwóch liczb rzeczywistych Podaj pierwsza liczbę: ");
    double PierwszaLiczba = sc13.nextDouble();
    System.out.println("Podaj symbol operacji arytmetycznej: ");
    String Symbol = sc13.next();
    System.out.println("Podaj drugą liczbę: ");
    double DrugaLiczba = sc13.nextDouble();

    if (Symbol.equals("/")) {
        if (DrugaLiczba == 0) {
            System.out.println("Nie dzielimy przez 0");
        } else {
            System.out.println("Wynik to: " + (PierwszaLiczba / DrugaLiczba));
        }
    }else if(Symbol.equals("*")){
            System.out.println("Wynik to: "+(PierwszaLiczba*DrugaLiczba));
        }else if(Symbol.equals("-")){
        System.out.println("Wynik to: "+(PierwszaLiczba-DrugaLiczba));
    }else if(Symbol.equals("+")){
        System.out.println("Wynik to: "+(PierwszaLiczba+DrugaLiczba));
    }else{
        System.out.println("Niepoprawny symbol");
    }





}
