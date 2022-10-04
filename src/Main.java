public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        for(int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        System.out.println("задание 2");
        //задание 2

        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("задание 3");
        //задание 3

        for(int i = 2; i <= 17; i+=2) {
            System.out.println(i);
        }

        System.out.println("задание 4");
        //задание 4

        for(int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("задание 5");
        //задание 5

        for(int i = 1904; i <= 2096; i+=4) {
            System.out.println("Високосные год: " + i);
        }

        System.out.println("задание 6");
        //задание 6

        for(int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }

        System.out.println("задание 7");
        //задание 7

        for(int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }

        System.out.println("задание 8");
        //задание 8

        int downPayment = 29_000;
        var month = "месяц";
        int total = 0;
        int profit = 0;

        for(int i = 1; i <= 12; i++) {

            total = total + downPayment;
            profit = total/100 + total;

            switch (i) {
                case 1:
                    month = "январь";
                    break;
                case 2:
                    month = "февраль";
                    break;
                case 3:
                    month = "март";
                    break;
                case 4:
                    month =  "апрель";
                    break;
                case 5:
                    month = "май";
                    break;
                case 6:
                    month = "июнь";
                    break;
                case 7:
                    month = "июль";
                    break;
                case 8:
                    month = "август";
                    break;
                case 9:
                    month = "сентябрь";
                    break;
                case 10:
                    month =  "октябрь";
                    break;
                case 11:
                    month = "ноябрь";
                    break;
                case 12:
                    month = "декабрь";
                    break;
                default:
                    System.out.println("Такого дня не существует");
            }
            System.out.println("Месяц " + month + " сумма накоплений равна " +  profit +  "рублей" );

        }

    }
}



