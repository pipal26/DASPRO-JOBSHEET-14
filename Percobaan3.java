import java.util.Scanner;
public class Percobaan3 {
    static double hitungLaba(double saldo,int tahun){
        if (tahun == 0) {
            return saldo;
        } else {
            return (1.11 * hitungLaba(saldo, tahun - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoAwal;
        int Tahun;

        System.out.print("Jumlah saldo awal: ");
        saldoAwal = sc.nextDouble();
        System.out.print("lamanya investasi (tahun) : ");
        Tahun = sc.nextInt();

        System.out.println("jumlah saldo setelah " + Tahun + " tahun: ");
        System.out.println(hitungLaba(saldoAwal, Tahun));
    }
}
