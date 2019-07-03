public class Animals implements AnimalsImpl {
    public Animals(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Animals() {
    }

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                '}';
    }

    public void runForRoad(){
        System.out.println(getName() +  " слишком долго передвигается, этому животному уже " + getAge() + " лет!");
    }

    public void runForDesert(){
        System.out.println("Это же собака! В пустыне она не живет.");
    }
}
