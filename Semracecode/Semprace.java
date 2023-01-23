import java.util.ArrayList;
import java.util.Scanner;
/**
 * This class demonstrates documentation comments.
 * @author Ilya Pyanov
 */

public class Semprace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vyberte prace. 1 - Vanocni uloha, 2 - Semestralni");
        int n = sc.nextInt();
        if (n==1){
            vanoce();
        
        
        }else if(n==2){
            
            semPrace();
    
        }
        else{
            System.out.println("Nespravny simbol");
        }
    }
 public static void vanoce() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Zadejte velikost snehulaka (min - 1) a jeho jmeno v jednim radku. Napr. - 1 Snehulak");
     int a = sc.nextInt();
     sc.nextLine();
     System.out.println("Zadejte jmeno snehulaka");
     String jmeno = sc.nextLine();

     int x = 4;
     int y = 2;

     x *= a;
     y *= a;


     for (int k = 0; k<y*2.25;k++){
         System.out.print(" ");
     }
     System.out.print(".+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+.");
     System.out.println("");

     for(int i = 0; i<y-1; i++){
         for (int k = 0; k<y*2.25;k++){
             System.out.print(" ");
         }
         for(int j = 0; j<x; j++) {
             System.out.print("*");
         }
         System.out.println("");
     }
     for (int k = 0; k<y*2.25;k++){
         System.out.print(" ");
     }
     System.out.print("'+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+'");
     System.out.println("");


     x *= 1.5;
     y *= 1.5;

     for (int k = 0; k<y*1.2;k++){
         System.out.print(" ");
     }
     System.out.print(".+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+.");
     System.out.println("");

     for(int i = 0; i<y-1; i++){
         for (int k = 0; k<y*1.2;k++){
             System.out.print(" ");
         }
         for(int j = 0; j<x; j++) {
             System.out.print("*");
         }
         System.out.println("");
     }
     for (int k = 0; k<y*1.2;k++){
         System.out.print(" ");
     }
     System.out.print("'+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+'");
     System.out.println("");

     x *= 1.5;
     y *= 1.5;

     for (int k = 0; k<y*0.5;k++){
         System.out.print(" ");
     }
     System.out.print(".+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+.");
     System.out.println("");

     for(int i = 0; i<y-1; i++){
         for (int k = 0; k<y*0.5;k++){
             System.out.print(" ");
         }
         for(int j = 0; j<x; j++) {
             System.out.print("*");
         }
         System.out.println("");
     }
     for (int k = 0; k<y*0.5;k++){
         System.out.print(" ");
     }
     System.out.print("'+");
     for(int i = 0; i<x-4; i++){
         System.out.print("*");
     }
     System.out.print("+'");
     System.out.println("");

     System.out.format("Ahoj! Ja jsem %s!", jmeno);
 }
    /**
     * 	Kontrola chce-li uživatel pokračovat
     * 	Načist od uživatele první a druhou posloupnost ve dinamické matici
     * 	Pomocí ciklům a funkci srovnává dvě posloupnosti
     * 	Jestli tě posloupnost nemá sekvence tak v odpovědi se napíše že Sekvence nenalezna. Jestli posloupnost má sekvence tak napiše číslo odkud se ona začiná
     * 	Vratí se k kontrole chce-li uživatel pokračovat
     */
 public static void semPrace(){
     Scanner sc = new Scanner(System.in);
     String vstup;// pomoci command String dela "promenu"

//promeny
     while(true){
         int i = 0;
         int k = 0;
         int j = 0;
         int pozice = 0;
         boolean res = false;
         System.out.println(" ");
         System.out.println("Pokracovat ve zpracovani (a/n): ");
         vstup = sc.nextLine();
//kontrola chce-li uzivatel pokracovat
//zacatek hlavni castiprogramy
         if((vstup.equalsIgnoreCase("a"))||(vstup.equalsIgnoreCase("A"))){
             System.out.println("Zadej posloupnost: ");
             ArrayList<Integer> sek1 = new ArrayList<>();//dinamicka matice
             ArrayList<Integer> sek2 = new ArrayList<>();
             while(true){
                 int n = sc.nextInt();
                 if(n<0){
                     break;
                 }
                 sek1.add(i, n);//(i0 добавляется число n читаем н оно становитсья +1) cteni matice
                 i++;
             }
             //druha posloupnost
             System.out.println("Hledana sekvence:  ");
             while(true){
                 int n = sc.nextInt();
                 if(n<0){
                     break;
                 }
                 sek2.add(k, n);
                 k++;
             }


             for (int l = 0; l < sek1.size() ; l++) {
                 pozice = l;
                 for (j = 0; j < sek2.size() ; j++) {

                     if ((sek1.get(l).equals(sek2.get(j)))) {//get nacitani prvku z pozice l a jчисло превой и второй последовательности
                         //equals funkce pro srovnani сли совпадают то результат тру и л повышается на 1
                         res = true;
                         l++;
                     } else if ((res) && !(sek1.get(l).equals(sek2.get(j)))) {//если не равны обратная операция
                         res = false;
                         l--;
                         break;
                     } else {//если не прошло первое и второе то выходит это
                         res = false;
                         break;
                     }
                 }
                 if ((j == sek2.size()) && (res)) {//проверка если джей равна размеру второго массива то позиция увел
                     //выводит налезену позицию
                     pozice++;
                     System.out.println("Sekvence nalezena na pozici " + pozice);
                     break;
                 }
             }


             if(!res){
                 System.out.println("Sekvence nenalezena ");
             }
         }

         else if((vstup.equalsIgnoreCase("n"))||(vstup.equalsIgnoreCase("N"))){// заканчивает программу
             break;
         }
     }
 }
 }
