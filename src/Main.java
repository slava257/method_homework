import java.time.LocalDate;

public class Main {
    // Задание 1
    // Реализуйте метод, который получает в качестве параметра год, а затем проверяет,
    // является ли он високосным, и выводит результат в консоль.
    //Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде
    // параметра.
    //Результат программы выведите в консоль. Если год високосный, то должно быть выведено
    // “*номер года —* високосный год”. Если год не високосный, то, соответственно:
    // “*номер года —* не високосный год”.
    public static void IsOrIsNotALeapYears(int years) {
        if (years % 4 == 0 && years % 100 != 0 || years % 400 == 0) {
            System.out.println(years + " високосный год");
        } else {
            System.out.println(years + " не високосный год");
        }
    }

    // Задание 2
//Вспомним задание 2 по условным операторам, где нам необходимо было предложить
// пользователю облегченную версию приложения.
//Текст прошлого задания
//К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
// но и год его создания: от этого зависит, подойдет ли приложение для телефона или оно
// просто не установится.
//Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
//Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную
// версию приложения.
//Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии
// двух условий — операционной системы телефона (iOS или Android) и года производства.
//Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об
// облегченной версии.
//Например, для iOS оно будет звучать так:
//«Установите облегченную версию приложения для iOS по ссылке».
//А для Android так:
//«Установите облегченную версию приложения для Android по ссылке».
//При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение
// об установке приложения.
//Для обозначения года создания используйте переменную clientDeviceYear,
// где необходимо указать 2015 год.
//Напишите метод, куда подаются два параметра: тип операционной системы (ОС)
// ( 0 — iOS или 1 — Android ) и год выпуска устройства.
//Если устройство старше текущего года, предложите ему установить lite-версию(облегченную версию).
//Текущий год можно получить таким способом:
//Или самим задать значение вручную, введя в переменную числовое значение.
//В результате программа должна выводить в консоль в зависимости от исходных данных,
// какую версию приложения (обычную или lite) и для какой ОС (Android или iOS) нужно
// установить пользователю.
    public static void InstallApplicationsFor(int OperatingSystem, int yearOfRelease) {
        int currentYear = LocalDate.now().getYear();
        if (OperatingSystem == 1) {
            if (yearOfRelease < currentYear) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите приложения для Android по ссылке");
            }
        } else if (OperatingSystem == 0) {
            if (yearOfRelease < currentYear) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
            } else {
                System.out.println("Установите приложения для iOS по ссылке");
            }
        }
    }

    //Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
    //Текст прошлого задания
    //Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем
    // доставку банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том,
    // когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса
    // доставки.
    //Правила доставки такие:
    //Доставка в пределах 20 км занимает сутки.
    //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
    //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
    //То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
    //Напишите программу, которая выдает сообщение в консоль:
    //"Потребуется дней: " + срок доставки
    //Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до
    // клиента.
    //Наша задача — доработать код, а именно написать метод, который на вход принимает
    // дистанцию и возвращает итоговое количество дней доставки.
    public static void delivery(int deliveryDays) {
        System.out.println(deliveryDays);
    }

    public static int deliveryDays(int deliveryDistance) {
        int deliveryDays ;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else {
            deliveryDays=1;
            deliveryDistance=deliveryDistance-20;
            int Distance  =deliveryDistance/40;
            int Distance1 = deliveryDistance%40;
            deliveryDays+=Distance;

            if (Distance1 != 0) {
                deliveryDays++;
            }
        }
        return deliveryDays;
    }
    public static void main(String[] args) {
        System.out.println("Task 1");
        int year = 2022;
        IsOrIsNotALeapYears(year);

        System.out.println("Task 2");
        int clientOperatingSystem = 1;
        int clientDeviceYear = 2015;
        InstallApplicationsFor(clientOperatingSystem, clientDeviceYear);

        System.out.println("Task 3");
        int deliveryDistance = 30;
        int days = deliveryDays(deliveryDistance);
        delivery(days);
    }
    }
