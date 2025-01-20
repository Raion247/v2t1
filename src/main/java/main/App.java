package main;

import java.util.Scanner;

public class App 
{
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);

        Car newCar = null;

        System.out.print("Anna auton merkki: ");
        String initbrand = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String initmodel = sc.nextLine();
        newCar = new Car(initbrand, initmodel, 0);

        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch (i) {
                    case 1:
                        newCar.printStatus();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String brand = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        String model = sc.nextLine();
                        newCar.setBrand(brand);
                        newCar.setModel(model);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        String speedString = sc.nextLine();
                        int accelerated = Integer.parseInt(speedString);
                        if (accelerated < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        newCar.accelerate(accelerated);
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        String speedString2 = sc.nextLine();
                        int decelerated = Integer.parseInt(speedString2);
                        if (decelerated < 0) {
                            System.out.println("Nopeuden täytyy olla positiivinen luku.");
                            break;
                        }
                        newCar.decelerate(decelerated);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                }
            }
        }
    sc.close();
    }
}
