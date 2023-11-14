package ex1;
import java.util.ArrayList;
import java.util.Collections;
public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> studenti = new ArrayList<String>();
        studenti.add("Eugen");
        System.out.println(studenti.get(0));
        studenti.remove(0);
    }
}