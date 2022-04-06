package com.company;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//        int[] arr = new int[10];
////fill array with random numbers between 50 and 100
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50) + 50;
        }
////print array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
////find max value of array
//        int maxValue = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if (maxValue < arr[i]) {
//                maxValue = arr[i];
//            }
//        }
////find min value of array
////print max && min value of array
//        System.out.println("Max value is " + maxValue);
//
//    }
//    }


//        int[][] multiplyTable = new int[10][10];  //таблица пифагора с массивом
//
//        for (int i = 0; i < 10; i++) {
//        for (int j = 0; j < 10; j++) {
//        multiplyTable[i][j] = (i + 1) * (j + 1);
//        // используем символ табуляции
//        System.out.print(multiplyTable[i][j] + "\t");
//        }
//        System.out.println();
//        }
//        }
//        }



        /*for (int i=1; i<11; i++){               // 1 задание
            System.out.println(i);
        }*/
        /*int b=0;                                // 2 задание
        for (int a=1; a<=10; a++){
            b+=a;
            System.out.println(b);
        }*/
        /*Scanner number = new Scanner(System.in);  //3 задание
        int num = number.nextInt();
        int i=0;
        for (int a =1; a<=10; a++){
            i = num*a;
            System.out.println(num + "*" + a+ "="+ i);
        }*/

        /*Scanner number = new Scanner(System.in); //4 задача
        int fact = number.nextInt();
        int b=1;
        for (int a=1; a<=fact; a++){
            b*=a;
            System.out.println(b);
        }*/

        /*Scanner number = new Scanner(System.in); //5 задание
        int a = number.nextInt();
        int b = number.nextInt();
        int d = 1;
        for (int c = 0; c<b; c++){
            d = d*a;
            System.out.println(d);
        }*/

//        Scanner scanner = new Scanner(System.in); // 6 задание
//        System.out.println("Enter number: ");
//        int input = scanner.nextInt();
//        int a = 0;
//        while (input !=0) {
//            int b= input%10;
//            a=a*10+b;
//            input/=10;
//        }
//        System.out.println(a);
//    }
//}
//        Scanner scanner = new Scanner(System.in); // 6 задание
//        System.out.println("Enter your number: ");
//        int input = scanner.nextInt();
//        int a=0;
//        for (; input !=0; input/=10) {
//            int b=input%10;
//            a=a*10+b;
//        }
//        System.out.println(a);
//    }
//}
//        int[] array = new int[]{12,55,66,77,36,101,80,92,47}; // 7 задание
//        for (int i=0; i< array.length; i++) {
//            if (array[i]%2==0) {
//                System.out.print(array[i]+" ");
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]%2 !=0){
//                System.out.print(array[i]+" ");
//            }
//        }
//
//    }
//}


//        int simple=100;                           // 8 задание
//        boolean isPrime = true;
//        for (int i = 1; i <100; i++) {
//
//            if (input%1 ==0){
//                System.out.println(input + " is positive integer");
//            }else {
//                System.out.println(input+" is simple number");
//            }
//        }
//
//    }


//}
//        Scanner scan = new Scanner(System.in);// 8 задание
//        int remainder;
//        boolean isPrime=true;
//        int numberToCheck = scan.nextInt();
//        for(int i=2;i<=numberToCheck/2;i++) {
//            remainder=numberToCheck%i;
//            if(remainder==0) {
//                isPrime=false;
//                break;
//            }
//        }if(isPrime)
//            System.out.println(numberToCheck + " is a Prime number");
//        else
//            System.out.println(numberToCheck + " is not a Prime number");
//    }
//}
//        Scanner scan = new Scanner(System.in); // 9 задание
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int counter=0;
//        for (int i = 1; i<=a && i <=b; i++) {
//            if (a%i==0 && b%i==0) {
//                counter = i;
//            }
//        }
//        System.out.println(counter);
//    }
//}


//}
        Scanner scan = new Scanner(System.in);// 10 задание
        Scanner scan1 = new Scanner(System.in);
        boolean k=true;
        do {
            System.out.println("Enter number: ");
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a+b);
            System.out.println("Again?");
            String answer = scan1.nextLine();
            if (answer.equals("Yes")){
                k=true;
            }else if(answer.equals("No")){
                System.out.println("Bye");
                break;
            }
        }while (k); {

    }

  }


//        Random number = new Random();
//        int[] intArray = new int[10];
//        for (int i = 1; i < intArray.length; i++) {
//            intArray[i] = number.nextInt(50, 100);
//            System.out.println(intArray[i]);
//            intArray[0] = min;
//            if(intArray[i]<min) {
//                min = intArray[i];
//                int max = 0;
//                if (intArray[i] > max) {
//                    max = intArray[i];
//                }
//                System.out.print("min" +min);
//                System.out.print("max" +max);
//            }}


//    int [] mas = new int[12];
//    int maxNumber = -16;
//    int maxIndex = 0;
//
//        for (int i = 0; i < mas.length; i++) {
//        mas[i] = (int)(Math.random()*31)-15;
//        if(maxNumber <= mas[i]){
//            maxNumber = mas[i];
//            maxIndex = i;
//        }
//    }
//
//        System.out.println("Индекс максимального элемента: " + maxIndex);


        /*Scanner number = new Scanner(System.in);// homework 6-1
        System.out.println("Please enter the number:");
        int a = number.nextInt();
        int fact = 1;
        for (int i = 1; i<=a; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + " is = " +fact);*/


//        Random number = new Random();
//        int[] intArray = new int[10];
//        int shet = 0;
//        for (int i =1; i<intArray.length; i++) {
//            intArray[i] = number.nextInt(10);
//            shet+=intArray[i];
//            System.out.print(intArray[i] + " ");
//        }
//        System.out.println();
//        System.out.println(shet);
//        System.out.println(shet/intArray.length);

//        int[] intArray = new int[10];//homework7-1
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        intArray[3] = 4;
//        intArray[4] = 5;
//        intArray[5] = 6;
//        intArray[6] = 7;
//        intArray[7] = 8;
//        intArray[8] = 9;
//        intArray[9] = 10;
//        for (int i = 1; i < intArray.length; i++) {
//            if (intArray[i]%2 ==0) {
//                System.out.print(intArray[i]+" ");
//            }
//        }

        /*Scanner scan = new Scanner(System.in); //Пример цикла и разница между do-while
        int value = scan.nextInt();
        System.out.println("Enter the number:");
        while (value!=5){
            value = scan.nextInt();
            System.out.println("Enter the number:");
        }
        System.out.println("Number is " +value );*/

        /*Scanner scan = new Scanner(System.in);//Пример цикла и разница между while
        int value;
        do {
            System.out.print("Enter the number:");
            value = scan.nextInt();
        }
        while (value!=5); {
            System.out.println("The number is " + value);
        }*/


        //System.out.println(input);
//        int result=0;
//        for (int i = 0; i <= 100; i++) {
//            if (i%3 ==0) {
//                System.out.println(i+" ");







