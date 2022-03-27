public class Demo2equals {
    public static void main(String[] args) {
        Student std1 = new Student("Three",22,"male");
        Student std2 = new Student("Three",22,"male");
        System.out.println(std1.equals(std2));
        System.out.println(std1 == std2);
    }
}
