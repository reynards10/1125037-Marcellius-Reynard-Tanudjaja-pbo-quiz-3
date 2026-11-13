package Model;

public class MataKuliah {
    private String kode;
    private String nama;
    private int jumlahSks;
    private int semester;

    public MataKuliah (String kode,String nama,int jumlahSks,int semester) {
        this.kode = kode;
        this.nama = nama;
        this.jumlahSks = jumlahSks;
        this.semester = semester;
    }

    public String getKode() {
        return kode;
    }
    public String getNama() {
        return nama;
    }
    public int getJumlahSks() {
        return jumlahSks;
    }
    public int getSemester() {
        return semester;
    }

    public void setKode() {
        this.kode = kode;
    }
    public void setNama() {
        this.nama = nama;
    }
    public void setJumlahSks() {
        this.jumlahSks = jumlahSks;
    }
    public void setSemester(){
        this.semester= semester;
    }
}
