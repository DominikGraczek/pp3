public class Student {
        String name;
        int age;
        int id;
        boolean validId;
        int semester;
        float averageGrade;
        void sayHello(){
            System.out.println("Hello from "+name);
        }
        void displayName(){
            System.out.println("My name is "+name);
        }
        void displayAge(){
            System.out.println("My age is "+age);
        }
        void displaySemesterAndGrade(){
            System.out.println("My attend "+semester+" semester and my average grade is "+averageGrade);
        }
        void changeValidation(){
            if (validId == true) {
                validId = false;
            }
            else {
                validId = true;
            }
        }
        void displayInfo(){
            System.out.println(name);
            System.out.println(id);
            System.out.println(validId);
        }
}


