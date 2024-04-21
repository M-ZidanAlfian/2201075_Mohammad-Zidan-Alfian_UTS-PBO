package UTS;

public class Main_soal4 {
    public static void main(String[] args) {
        LimasSegiempat limasSegiempat1 = new LimasSegiempat(1, 1, 1);
        System.out.printf("Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.1f, sedangkan volumenya : %.2f%n", 
                          limasSegiempat1.getLuasAlas(), limasSegiempat1.getLuasSelubungLimas(), limasSegiempat1.getTinggi(),
                          limasSegiempat1.hitungLuas(), limasSegiempat1.hitungVolume());

        LimasSegiempat limasSegiempat2 = new LimasSegiempat(30, 40, 50);
        System.out.printf("Limas segi empat dengan luas alas : %.1f, luas selubung limas : %.1f dan tinggi : %.1f. Luasnya : %.1f, sedangkan volumenya : %.2f%n", 
                          limasSegiempat2.getLuasAlas(), limasSegiempat2.getLuasSelubungLimas(), limasSegiempat2.getTinggi(),
                          limasSegiempat2.hitungLuas(), limasSegiempat2.hitungVolume());
        
        LimasSegiempat limasSegiempat3 = new LimasSegiempat(25, 35, 45);
        System.out.printf("Limas segi empat dengan luas alas : %.2f, luas selubung limas : %.2f dan tinggi : %.2f. Luasnya : %.2f, sedangkan volumenya : %.2f%n", 
                          limasSegiempat3.getLuasAlas(), limasSegiempat3.getLuasSelubungLimas(), limasSegiempat3.getTinggi(),
                          limasSegiempat3.hitungLuas(), limasSegiempat3.hitungVolume());
    }
}
