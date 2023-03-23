package bai5_1;

public class chuyenXe {
    public String maSoChuyen;
    public String hoTenTaiXe;
    public int soXe;
    public int doanhThu;

    public chuyenXe() {
    }

    public chuyenXe(String maSoChuyen, String hoTenTaiXe, int soXe, int doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public int getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(int doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "chuyenXe{" + "maSoChuyen=" + maSoChuyen + ", hoTenTaiXe=" + hoTenTaiXe + ", soXe=" + soXe + ", doanhThu=" + doanhThu + '}';
    }
    
}
