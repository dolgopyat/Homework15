public class Main {
    public static void main(String[] args) {
        Driver alex = new Driver("Алекс", true, 10);
        PassengerCar lada = new PassengerCar("Lada", "Granta", 1.7);
        alex.driveB(lada);
        lada.start();
        lada.pitStop();
        lada.bestTime();
        lada.maxSpeed();
        lada.finish();
        Driver max = new Driver("Макс", true, 11);
        PassengerCar audi = new PassengerCar("Audi", "A8 50L TDI quatro", 3.0);
        max.driveB(audi);
        audi.start();
        audi.pitStop();
        audi.bestTime();
        audi.maxSpeed();
        audi.finish();
        Driver nikita = new Driver("Никита", true, 16);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.0);
        nikita.driveB(bmw);
        bmw.start();
        bmw.pitStop();
        bmw.bestTime();
        bmw.maxSpeed();
        bmw.finish();
        Driver sergey = new Driver("Сергей", true, 14);
        PassengerCar hyundai = new PassengerCar("Hyundai", "Avante", 1.6);
        sergey.driveB(hyundai);
        hyundai.start();
        hyundai.pitStop();
        hyundai.bestTime();
        hyundai.maxSpeed();
        hyundai.finish();
        Driver vladimir = new Driver("Владимир", true, 13);
        Bus vektor = new Bus("Vektor", "Next 7.6", 4.4);
        vladimir.driveD(vektor);
        vektor.start();
        vektor.pitStop();
        vektor.bestTime();
        vektor.maxSpeed();
        vektor.finish();
        Driver anton = new Driver("Антон", true, 17);
        Bus gazele = new Bus("Газель", "Next", 2.9);
        anton.driveD(gazele);
        gazele.start();
        gazele.pitStop();
        gazele.bestTime();
        gazele.maxSpeed();
        gazele.finish();
        Driver ignat = new Driver("Игнат", true, 9);
        Bus liaz = new Bus("ЛиАЗ", "4292", 4.4);
        ignat.driveD(liaz);
        liaz.start();
        liaz.pitStop();
        liaz.bestTime();
        liaz.maxSpeed();
        liaz.finish();
        Driver genadiy = new Driver("Генадий", true, 11);
        Bus paz = new Bus("ПАЗ", "4234", 4.75);
        genadiy.driveD(paz);
        paz.start();
        paz.pitStop();
        paz.bestTime();
        paz.maxSpeed();
        paz.finish();
        Driver vitaliy = new Driver("Виталий", true, 10);
        Truck kamaz = new Truck("Kamaz", "4911", 17.2);
        vitaliy.driveC(kamaz);
        kamaz.start();
        kamaz.pitStop();
        kamaz.bestTime();
        kamaz.maxSpeed();
        kamaz.finish();
        Driver konstantin = new Driver("Константин", true, 14);
        Truck man = new Truck("MAN", "TGS 18 480", 10.5);
        konstantin.driveC(man);
        man.start();
        man.pitStop();
        man.bestTime();
        man.maxSpeed();
        man.finish();
        Driver evgeniy = new Driver("Евгений", true, 12);
        Truck volvo = new Truck("Volvo", "Mean Green", 13);
        evgeniy.driveC(volvo);
        volvo.start();
        volvo.pitStop();
        volvo.bestTime();
        volvo.maxSpeed();
        volvo.finish();
        Driver oleg = new Driver("Олег", true, 15);
        Truck scania = new Truck("Scania", "R730", 16);
        oleg.driveC(scania);
        scania.start();
        scania.pitStop();
        scania.bestTime();
        scania.maxSpeed();
        scania.finish();
    }
}