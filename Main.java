import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Main {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int temp = 0;

        int M = 0;

        int L = 0 ;

        System.out.println("Number of numbers: ");
        int Numbers = scan.nextInt();

        System.out.println("1- Number?");

        int argon= scan.nextInt();

        M= argon;
        L= argon;

        for(int del = 2; del <= Numbers; del++){
            System.out.println(del+". Number?");

            temp = scan.nextInt();

            if(temp > M){
                M = temp;
                argon = L;
            }
            if(temp < M  && temp < argon){
                argon = temp;
            }

        }
        System.out.println(argon + "is the lowest and the biggest is: "+  M);
    }
}