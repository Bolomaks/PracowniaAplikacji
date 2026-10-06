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
    System.out.println("Pierwiastek liczby to: "+liczba3(4));

    //zad 8
    liczby2(3,4,5);
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
public double liczba3(int a4){
    return Math.sqrt(a4);
}
public void liczby2(int c, int d, int e){

    if(c>=d){
        if(c>=e){
            if((d*d)+(e*e)==c*c){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }

        }else if(e>=c){
            if((d*d)+(c*c)==e*e){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }
        }
    }else if(d>=c){
        if(d>=e){
            if((c*c)+(e*e)==d*d){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }
        }else if(e>=d){
            if((d*d)+(c*c)==e*e){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }
        }
    }else if(e>=d){
        if(e>=c){
            if((d*d)+(c*c)==e*e){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }
        }else if(c>=e){
            if((d*d)+(e*e)==c*c){
                System.out.println("Mozna zbudowac trójkąt prostokątny");
            }else{
                System.out.println("Nie mozna zbudowac trójkąta prostokątnego");
            }
        }
    }
}
