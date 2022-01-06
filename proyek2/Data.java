public class Data extends SiakadFinal {
    private String nim;
    private String nama;
    private String prodi;
    private String fakultas;
    private String semester;
    private Double ipk;
    private String namaortu;

    public Data(String nim, String nama, String prodi, String fakultas, String semester, Double ipk, String namaortu) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
        this.semester = semester;
        this.ipk = ipk;
        this.namaortu = namaortu;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getProdi() {
        return this.prodi;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return this.fakultas;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return this.semester;
    }

    public void setIPK(double ipk){
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }
    public void setnamaortu(String namaortu) {
        this.prodi = namaortu;
    }

    public String getnamaortu() {
        return this.namaortu;
    }

    public void getDetail() {

        System.out.printf("%7s %17s %10s %10s %10s %14s %16s", this.nim, this.nama.toUpperCase(), this.prodi, this.fakultas.toUpperCase(), this.semester.toUpperCase(), String.valueOf(this.ipk), this.namaortu);
        System.out.println();
    }
}