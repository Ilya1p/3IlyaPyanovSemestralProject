import java.util.Scanner;
import java.util.ArrayList;
public class Sem {
    public static void main(String[] args) {
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


