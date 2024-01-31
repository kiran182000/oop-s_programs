public class Student {
    String name;
    int age;
    int id;
    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    void output(){
        System.out.println("Name of student is: " +name);
        System.out.println("Age of student is: " +age);
    }
    public  static void main(String[] args){
        Student s1=new Student("kiran",23,100);
        s1.output();

    }
}
