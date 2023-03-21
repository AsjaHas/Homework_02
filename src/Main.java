public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Homework_02" + "\n");

        // Napravite program koji na osnovu  novca i racuna izracuna koliko je kusur

        int payment = 100;
        int bill = 66;
        int change = payment - bill;

        if (bill == 0) {
            System.out.println("You didnt buy anything did you?" + "\n");
        } else if (bill < 0) {
            System.out.println("Did you maybe break something?" + "\n");
        } else if (bill > 0) {
            if ((payment <= 100) && (payment > 0)) {

                int changeOf20 = change % 20;
                int changeOf10 = changeOf20 % 10;
                int changeOf2 = changeOf10 % 2;

                if ((changeOf20 < 20) && (changeOf20 >= 0)) {
                    System.out.println("20 KM = " + change / 20);
                } else {
                    System.out.println("20 KM = 0");
                }
                if ((changeOf20 > 10) && (changeOf10 >= 0)) {
                    System.out.println("10 KM = " + changeOf20 / 10);
                } else {
                    System.out.println("10 KM = 0");
                }
                if ((changeOf10 > 2) && (changeOf2 >= 0)) {
                    System.out.println("2 KM = " + changeOf10 / 2);
                } else {
                    System.out.println("2 KM = 0");
                }
                if ((changeOf2 > 0)) {
                    System.out.println("1 KM = 1");
                } else {
                    System.out.println("1 KM = 0" + "\n");
                }
            } else if (payment > 100) {
                System.out.println("You have too much money" + "\n");
            }
        }


        // Napravite program koji izracuna povrsinu kruga. (Bez hardkodiranja)sa ispisom u konzolu.

        double circleRadius = 2;
        // Different versions of writting Pi
        //Pi = 22/7;
        // Pi = 3.14
        // Math.PI
        double circleArea = (circleRadius * circleRadius * 22) / 7;
        System.out.println("Area of the circle is " + circleArea);


        // Napravite program gdje sam mogu da provjeravam da li je broj A, djeljiv sa Brojem B (BEZ HARDKODIRANJA) sa ispisom u konzolu.

        int numberA = 21;
        int numberB = 100;
        // C i D potrebni za slj zadatak
        int numberC = 0;
        int numberD = 0;
        //
        int divisibleBy3 = numberA % 3;
        if ((numberA > 10) && (numberA < 10000) && (divisibleBy3 == 0)) {
            if (numberA % numberB == 0) {
                System.out.println("Number " + numberA + " is divisible by number " + numberB);
            } else {
                System.out.println("Number " + numberA + " is not divisible by number " + numberB);
            }

        } else {
            System.out.println("Number A has to be >10, <10000 and divisible by 3.");
        }
        //Napravite program koji
        // Ukoliko je broj A veci od broja B sabira ta dva broja
        //   Ukoliko je B veci od a Oduzima B od A
        //   Ukoliko su jednaki A i B mnozi ih
        //   za svaki od ovih uslova potreban je ispis

        if (numberA > numberB) {
            System.out.println("" + numberA + "+" + numberB + "=" + (numberA + numberB));
        } else if (numberB > numberA) {
            System.out.println("" + numberA + "-" + numberB + "=" + (numberA - numberB));
        } else if (numberA == numberB) {
            System.out.println("" + numberA + "*" + numberB + "=" + (numberA * numberB));
        }

        //Iznos X plus taj isti iznos, plus 6, podjeljeno sa 2 minus inicijalni broj x, zatim vidjeti da li je djeljivo sa dva
        int randomNumber = 3;
        int equationResult = randomNumber + randomNumber + 6 / 2 - randomNumber;
        int divisor = 2;
        if (equationResult % divisor == 0) {
            System.out.println("Equation result (" + equationResult + ") is divisible by 2");
        } else {
            System.out.println("Equation result (" + equationResult + ") is not divisible by 2");
        }

        // Napraviti  logiku sa  varijablama A i B i C D

        /* Ukoliko je A i B vece od nula ili  C i D vece od nula sabrati sve brojeve.
            Nakon toga provjeriti da li je rezultat veci od 100 ukoliko jeste provjeriti da li je djeljivo sa dva.
            Ukoliko je djeljivo sa dva podjeliti, ukoliko nije uraditi minus jedan pa opet probati vidjeti da li je djeljivo sa dva i ako jeste podjeliti sa dva.
            Ukoliko nije ispisati “The number is still not divisible by 2”

         */

        if ((numberA > 0 && numberB > 0) || (numberC > 0 && numberD > 0)) {
            int sumABCD = numberA + numberB + numberC + numberD;
            //System.out.println("" + numberA + "+" + numberB + "+" +numberC + "+" +numberD + "=" +sumABCD);
            if (sumABCD > 100) {
                if (sumABCD % divisor == 0) {
                    System.out.println("" + sumABCD + "/" + divisor + "=" + sumABCD / divisor);
                } else {
                    sumABCD -= 1;
                    if (sumABCD % divisor == 0) {
                        System.out.println("" + sumABCD + "/" + divisor + "=" + sumABCD / divisor);
                    } else {
                        System.out.println("The number is still not divisible by 2");
                    }
                }
            }
        } else {
            System.out.println("A and B, or C an D have to be >0");
        }


    }


}