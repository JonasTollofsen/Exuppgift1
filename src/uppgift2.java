import java.math.BigInteger;
import java.util.Scanner;

public class uppgift2 {
    public static void main(String[] args) {

        int talet; // talet som använddare anger för att beräkna fakultet
        Scanner input = new Scanner(System.in); //Scanner för att läsa input från användare

        do { // fråga användare efter tal
            System.out.printf("%nAnge ett tal mellan 0 och 100: ");
            talet = input.nextInt();
        } while (talet < 0 || talet > 100); // While-loop för att få användare att ange korrekt tal, loopar tills ett tal mellan 1 - 100 anges

        if (talet == 0) { //om talet är 0 anges fakultet som 1
            System.out.println("resultatet av 0! = 1");
        }
        else {
            BigInteger delprodukt = BigInteger.valueOf(1); // BigInteger används för att hantera stora tal
            for (int counter = 1; counter <= talet; counter++){
                //delprodukt *= counter;
                delprodukt = delprodukt.multiply(BigInteger.valueOf(counter));
            }
            System.out.printf("Resultatet av %d! är %d",talet, delprodukt);
        }
    }
}