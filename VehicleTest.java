package Two.homeWork2;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    Проверить, что объект Car создается с 4-мя колесами.
    Проверить, что объект Motorcycle создается с 2-мя колесами.
    Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
 */
class VehicleTest {
    private static Car car;
    private static Motorcycle motorcycle;

    @BeforeAll
    public static void createObjetsForTest(){
        car = new Car("carCompany", "carModel", 2021);
        motorcycle = new Motorcycle("motoCompany", "motoModel", 2022);
    }

    /*
        Проверка, что экземпляр класса Car является экземпляром транспортного средства.
        Тест считается успешным если метод assertTrue() получает True
     */
    @Test
    public void carShouldVehicleObject(){
        assertTrue(car instanceof Vehicle);
    }

    /*
        Проверка, что экземпляр класса Car создается с 4-мя колесами
     */
    @Test
    public void carShouldHaveFourWheels(){
        int expectedWheels = 4;
        int actualWheels = car.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Количеств колес не равно 4");
    }

    /*
        Проверка, что экземпляр класса Motorcycle создается с 2-мя колесами
     */
    @Test
    public void motorcycleShouldHaveFourWheels(){
        int expectedWheels = 2;
        int actualWheels = motorcycle.getNumWheels();
        assertEquals(expectedWheels,
                actualWheels, "Количество колес не равно 2");
    }

    /*
        Проверка, что при начале движения скорость автомобиля должна равняться 60.
     */
    @Test
    public void carShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 60;
        car.testDrive();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Скорость машины не равна 60");
    }

    /*
        Проверка, что при начале движения скорость мотоцикла должна равняться 75.
     */
    @Test
    public void motorcycleShouldDriveWithCorrectSpeed(){
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Скорость мотоцикла не равна 75");
    }

    /*
        Проверка, что при остановке скорость автомобиля должна равняться 0.
     */
    @Test
    public void carShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        car.testDrive();
        car.park();
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Скорость машины не равна 0");
    }

    /*
        Проверка, что при остановке скорость мотоцикла должна равняться 0.
     */
    @Test
    public void motorcycleShouldParkWithCorrectSpeed(){
        int expectedSpeed = 0;
        motorcycle.testDrive();
        motorcycle.park();
        int actualSpeed = motorcycle.getSpeed();
        assertEquals(expectedSpeed,
                actualSpeed, "Скорость мотоцикла не равна 0");
    }
}