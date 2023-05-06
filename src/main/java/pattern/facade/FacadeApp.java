package pattern.facade;


/*
 * Фасад - это структурный паттерн, который представляет
 * простой (но урезанный) интерфейс к сложной системе объектов,
 * библиотеке или фреймворку
 * */
public class FacadeApp {
    public static void main(String[] args) {
//        Power power = new Power();
//        power.on();
//
//        Hdd hdd = new Hdd();
//        hdd.load();
//
//        Dvd dvd = new Dvd();
//        dvd.load();
        Computer computer = new Computer();
        computer.on();
    }
}

class Computer {
    Power power = new Power();
    Hdd hdd = new Hdd();
    Dvd dvd = new Dvd();

    void on() {
        power.on();
        hdd.load();
        dvd.load();
    }
}

class Power {
    void on() {
        System.out.println("Включение питания");
    }
    void off() {
        System.out.println("Выключение питания");
    }
}

class Dvd {
    void load() {
        System.out.println("Загрузка данных c DVD");
    }
}

class Hdd {
    void load() {
        System.out.println("Загрузка данных c HDD");
    }
}