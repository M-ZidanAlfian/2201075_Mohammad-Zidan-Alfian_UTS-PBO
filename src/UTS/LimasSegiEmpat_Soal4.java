package UTS;

class LimasSegiempat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;
    
    public LimasSegiempat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }
    public LimasSegiempat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }
    public double getLuasAlas() {
        return this.luasAlas;
    }
    public double getLuasSelubungLimas() {
        return this.luasSelubungLimas;
    }
    public double getTinggi() {
        return this.tinggi;
    }
    public double hitungLuas() {
        return this.luasAlas + this.luasSelubungLimas;
    }
    public double hitungVolume() {
        return (1.0/3.0) * this.luasAlas * this.tinggi;
    }
    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }
    public void setLuasSelubungLimas(double luasSelubungLimas) {
        this.luasSelubungLimas = luasSelubungLimas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
