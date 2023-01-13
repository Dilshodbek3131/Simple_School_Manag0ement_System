package Simple_School_Management_System;

public class TestMain {
    public static void main(String[] args) {
        School school = new School();
        Teacher teacher1 = new Teacher(1,"Hilbert","Schild",500);
        Teacher teacher2 = new Teacher(2,"James","Gosling",700);
        Teacher teacher3 = new Teacher(3,"John","Doe",600);

        Student student1 = new Student(1,"Jakhongir","Jakhongirov",4,30000);
        Student student2 = new Student(2,"Khumoyin","Khumoyinov",3,40000);
        Student student3 = new Student(3,"Dilshod","Dilshodov",1,25000);

        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        System.out.println("Earned Money : \t"+school.getTotalMoneyEarned());
        System.out.println("Spent Money : \t"+school.getTotalMoneySpent());
        System.out.println();

        student1.pay(5000);
        System.out.println(student1.getName() + " remained fees \t" + student1.getRemainingFees());

        teacher1.receiveSalary();

        System.out.println("Earned Money : \t"+school.getTotalMoneySpent());
        System.out.println("Spent Money : \t"+school.getTotalMoneySpent());

        student2.pay(6000);
        System.out.println(student2.getName() + " remained fees \t" + student2.getRemainingFees());
        teacher2.receiveSalary();

        System.out.println("Earned Money : \t"+school.getTotalMoneyEarned());
        System.out.println("Spent Money : \t"+school.getTotalMoneySpent());
        System.out.println();
        System.out.println(" The ha  ha sof dead learn progtraminng " +
                "th");

    }
}
