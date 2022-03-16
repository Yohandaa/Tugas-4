package com.sda.tugas4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class soal {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("TUGAS 4 STRUKTUR DATA DAN ALGORITMA");
        System.out.println("            QUEUE            ");
        System.out.println("-----------------------------------\n");

        Integer angka;
        int i=0;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        
        Scanner inputan = new Scanner(System.in);

        System.out.println("Menu Pilihan");
        System.out.println("-------------");

        do{
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. Menampilkan Elemen Paling Depan");
            System.out.println("4. Apakah Queue kosong? ");
            System.out.println("5. Tampilkan Queue");
            System.out.println("6. Selesai");
            System.out.print("Masukan Pilihan [1-6]: ");
            int input=inputan.nextInt();
            switch(input){
                case 1:
                    System.out.print("Banyak data yang akan di ENQUEUE: ");
                    i=0;
                    int h=inputan.nextInt();
                    do{
                        System.out.print("Masukan angka: ");
                        angka=inputan.nextInt();
                        antrian.add(angka);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Mengambil elemen: "+antrian.poll()); 
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Elemen paling depan: "+antrian.peek()); 
                    System.out.println("");
                    break;

               case 4:
                    System.out.println("Memeriksa Apakah Stack Kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 6:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan tidak Ditemukan!");
                System.out.println("");
            }
        }
        while(bool);
    }
}