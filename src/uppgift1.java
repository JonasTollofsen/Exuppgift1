import java.util.Scanner; //Scanner klassen importeras för att kunna skapa en ny instans av Scanner

public class uppgift1 { // Början av klassen main

    public static void main(String[] args){ // Början av metoden main
        //nedan deklareras alla variabler som används
//test test test
        Scanner input = new Scanner(System.in); //Scanner object to gather input from user
        double kopsumma_input; //Initial purchase amount as a double, which later gets rounded to the closest integer with the Math.round method
        int betalning = 0; // The payment amount received from the customer
        int kopsumma = 0; // Purchase amount after rounding the variable kopsumma_input
        int[] allaValorer = new int[]{1000,500,200,100,50,20,2,1}; //Integer array containing all the currencies used
        int tempvarde; // temporärt värde som används inom for-loopen för att räkna ut mängden utav alla valörer kunden ska få tillbaka
        int restvarde; // Värde som återstår efter att betalning har blivit subtraherat med köpsumman. Detta används även inom for-loopen för att bestämma när den ska brytas, när restvärde = 0 bryts loopen
        // while-loop för att undvika att användare anger felaktig summa, summan måste vara 1 eller högre för att gå vidare
        while(kopsumma <=0){
            System.out.print("Ange köpbelopp: ");
            kopsumma_input = input.nextDouble();
            kopsumma = (int)Math.round(kopsumma_input); //Köpsumman blir avrundad till närmaste heltal
            if (kopsumma<=0)
                System.out.printf("Felaktigt köpbelopp %n%n");
        }

        //while-loop for att undvika att användare anger felaktig betalning. Betalningen mottagen från kund måste vara >= köpsumman för att gå vidare
        while(betalning < kopsumma){
            System.out.printf("%nAnge betalning: ");
            betalning = input.nextInt();
            if (betalning<kopsumma)
                System.out.printf("Felaktig betalning %n");
        }

        restvarde = betalning - kopsumma; //Beräkning av restvärde som används inom for-loopen nedan

        if (restvarde >0){
            System.out.printf("%nKunden får tillbaka:%n");
            for (int valor : allaValorer) {
                tempvarde = restvarde / valor;
                if (tempvarde >0){
                    restvarde = restvarde - (tempvarde * valor);
                    System.out.printf("%dst  %dkr %n",tempvarde,valor);
                }
            }
        }
        else System.out.println("Ingen växel"); // Om restvärde = 0 så går inte applikatikationen igenom loopen och printar bara "ingen växel" på terminalen
    } // Slutet av metoden main
} // Slutet av klassen main
