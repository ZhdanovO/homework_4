public class Main {
    public static void main(String[] args) {
        //task 1
        int i = 0;
        while (i <10){
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i > 0; i--){
            System.out.print(i + " ");
        }

        //task 2
        int firstFridayOfMonth = 4;
        System.out.println();
        for (int day = 0; day <=31; day++) {
            if (day % 7 == firstFridayOfMonth) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        }

        //task 3
        int currentYear = 2021;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        int yearObservation = startPeriod;
        while (yearObservation <= endPeriod) {
            if (yearObservation % 79 == 0) {
                System.out.println(yearObservation);
            }
            yearObservation = yearObservation + 1;
        }

        //task 4
        for (int k = 1; k <= 30; k++) {
            String output = k + ": ";
            if (k % 3 == 0 && k % 5 == 0){
                output = output + "ping pong";
            } else if (k % 3 == 0) {
                output = output + "ping";
            } else if ( k % 5 == 0) {
                output = output + "pong";
            }
            System.out.println(output);
        }

        //task 5
        System.out.println();
        int countFibo = 10;
        int firstNum = 0;
        int secondNum = 1;
        int calc;
        System.out.print(firstNum + " ");
        for (int l = 1; l < countFibo; l++) {
            calc = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = calc;
            System.out.print(firstNum + " ");

        }
    }
}