
package data_pegawai;

/**
 *
 * @author INSTIKI
 */
public class Pegawai {
    // Atribut data pegawai
    private int idPegawai;
    private String nama;
    private String alamat;
    private String jabatan;

    // Constructor untuk inisialisasi data pegawai
    public Pegawai(int idPegawai, String nama, String alamat, String jabatan) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    // Getter dan Setter untuk ID Pegawai
    public int getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(int idPegawai) {
        this.idPegawai = idPegawai;
    }

    // Getter dan Setter untuk Nama Pegawai
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk Alamat Pegawai
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Getter dan Setter untuk Jabatan Pegawai
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    // Method untuk menampilkan data pegawai
    public void tampilData() {
        System.out.println("ID Pegawai: " + idPegawai);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
    }

    // Method untuk mengubah data pegawai
    public void ubahData(String nama, String alamat, String jabatan) {
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    // Method untuk menghapus data pegawai
    public void hapusData() {
        this.nama = null;
        this.alamat = null;
        this.jabatan = null;
    }

    // Method toString untuk menampilkan data dalam format string
    @Override
    public String toString() {
        return "ID Pegawai: " + idPegawai + ", Nama: " + nama + ", Alamat: " + alamat + ", Jabatan: " + jabatan;
    }
}

    
    

