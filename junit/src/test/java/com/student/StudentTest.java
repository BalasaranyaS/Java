package com.student;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


//import static com.student.Student.getStudentWithHighestTotalMarks;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student1, student2, student3;
    private Student students[] = {student1, student2, student3};
   // private Student students[];

    @BeforeEach
    void setUp() {
        // Initialize student instances with different marks and fees
        student1 = new Student(1, "Student One", "City A", 70, 80, 90, 1000.0f, false);
        student2 = new Student(2, "Student Two", "City B", 85, 90, 95, 800.0f, false);
        student3 = new Student(3, "Student Three", "City C", 60, 70, 80, 1200.0f, false);


    }

    @Test
    public void  testHighestTotalMarks() {
      Student[] students = {student1, student2, student3};
        Student highestMarksStudent = Student.getStudentWithHighestTotalMarks(students);
        assertEquals(student2, highestMarksStudent, "Student with the highest total marks should be Student Two");
    }

    @Test
    public void testLeastMonthlyFee() {
      Student[] students = {student1, student2, student3};
        Student leastFeeStudent = Student.getStudentWithLeastMonthlyFee(students);
        assertEquals(student2, leastFeeStudent, "Student with the least monthly fee should be Student Two");
    }

    @Test
    void testScholarshipEligibility() {
        // Assuming a method isEligibleForScholarship exists for each student instance
        student1.setEligibleForScholarship(student1.isEligibleForScholarship());
        student2.setEligibleForScholarship(student2.isEligibleForScholarship());
        student3.setEligibleForScholarship(student3.isEligibleForScholarship());

        assertFalse(student2.isEligibleForScholarship(), "Student Two should be eligible for a scholarship based on predefined criteria");
        assertFalse(student1.isEligibleForScholarship(), "Student One should not be eligible for a scholarship based on predefined criteria");
        assertFalse(student3.isEligibleForScholarship(), "Student Three should not be eligible for a scholarship based on predefined criteria");
    }
//    @Test
//    void testDisplayDetails(){
//        Student[] students = {student1, student2, student3};
//        Student student;
//
//
//        String exceptedValue="Student One240passFalse";
//
//        Student actual=(Student.displayDetails(students);


}

