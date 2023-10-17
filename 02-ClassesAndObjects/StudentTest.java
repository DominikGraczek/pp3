public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        // System.out.println(s.name + " " + s.age);
        Student student1 = new Student();
        student1.name = "dominik";
        student1.age = 21;
        Student student2 = new Student();
        student2.name = "kacper";
        student2.age = 22;
        // student1.sayHello();
        // student2.sayHello();
        student1.id = 1;
        student2.id = 2;
        student1.validId = true;
        student2.validId = false;
        student1.semester = 1;
        student2.semester = 2;
        student1.averageGrade = 3.5f;
        student2.averageGrade = 3.5f;
        student1.changeValidation();
        student1.displayInfo();
        student2.displayInfo();

    }
}
