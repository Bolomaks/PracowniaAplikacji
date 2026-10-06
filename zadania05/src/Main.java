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