package JOBSHEET3.Mahasiswa;

public class DataMhs {
    String nama;
    int NIM;
    char jenisKelamin;
    double IPK;

    public DataMhs(String name, int nim, char jenis, double ipk){
        nama = name;
        NIM = nim;
        jenisKelamin = jenis;
        IPK = ipk;
    }

    void menampilkanData(int index){
        System.out.println("Data Mahasiswa ke- "+ index);
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+NIM);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Nilai IPK : "+IPK);
    }
    double hitungRataIPK(){
        return IPK;
    }
}