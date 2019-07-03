
public class FirstClass {
    public static void main(String[] args) {
        SecondClass Class2 = new SecondClass(10,5);
        System.out.println("Hello");
        System.out.println("Мы тут вообще-то домашнее задание делаем. Вот смотрите, переменная one из Class2 - " + Class2.getOne());
        System.out.println("Здесь еще должен был быть экземпляр класса Animals, но в master его нет.");
        Animals dog = new Animals(29, "Бобик");
        dog.runForRoad();
        dog.runForDesert();
        dog.walkingOnStreet();
    }
}
