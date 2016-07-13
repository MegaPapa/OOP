/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_tasks;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class OOP_tasks {

    private static void callTArray(){
        TArray<Integer> arr = new TArray<>();
        arr.add(14);
        arr.add(11);
        arr.add(9);
        arr.add(10,11);
        arr.delete(1);
        System.out.println(arr.find(10));
        //arr.sort(); - не работает
        System.out.println(arr.get(0) + " " + arr.get(1) + " " + arr.get(2) + " " + arr.get(11));
        System.out.println(arr.getReserved() + " " + arr.getSize());
        System.out.println("------------------------");
        arr.clear();
        arr.add(6,3);
        arr.add(7,5);
        arr.add(14,100);
        System.out.println(arr.get(0) + " " + arr.get(3) + " " + arr.get(5) + " " + arr.get(100));
    }
    
    public static void main(String[] args) {
        System.out.println("1 - TArray; 2 - ");
        System.out.println("Input type number: ");
        Scanner in = new Scanner(System.in);
        int command = in.nextInt();
        switch (command){
            case 1:
                callTArray();
                break;
            case 2:
                
                break;
        }
    }
    
}
