public class DaftarMahasiswaBerprestasi {
    Mahasiswa13 listMhs[] = new Mahasiswa13[5];
    int idx;

    // method tambah()
    void tambah(Mahasiswa13 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m; // selama id belum mencapai lengt, maka objeck mahasiswa dapat ters dimasukkan
                              // kedalam array list mhs
            idx++;
        } else {
            System.out.println("Data Sudah Penuh!!");
        }
    }

    // method tampil()
    void tampil() {
        for (Mahasiswa13 m : listMhs) {// selama jumlah mahasiswa sesuai dengan elemen yang diset maka akan terus
                                       // ditampilkan
            m.tampil();
            System.out.println("---------------------");
        }
    }

    // method bubbleSort()
    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    // proses dibawah ini adalah proses swap atau pertukaran (bubble short)
                    Mahasiswa13 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    // method selectionSort()
    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            // proses dibawah ini adalah proses swap atau pertukaran (selection short)
            Mahasiswa13 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    // method insertionSort()
    void insertionSort(boolean asc) {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa13 temp = listMhs[i];
            int j = i;
            if (asc) {
                while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            } else {
                while (j > 0 && listMhs[j - 1].ipk < temp.ipk) {
                    listMhs[j] = listMhs[j - 1];
                    j--;
                }
            }
            listMhs[j] = temp;
        }
    }
}
