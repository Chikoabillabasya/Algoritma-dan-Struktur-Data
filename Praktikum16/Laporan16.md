#
# <p align ="center"> LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA 16 </p>

<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="33%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama  : Chiko Abilla Basya </p>
<p align = "center"> NIM   : 2341720005 </p>
<p align = "center"> Kelas : 1B </p>
<p align = "center"> Prodi : D-IV Teknik Informatika</p>


<br><br><br><br><br>

#
# 16.2. Kegiatan Praktikum 1
Kode Program Class ContohList07
```java
package Praktikum16.Kode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList07 {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");

        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
        
        l.remove(0);

        l.add(4);

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhlema");
        names.add("Shanum");
        names.add("Wasis");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());
    }
}
```
Output : <br>
![alt text](<img/Screenshot Output percobaan 1.png>)
# 16.2.3. Pertanyaan Percobaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist? <br>
Jawab : karena menggunakan tipe mentah Object ketika tipe generik tidak ditentukan.<br>
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu! <br>
Jawab : 
```java
 List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n", l.get(0), l.size(), l.get(l.size() - 1));
```
3. Ubah kode pada baris kode 38 menjadi seperti ini <br>
Jawab : 
```java
LinkedList<string> names = new LinkedList<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya <br>
Jawab : 
```java
names.push("Mei-mei");
System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n", 
        names.getFirst(), names.size(), names.getLast());
