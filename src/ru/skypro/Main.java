package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] i1 = new int[3];
        i1[0] = 1;
        i1[1] = 2;
        i1[2] = 3;
        System.out.println(i1[1]);
        double [] i2 = { 1.57, 7.654, 9.986};
        System.out.println(i2[2]);
        char [] i3 = {'a', 'b', 'c', 'd', };
        System.out.println(i3[2]);

        for(int i = 0; i< i1.length;i++){
            if(i== i1.length - 1){
                System.out.println(i1[i]);
            }else{
                System.out.print(i1[i] + ",");
            }
        }
        for(int i = 0; i< i2.length;i++){
            if(i== i2.length - 1){
                System.out.println(i2[i]);
            }else {
                System.out.print(i2[i] + ",");
            }}

        for(int i = 0; i< i3.length;i++){
            if(i== i3.length - 1){
                System.out.println(i3[i]);
            }else {
                System.out.print(i3[i] + ",");
            }}



        for(int i = i1.length - 1; i>=0;i--){
            if(i== 0){
                System.out.println(i1[i]);
            }else {
                System.out.print(i1[i] + ",");
            }}

        for(int i = i2.length - 1; i>=0;i--){
            if(i== 0){
                System.out.println(i2[i]);
            }else {
                System.out.print(i2[i] + ",");
            }}

        for(int i = i3.length - 1; i>=0;i--){
            if(i== 0){
                System.out.println(i3[i]);
            }else {
                System.out.print(i3[i] + ",");
            }}


        for(int i = 0; i< i1.length; i++){
            if (i1[i] % 2 != 0){
                i1[i] = i1[i] + 1;
            }
        }
        System.out.println(Arrays.toString(i1));

    }
}
