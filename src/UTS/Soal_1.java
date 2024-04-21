/* Tulis program dalam bahasa Java yang secara acak menghasilkan bilangan bulat antara 
1 dan 12 dan menampilkan nama bulan bahasa Indonesia Januari, Februari, …, 
Desember untuk nomor 1, 2, …, 12, yang sesuai. */
import java.util.Random;

public class Soal_1 {
    public static void main(String[] args) {
        // Membuat objek Random
        Random random = new Random();

        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int randomNumber = random.nextInt(12) + 1;

        // Mengonversi nomor bulan menjadi nama bulan dalam bahasa Indonesia
        String namaBulan;
        namaBulan = switch (randomNumber) {
            case 1 -> "Januari";
            case 2 -> "Februari";
            case 3 -> "Maret";
            case 4 -> "April";
            case 5 -> "Mei";
            case 6 -> "Juni";
            case 7 -> "Juli";
            case 8 -> "Agustus";
            case 9 -> "September";
            case 10 -> "Oktober";
            case 11 -> "November";
            case 12 -> "Desember";
            default -> "Bulan tidak valid";
        };

        // Menampilkan nama bulan
        System.out.println("Nomor bulan: " + randomNumber);
        System.out.println("Nama bulan: " + namaBulan);
    }
}

    
    

