import java.util.Scanner;

class TugasPert2No1 {
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Masukan angka dari 1 - 10: ");
            angka = input.nextInt();

            if (angka >= 0 && angka <= 10) {
                System.out.println("Angka yang Anda masukan sesuai!");
            } else {
                System.out.println("Angka bukan dari 1 - 10\n");
            }
        } while (angka < 0 || angka > 10);
    }
}