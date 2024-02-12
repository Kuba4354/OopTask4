public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Kuba";
        student1.age = 17;
        student1.group = "Java";
        System.out.println(student1.name + "\n" + student1.age + "\n" + student1.group);

        System.out.println(" ");

        Student student2 = new Student();
        student2.name = "Eldiyar";
        student2.age = 17;
        student2.group = "Java";
        System.out.println(student2.name + "\n" + student2.age + "\n" + student2.group);

        System.out.println(" ");

        Student student3 = new Student();
        student3.name = "Yzzat";
        student3.age = 16;
        student3.group = "JS";
        System.out.println(student3.name + "\n" + student3.age + "\n" + student3.group);

        System.out.println(" ");
        Student student4 = new Student();
        student4.name = "Ularbek";
        student4.age = 14;
        student4.group = "Java";
        System.out.println(student4.name + "\n" + student4.age + "\n" + student4.group);

        System.out.println(" ");
        Student student5 = new Student();
        student5.name = "Musa";
        student5.age = 20;
        student5.group = "Java";
        System.out.println(student5.name + "\n" + student5.age + "\n" + student5.group);
        int[] array = {student1.age, student2.age, student3.age, student4.age, student5.age};
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i];
        }
        System.out.println(count / 5);
    }
}