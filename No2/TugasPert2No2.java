import java.util.Scanner;

class TugasPert2No2 {
    public static void main(String[] args) {
        String kalimat = "kalau dilakukan dengan sepenuh hati maka besi\n batangan pun kalau digosok terus menerus akan menjadi jarum";
        String kata; 
        Scanner input = new Scanner(System.in);
        boolean isFound; 

        System.out.println("Kalimat " + kalimat);
        do {
            System.out.print("Masukan kata untuk dicari di kalimat: ");
            kata = input.nextLine();
            isFound =  kalimat.contains(kata);

            if (isFound) {
                System.out.printf("\"%s\" ditemukan di kalimat.\n", kata);
            } else {
                System.out.printf("\"%s\" tidak ditemukan di kalimat. Harap input ulang.\n\n", kata);
            }
        } while (!isFound);
    }
}