system.out.println("Names: " + names.toString());
``` 
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan! <br>
Jawab : kode ini akan menampilkan konten terbaru dari daftar names dan menunjukkan bagaimana elemen dapat ditambahkan ke depan LinkedList dan bagaimana daftar diperbarui sesuai. Ini menunjukkan sifat dinamis dari LinkedList dan bagaimana ia mengelola elemennya dengan efisien.<br>
#
# 16.3. Kegiatan Praktikum 2
Kode Program Class LoopCollection07
```java
package Praktikum16.Kode;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection07 {
    public static void main(String[] args) {
        
        Stack<String> fruits = new Stack<>();
        
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());
        
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        System.out.println("\n"); 

        fruits.push("Melon");
        fruits.push("Durian");

        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n");

        fruits.stream().forEach(e -> System.out.printf("%s ", e));

        System.out.println("\n");
      
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
```
Output <br>
![alt text](<img/Screenshot Ouput percobaan 2.png>)
# 16.3.3. Pertanyaan Percobaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits? <br>
Jawab : <br>
* Fungsi push() digunakan untuk menambahkan elemen ke bagian atas (top) dari stack. Elemen yang ditambahkan akan menjadi elemen teratas setelah operasi push().
* Fungsi add() digunakan untuk menambahkan elemen ke akhir (end) dari list. Elemen yang ditambahkan akan menjadi elemen terakhir setelah operasi add().
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? <br>
Jawab : Elemen "Melon" dan "Durian" akan ditambahkan ke stack fruits. Ini terjadi karena metode push digunakan untuk menambahkan elemen ke puncak stack. <br>
3. Jelaskan fungsi dari baris 46-49? <br>
Jawab : untuk mencetak setiap elemen di stack fruits <br>
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian? <br>
Jawab : terjadi eror karena berubah menjadi arraylist <br>
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”! <br>
Jawab :
```java
 if (fruits.size() > 1) {
            fruits.set(1, "Strawberry");
        }

        System.out.println("\nAfter adding more fruits:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting! <br>
Jawab :
```java
fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        // Menampilkan elemen-elemen yang baru ditambahkan
        System.out.println("\nAfter adding more fruits:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
```
#
# 16.4. Kegiatan Praktikum 3
Kode Program Class Mahasiswa07
```java
package Praktikum16.Kode;

class Mahasiswa07 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa07(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String toString() {
        return "Mahasiswa{nim='" + nim + "', nama='" + nama + "', notelp='" + notelp + "'}";
    }
}
```
Kode Program Class ListMahasiswa07
```java
package Praktikum16.Kode;

import java.util.ArrayList;

public class ListMahasiswa07 {
    private ArrayList<Mahasiswa07> mahasiswas;

    public ListMahasiswa07() {
        this.mahasiswas = new ArrayList<>();
    }

    public void tambah(Mahasiswa07 mhs) {
        mahasiswas.add(mhs);
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa07 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public void updateMahasiswa(String nim, Mahasiswa07 newMhs) {
        int index = linearSearch(nim);
        if (index != -1) {
            update(index, newMhs);
        } else {
            System.out.println("Mahasiswa with NIM " + nim + " not found.");
        }
    }

    public static void main(String[] args) {
        ListMahasiswa07 lm = new ListMahasiswa07();

        Mahasiswa07 m = new Mahasiswa07("201234", "Noureen", "021xx1");
        Mahasiswa07 m1 = new Mahasiswa07("201235", "Akhleema", "021xx2");
        Mahasiswa07 m2 = new Mahasiswa07("201236", "Shannum", "021xx3");

        // menambahkan objek mahasiswa
        lm.tambah(m);
        lm.tambah(m1);
        lm.tambah(m2);

        // menampilkan list mahasiswa
        lm.tampil();

        // update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa07("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
```
Output <Br>
![alt text](<img/Screenshot Output percobaan 3.png>)
# 16.4.3. Pertanyaan Percobaan
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa? <br>
Jawab : Fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep varargs (variable-length arguments) di Java. Dengan varargs, kita dapat mengirimkan sejumlah argumen yang berbeda ke sebuah metode, yang semuanya akan dikumpulkan dalam sebuah array. <br>
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection! <br>
Jawab : <br>
```java
public int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        return Collections.binarySearch(mahasiswas, new Mahasiswa07(nim, "", ""), Comparator.comparing(m -> m.nim));
    }
```
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut! <br>
Jawab : <br>
```java
public void sortAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, Comparator.comparing(Mahasiswa::getNim).reversed());
    }
```
#
# 16.5. Tugas Praktikum
1. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu. <br>
Jawab : <br>
Kode Program Class Mahasiswa107
```java
package Praktikum16.Kode;

public class Mahasiswa107 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa107(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNotelp() {
        return notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{nim='" + nim + "', nama='" + nama + "', notelp='" + notelp + "'}";
    }
}
```
Kode Program Class Nilai107
```java
package Praktikum16.Kode;

public class Nilai107 {
    Mahasiswa107 mahasiswa;
    MataKuliah107 mataKuliah;
    double nilai;

    public Nilai107(Mahasiswa107 mahasiswa, MataKuliah107 mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    public Mahasiswa107 getMahasiswa() {
        return mahasiswa;
    }

    public MataKuliah107 getMataKuliah() {
        return mataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override
    public String toString() {
        return "Nilai{mahasiswa=" + mahasiswa + ", mataKuliah=" + mataKuliah + ", nilai=" + nilai + "}";
    }
}
```
Kode Program Class MataKuliah107
```java
package Praktikum16.Kode;

public class MataKuliah107 {
    String kode;
    String nama;
    int sks;

    public MataKuliah107(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "MataKuliah{kode='" + kode + "', nama='" + nama + "', sks=" + sks + "}";
    }
}
```
Kode Program MahasiswaMain107
```java
package Praktikum16.Kode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MahasiswaMain107 {
    private static List<Mahasiswa107> daftarMahasiswa = new ArrayList<>();
    private static List<MataKuliah107> daftarMataKuliah = new ArrayList<>();
    private static List<Nilai107> daftarNilai = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initSampleData();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih: ");
            
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    cariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static void initSampleData() {
        // Sample Mahasiswa
        daftarMahasiswa.add(new Mahasiswa107("20001", "Thalia", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa107("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa107("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa107("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa107("20005", "Bilal", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa107("20006", "Ubaidah", "021xxx"));

        // Sample MataKuliah
        daftarMataKuliah.add(new MataKuliah107("0001", "Internet of Things", 2));
        daftarMataKuliah.add(new MataKuliah107("0002", "Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah107("0003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah107("0004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah107("0005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static void inputNilai() {
        System.out.print("Masukkan kode mata kuliah: ");
        String kodeMK = scanner.nextLine();
        MataKuliah107 mk = null;
        for (MataKuliah107 mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getKode().equals(kodeMK)) {
                mk = mataKuliah;
                break;
            }
        }
        if (mk == null) {
            System.out.println("Mata kuliah tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        Mahasiswa107 mhs = null;
        for (Mahasiswa107 mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                mhs = mahasiswa;
                break;
            }
        }
        if (mhs == null) {
            System.out.println("Mahasiswa tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        
        daftarNilai.add(new Nilai107(mhs, mk, nilai));
        System.out.println("Nilai berhasil ditambahkan.");
    }

    private static void tampilNilai() {
        System.out.println("+--------+----------+---------------------+-----+-------+");
        System.out.println("| NIM    | Nama     | Mata Kuliah         | SKS | Nilai |");
        System.out.println("+--------+----------+---------------------+-----+-------+");
        for (Nilai107 nilai : daftarNilai) {
            System.out.printf("| %-6s | %-8s | %-10s  |%4d | %5.2f |\n", 
                    nilai.getMahasiswa().getNim(), nilai.getMahasiswa().getNama(), nilai.getMataKuliah().getNama(), nilai.getMataKuliah().getSks(), nilai.getNilai());
        }
        System.out.println("+--------+----------+---------------------+-----+-------+");
    }

    private static void cariNilaiMahasiswa() {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        int totalSKS = 0;
        System.out.println("+--------+----------+---------------------+-----+-------+");
        System.out.println("| NIM    | Nama     | Mata Kuliah         | SKS | Nilai |");
        System.out.println("+--------+----------+---------------------+-----+-------+");
        for (Nilai107 nilai : daftarNilai) {
            if (nilai.getMahasiswa().getNim().equals(nim)) {
                System.out.printf("| %-6s | %-8s | %-10s  |%4d | %5.2f |\n", 
                        nilai.getMahasiswa().getNim(), nilai.getMahasiswa().getNama(), nilai.getMataKuliah().getNama(), nilai.getMataKuliah().getSks(), nilai.getNilai());
                totalSKS += nilai.getMataKuliah().getSks();
            }
        }
        System.out.println("+--------+----------+---------------------+-----+-------+");
        System.out.println("Total SKS yang telah diambil: " + totalSKS);
    }

    private static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> Double.compare(n2.getNilai(), n1.getNilai()));
        System.out.println("Data nilai telah diurutkan.");
        tampilNilai();
    }
}
```

2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1! <br>
