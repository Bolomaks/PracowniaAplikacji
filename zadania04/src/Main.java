//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    //zad 1
    int[] tablica1 = new int[10];
    int[] tablica2 = new int[9];
    for(int i = 0;i<tablica1.length;i++){
        tablica1[i] = i*2;
        System.out.println("Kolejna komorka to: "+tablica1[i]);
    }
    for(int i1 = 0;i1<tablica2.length;i1++){
        tablica2[i1] = i1*2+1;
        System.out.println("Kolejna komorka to: "+tablica2[i1]);
    }
    //zad 2
    int najwieksza = 1;
    int[] tablica3 = new int[10];
    for(int i2 = 0;i2<tablica3.length; i2++){
        tablica3[i2] = i2*5;
        if(najwieksza<tablica3[i2]){
            najwieksza=tablica3[i2];
        }

    }
    System.out.println("Najwieksza komorka to: "+najwieksza);





}
