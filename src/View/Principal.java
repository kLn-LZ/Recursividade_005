package View;

import java.util.*;

import Controller.Sequencia;

public class Principal {
    public static void main(String[] args) {


    Sequencia seq = new Sequencia();
    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    System.out.println(seq.fSeq(n));



    }


}
