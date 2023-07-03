package org.example;

import java.util.ArrayList;
import java.util.Random;

/*Пусть дан произвольный список целых чисел.

        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение*/
public class HW_3 {

    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
    }
    public static void task1() {

        ArrayList<Integer> nums = new ArrayList<>();
            nums.add(12); nums.add(1);
            nums.add(27); nums.add(22);
            nums.add(48); nums.add(16);
            nums.add(45); nums.add(69);
            System.out.println( "Список всех чисел: " + nums);
            nums.removeIf(num -> num % 2 == 0);

        System.out.println("Список без четных чисел: " + nums + "\n");
    }

    public static void task2() {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12); nums.add(1);
        nums.add(27); nums.add(22);
        nums.add(48); nums.add(16);
        nums.add(45); nums.add(69);
        System.out.println( "Список всех чисел: " + nums);

        int min = nums.get(0);
        for (int i = 0; i < nums.size() ; i++) {
           if (nums.get(i) < min){
               min = nums.get(i);
               System.out.println("Минимальное значение в списке: " + min + "\n");
           };
        }
    }
    public static void task3() {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12); nums.add(1);
        nums.add(27); nums.add(22);
        nums.add(48); nums.add(16);
        nums.add(45); nums.add(69);
        System.out.println( "Список всех чисел: " + nums);

        int max = nums.get(0);
        for (int i = 1; i < nums.size() ; i++) {
            if (nums.get(i) > max){
                max = nums.get(i);
            };
        } System.out.println("Максимальное число в списке: " + max + "\n");
    }

    public static void task4() {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12); nums.add(1);
        nums.add(27); nums.add(22);
        nums.add(48); nums.add(16);
        nums.add(45); nums.add(69);
        System.out.println( "Список всех чисел: " + nums);

        int sum = 0;
        for (int i = 0; i < nums.size() ; i++) {
            sum = sum + nums.get(i);
        } sum = sum/ nums.size();
        System.out.println("Среднее значение в списке: " + sum +  "\n");
    }

}
