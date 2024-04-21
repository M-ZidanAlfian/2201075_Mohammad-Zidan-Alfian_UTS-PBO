/*Tulis metode yang menghitung jumlah digit dalam 
bilangan bulat. Gunakan tajuk metode berikut :
public static int sumDigits(long n)
Misalnya, sumDigits(234) mengembalikan 9 (2 + 3 + 4). (Petunjuk: Gunakan operator 
% untuk mengekstrak digit, dan operator / untuk menghapus digit yang diekstraksi. 
Misalnya, untuk mengekstrak 4 dari 234, gunakan 234 % 10 (= 4). Untuk menghapus 
4 dari 234, gunakan 234 / 10 ( = 23). Gunakan loop untuk mengekstrak dan 
menghapus digit berulang kali hingga semua digit terekstraksi. Tulis program 
pengujian yang meminta pengguna memasukkan bilangan bulat dan menampilkan 
jumlah semua digitnya.*/

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        long number = scanner.nextLong();
        int sum = sumDigits(number);
        System.out.println("Jumlah digit dalam bilangan " + number + " adalah: " + sum);
    }
    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
