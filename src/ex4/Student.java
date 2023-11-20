package ex4;
import java.util.Scanner;
import java.util.HashMap;
public class Student {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String,Integer> studenti = new HashMap<>();
        studenti.put("Eugen",10);
        studenti.put("Andreea",7);
        int optiune;
        do{
            System.out.println("1. Adaugati un student.\n2. Cautati un student.\n3. Iesire.");
            System.out.println("Introduceti optiunea:");
            optiune = scanner.nextInt();
            switch (optiune){
                case 1: {
                    System.out.println("Introduceti numele:");
                    String nume = scanner.next();
                    System.out.println("Introduceti nota:");
                    int nota = scanner.nextInt();
                    studenti.put(nume,nota);
                    break;
                }
                case 2: {
                    System.out.println("Introduceti numele studentului de cautat:");
                    String name = scanner.next();
                    if(studenti.containsKey(name)){
                        System.out.println("Studentul " + name + " are nota:" + studenti.get(name));
                    }
                    else {
                        System.out.println("Studentul nu exista");
                    }
                    break;
                }
                case 3: {
                    System.out.println("pa");
                    break;
                }
                default:{
                    System.out.println("Introdu o optiune valida.");
                }
            }
        }while(optiune!=3);
    }
}
