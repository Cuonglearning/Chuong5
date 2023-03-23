package bai5_1;

public class test {

    public static void main(String[] args) {
        noiThanh nt1=new noiThanh();
        nt1.maSoChuyen="nt0701";
        nt1.hoTenTaiXe="Nguyen Thai Binh";
        nt1.soXe=37;
        nt1.doanhThu=5000000;
        nt1.soTuyen=45;
        nt1.soKm=100;
        noiThanh nt2=new noiThanh();
        nt2.maSoChuyen="nt0709"; 
        nt2.hoTenTaiXe="Nguyen Tien Bip";
        nt2.soXe=57;
        nt2.doanhThu=5000000;
        nt2.soTuyen=65;
        nt2.soKm=100;
        ngoaiThanh ngt1=new ngoaiThanh();
        ngt1.noiDen="Buon Ma Thuot";
        ngt1.soNgay=1;
        ngt1.maSoChuyen="ngt0845"; 
        ngt1.hoTenTaiXe="Nguyen Huu Nghi";
        ngt1.soXe=37;
        ngt1.doanhThu=10000000;
        ngoaiThanh ngt2=new ngoaiThanh();
        ngt2.noiDen="Da Lat";
        ngt2.soNgay=1;
        ngt2.maSoChuyen="ngt0967"; 
        ngt2.hoTenTaiXe="Ly Tri";
        ngt2.soXe=97;
        ngt2.doanhThu=7000000;
        
        System.out.println("Tong doanh thu noi thanh:"+(nt1.doanhThu+nt2.doanhThu));
        System.out.println("Tong doanh thu ngoai thanh:"+(ngt1.doanhThu+ngt2.doanhThu));
        System.out.println("Tong doanh thu :"+(nt1.doanhThu+nt2.doanhThu+ngt1.doanhThu+ngt2.doanhThu));
    }
    
}
