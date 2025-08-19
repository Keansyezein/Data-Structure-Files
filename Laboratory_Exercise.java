
package com.mycompany.laboratory_exercise;

public class Laboratory_Exercise {
        static String[] array_str = new String[5];
        static int[] array_int = new int[5];
    public static void main(String[] args) {
        
        array_str[0] = "Christian";
        array_str[1] = "Abegel";
        array_str[2] = "Sam";
        array_str[3] = "Robin";
        array_str[4] = "Jefferson";
        int idx = 0;
        
        System.out.println("Task 1:");
        for(String i: array_str){
            System.out.println(idx +  ": " + i);
            idx++;
        }
        
        
        array_int[0] = 1;
        array_int[1] = 2;
        array_int[2] = 3;
        array_int[3] = 4;
        array_int[4] = 5;
        int total = 0;
        
        System.out.println();
        System.out.println("Task 2");
        
        for(int i = 0; i < array_int.length; i++){
            total += array_int[i];
            
        }
        System.out.println("The total is: " + total);
    }
}
