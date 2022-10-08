import java.util.*;
import java.util.concurrent.*;

public class TugasPert2No3 {
    public static void main(String[] args) {
        String[] pilihan = {"jempol", "telunjuk", "kelingking"};
        String pilihanKomputer, pilihanUser, pilihanLanjut;
        Scanner input = new Scanner(System.in);
        boolean lanjut;

        do {
            boolean pilihanValid;
            pilihanKomputer = pilihan[ThreadLocalRandom.current().nextInt(pilihan.length)];
            
            do {
                System.out.print("Masukan pilihan Anda [jempol/telunjuk/kelingking]: ");
                pilihanUser = input.nextLine();
                if (pilihanUser.equals(pilihan[0]) || pilihanUser.equals(pilihan[1]) || pilihanUser.equals(pilihan[2])) {
                    pilihanValid = true;
                } else {
                    System.out.println("Pilihan tidak valid. Input ulang.\n");
                    pilihanValid = false;
                }
            } while (!pilihanValid);

            System.out.println("Komputer memilih: " + pilihanKomputer);

            if (pilihanUser.equals(pilihanKomputer)) {
                System.out.println("Hasil: Seri!");
            } else if (pilihanUser.equals("jempol") && pilihanKomputer.equals("telunjuk")) {
                System.out.println("Hasil: Anda menang!");
            } else if (pilihanUser.equals("telunjuk") && pilihanKomputer.equals("kelingking")) {
                System.out.println("Hasil: Anda menang!");
            } else if (pilihanUser.equals("kelingking") && pilihanKomputer.equals("jempol")) {
                System.out.println("Hasil: Anda menang!");
            } else {
                System.out.println("Hasil: Kalah!");
            }

            do {
                System.out.print("\nMain lagi? [y/t]: ");
                pilihanLanjut = input.nextLine().toLowerCase();
                if (pilihanLanjut.equals("y")) {
                    lanjut = true; 
                    pilihanValid = true;
                } else if (pilihanLanjut.equals("t")) {
                    lanjut = false;
                    pilihanValid = true; 
                } else {
                    lanjut = true;
                    pilihanValid = false; 
                    System.out.println("Masukan tidak valid. Harap input ulang.\n");
                }
            } while (!pilihanValid);
        } while (lanjut);
    }
}