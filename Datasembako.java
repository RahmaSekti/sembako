/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.datasembako;

import java.util.Scanner;


public class Datasembako {

    public static void main(String[] args) {
        Scanner inputLine = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
//        Nama sembako, tangggal datang(12/12/2022), tanggak expired, stok, harga
        String dataSembako [][]= new String[100][5];
        
        int totalData;
        System.out.println("Berapa jumlah data yang ingin anda input ?");
        totalData = input.nextInt();
        for (int i = 0; i < totalData; i++) {
            System.out.println("Input data ke " + (i+1) + " : ");
            System.out.println("Input nama sembako : ");
            dataSembako[i][0] = inputLine.nextLine();
            System.out.println("Input tanggal datang :");
            dataSembako[i][1] = input.next();
            System.out.println("Input tanggal Expired : ");
            dataSembako[i][2] = input.next();
            System.out.println("Input Stok yang tersedia : ");
            dataSembako[i][3] = input.next();
            System.out.println("Input Harga : ");
            dataSembako[i][4] = input.next();
        }
        
        System.out.println("List data sembako di gudang : ");
        for (int i = 0; i < totalData; i++) {
            System.out.print((i+1) + ". ");
            for (int j = 0; j < 5; j++) {
                System.out.print(dataSembako[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}


