package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here

        int a, b;
        System.out.println("Enter value 1 or 0 for Ground A");
        Scanner scanner  = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Enter value 1 or 0 for Ground B");
        Scanner scanner1  = new Scanner(System.in);
        b = scanner.nextInt();
        checkStatus(  a ,  b);
    }

    public static void checkStatus(int envA, int envB ){

        if (envA == 0){
            System.out.println("Ground A is clear");
            System.out.println("Machine move to right side");
        }else if(envB == 0){
            System.out.println("Ground B is clear");
            System.out.println("Machine move to left side");
        }else if (envA == 1){
            System.out.println("Ground A dustfull and now cleaning start");
            System.out.println("Machine move to right side");
        }else if(envB == 1){
            System.out.println("Ground B dustfull and now cleaning start");
            System.out.println("Machine move to left side");
        }else{
            System.out.println("Ground A and B dustless and clean");
            System.out.println("Machine state netural");
        }

    }
}
