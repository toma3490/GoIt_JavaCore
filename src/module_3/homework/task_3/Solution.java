package module_3.homework.task_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        Course[] course = new Course[5];
        course [0] = new Course(new Date(), "Jason");
        course [1] = new Course(10, "Mr. Teacher");
        course [2] = new Course(8, "Mrs. Smith");
        course [3] = new Course(new Date(), "Tyler");
        course [4] = new Course(2, "Mr. Tucker");

        Student student1 = new Student("John", "Smith", 1);
        Student student2 = new Student("Dow", course);
        CollegeStudent collegeStudent1 = new CollegeStudent("Nicolas", "Kage", 5);
        CollegeStudent collegeStudent2 = new CollegeStudent("Bullock", course);
        CollegeStudent collegeStudent3 = new CollegeStudent("Sam", "Smith", 5, "MIT", 2, 1205);
        SpecialStudent specialStudent1 = new SpecialStudent("Vin", "Diesel", 3);
        SpecialStudent specialStudent2 = new SpecialStudent("Waker", course);
        SpecialStudent specialStudent3 = new SpecialStudent("Walter", "Melon", 3, 12594489, "WM@gmail.com");
    }
}
