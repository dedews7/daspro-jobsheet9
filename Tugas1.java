import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan nilai-nilai elemen array:");

        // Mengisi array dengan input pengguna
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        input.close(); // Menutup scanner

        // Inisialisasi nilai tertinggi, nilai terendah, dan jumlah elemen
        int max = array[0];
        int min = array[0];
        int sum = array[0];

        // Menghitung nilai tertinggi, nilai terendah, dan jumlah elemen
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        // Menghitung rata-rata
        double average = (double) sum / n;

        // Menampilkan hasil
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);
    }
}
