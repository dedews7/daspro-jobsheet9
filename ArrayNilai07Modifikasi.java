import java.util.Scanner;

public class ArrayNilai07Modifikasi {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int [] nilaiAkhir = new int[10];
       
         for (int i = 0; i<nilaiAkhir.length; i++){
        System.out.println("Masukkan nilai akhir ke-"+i+" :");
        nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i<10; i++){
            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + i + " Lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + i + " Tidak Lulus!");
            }
            
        }
    }
}
    

  

