import java.util.Scanner;
public class ArrayRataNilai07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] NilaiMhs = new int[10];
        double total = 0;
        double rata2;
        for (int i = 0; i<NilaiMhs.length; i++){
            System.out.println("Masukkan Nilai Mahasiswa ke-"+(i+1)+" :");
            NilaiMhs[i] = input.nextInt();
        }
            for (int i = 0; i< NilaiMhs.length; i++){
                total+=NilaiMhs[i];
            }

            rata2= total/NilaiMhs.length;
            System.out.println("Rata-Rata Nilai = " +rata2);
 }
 }

