public class Bukumain07 {
    public static void main(String[] args) {
        
        Buku07 bk1 = new Buku07();
        
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
    
    Buku07 bkchiko = new Buku07("Pemrograman Java", "Rizky", 300, 10, 100000);
    bkchiko.terjual(11);
    bkchiko.tampilInformasi();
    
    }
}