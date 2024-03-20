public class MahasiswaMain13 {

    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa13 m1 = new Mahasiswa13("Nusa", 2017, 25, 3);
        Mahasiswa13 m2 = new Mahasiswa13("Rara", 2012, 19, 4);
        Mahasiswa13 m3 = new Mahasiswa13("Dompu", 2018, 19, 3.5);
        Mahasiswa13 m4 = new Mahasiswa13("Abdul", 2017, 23, 2);
        Mahasiswa13 m5 = new Mahasiswa13("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum Sorting = ");
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(true);
        list.tampil();

        System.out.println();
        System.out.println("Data mahasiswa setelah sorting dsc berdasarkan ipk (menggunakan Insertion Short)");
        list.insertionSort(false);
        list.tampil();
    }
}
