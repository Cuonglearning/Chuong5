package bai5_1;

public class noiThanh extends chuyenXe {
    public int soTuyen;
    public int soKm;

    public noiThanh() {
    }

    public noiThanh(int soTuyen, int soKm, String maSoChuyen, String hoTenTaiXe, int soXe, int doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKm = soKm;
    }

    @Override
    public String toString() {
        return "noiThanh{" +"maSoChuyen="+maSoChuyen+"tenTaiXe="+hoTenTaiXe+"soXe="+soXe+"doanhThu"+doanhThu+ "soTuyen=" + soTuyen + ", soKm=" + soKm + '}';
    }
 
}
