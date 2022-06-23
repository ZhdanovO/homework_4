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
        int startPeriod = currentYear - 100;
        int endPeriod = currentYear + 100;
        int yearObservation = startPeriod;
        while (yearObservation <= endPeriod) {
            System.out.println(yearObservation);
            yearObservation = yearObservation + 79;
        }
    }
}