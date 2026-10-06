//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //zad 1
    int wiek = wiek();
    System.out.println("Mój wiek: "+wiek);

    //zad 2
    imie();

    //zad 3
    dzialania(6,2);

    //zad 4
    liczba(2);

    //zad 5
    liczba1(15);

    //zad 6
    System.out.println("Liczba podniesiona do potegi 3: "+liczba2(4));

    //zad 7
}

public int wiek(){
    return 18;
}
public void imie(){
    System.out.println("Maks");
}
public void dzialania(int a,int b){
    System.out.println("Suma: "+(a+b));
    System.out.println("Różnica: "+(a-b));
    System.out.println("Iloczyn: "+(a*b));
}

public void liczba(int a1){
    if(a1%2==0) {
        System.out.println("true");;
    }
}
public void liczba1(int a2){
    if(a2%3==0 && a2%5==0){
        System.out.println("true");
    }
}
public int liczba2(int a3){
    return a3*a3*a3;
}