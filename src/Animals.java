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
        System.out.println(getName() +  " очень быстро бежит по дороге, хотя этому псу уже " + getAge() + " лет!");
    }

    public void Stay(){
        System.out.println("Просто посижу");
    }

    public void runForDesert(){
        System.out.println("Это же собака! В пустыне она не живет.");
    }
    public void walkingOnStreet(int age, String name){
        System.out.println(age + " решил погулять по улице. И это в свои " + name + " лет!");
    }
}
