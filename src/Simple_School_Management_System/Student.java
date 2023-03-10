package Simple_School_Management_System;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int grade;
    private double feesPaid ;
    private double feesTotal;
    private School school;

    public  Student(int id,String firstName,String lastName,int grade,double feesTotal){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesTotal = feesTotal;
        this.feesPaid = 0;
    }

    public Student(int id, String firstName, String lastName, int grade, double feesPaid, double feesTotal, School school) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
        this.school = school;
    }

    public  int getId(){
        return  id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public  int getGrade(){
        return  grade;
    }

    public  double getFeesPaid(){
        return  feesPaid;
    }

    public  double getFeesTotal(){
        return  feesTotal;

    }

    public  double getRemainingFees(){
        return feesTotal - feesPaid;
    }

    public void  setGrade(int grade){
        this.grade = grade;
    }

    public  String getName(){
        return firstName +"\t"+lastName;
    }

    public  void  pay(double fees){
        feesPaid += fees;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", feesPaid=" + feesPaid +
                ", feesTotal=" + feesTotal +
                ", school=" + school +
                '}';
    }
}

