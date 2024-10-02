package def;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int t, n;
        Scanner cin = new Scanner(System.in);
        System.out.println("Quanti thread vuoi creare?\n -> ");
        t = cin.nextInt();
        String[] vect=new String[t];
        System.out.println("Qual è il valore massimo a cui contare?\n -> ");
        n = cin.nextInt();
        Random random = new Random();
        int x = random.nextInt(900)+100;
        Thread Prod, Cons;
        Buffer b=new Buffer();
        Produttore p=new Produttore(b, x);
        Consumatore c=new Consumatore(b);
        Prod=new Thread();
        Cons=new Thread();
        cin.close();
    }
}