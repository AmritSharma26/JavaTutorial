
class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student { ");
        sb.append("name=").append(name);
        sb.append(", age=").append(age);
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
        Student ram = new Student("Ram", 21);
        System.out.println(ram);
    }

}
