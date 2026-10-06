//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //zad 1
    int wiek = wiek();
    System.out.println("Mój wiek: "+wiek);

    //zad 2
    imie();

    //zad 3
    System.out.println("Działania: "+dzialania(6,2));
}

public int wiek(){
    return 18;
}
public void imie(){
    System.out.println("Maks");
}
public int dzialania(int a,int b){
    int suma = a+b;
    return suma;
}