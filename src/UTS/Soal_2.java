/*Tulis sebuah program yang membaca sejumlah bilangan bulat yang tidak ditentukan, 
menentukan berapa banyak nilai positif dan negatif yang telah dibaca, dan menghitung 
total dan rata-rata nilai input (tidak termasuk nol). Program Anda diakhiri dengan 
input 0. Tampilkan rata-rata sebagai angka floating-point. Berikut adalah contoh 
running programnya*/

import java.util.Scanner;

public class Soal_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int positiveCount = 0;
            int negativeCount = 0;
            int total = 0;
            int count = 0;
            
            System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukan nilai 0:");
            
            while (true) {
                int number = scanner.nextInt();
                
                if (number == 0) {
                    break;
                } else if (number > 0) {
                    positiveCount++;
                } else {
                    negativeCount++;
                }
                
                if (number != 0) {
                    total += number;
                    count++;
                }
            }
            
            if (count == 0) {
                System.out.println("Tidak ada input.");
            } else {
                double average = (double) total / count;
                System.out.println("Jumlah bilangan positif adalah: " + positiveCount);
                System.out.println("Jumlah bilangan negatif adalah: " + negativeCount);
                System.out.println("Nilai total adalah: " + total);
                System.out.println("Nilai rata-rata adalah: " + average);
            }
        }
    }
}

  


    
    

