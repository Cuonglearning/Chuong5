package bai5_1;

public class ngoaiThanh extends chuyenXe {
    public String noiDen;
    public int soNgay;

    public ngoaiThanh() {
    }

    public ngoaiThanh(String noiDen, int soNgay, String maSoChuyen, String hoTenTaiXe, int soXe, int doanhThu) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    @Override
    public String toString() {
        return "ngoaiThanh{" + "noiDen=" + noiDen + ", soNgay=" + soNgay + '}';
    }
    
}
