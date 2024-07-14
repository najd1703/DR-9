public class Main {
    public static void main(String[] args) {
        isLeapYear(1588);
        isLeapYear(1598);
        isLeapYear(1688);
        printDeviceVersion(0, 2014);
        printDeviceVersion(1, 2012);
        printDeviceVersion(0, 2016);
        int deliveryDistance = 32;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется " + days + " дня.");
        } else {
            System.out.println("Доставки нет.");
        }


    }

    public static void isLeapYear(int year) {

        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }

    public static void printDeviceVersion(int deviceOS, int deviceYear) {

        if (deviceOS == 0) {
            if (deviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (deviceOS == 1) {
            if (deviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Выберете операционную систему вашего устройства");
        }
    }

    public static int distanceTime(int distanceKM) {
        if (distanceKM <= 20) {
            return 1;
        } else if (distanceKM > 20 && distanceKM < 60) {
            return 2;
        } else if (distanceKM >= 60 && distanceKM < 100) {
            return 3;
        } else {
            return 0;
        }


    }
}

