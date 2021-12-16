package com.rofat;

import com.rofat.constant.Gender;
import com.rofat.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Insert student data into list
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(1,"Student A",1, Gender.Male,"12A"));
        students.add(new Student(2,"Student B",1, Gender.Male,"12B"));
        students.add(new Student(3,"Student C",1, Gender.Male,"12C"));
        students.add(new Student(4,"Student D",1, Gender.Male,"12A"));
        students.add(new Student(5,"Student E",1, Gender.Male,"12C"));
        students.add(new Student(6,"Student F",1, Gender.Male,"12B"));
        students.add(new Student(7,"Student G",1, Gender.Male,"12B"));
        students.add(new Student(8,"Student H",1, Gender.Male,"12A"));
        while(true) {
            //Declaration
            Scanner sc= new Scanner(System.in);
            //print
            System.out.print("Input a classroom to view student list:");
            //get input
            String GetStuList= sc.nextLine();
            //filter to get value
            List<Student> filtered = students.stream()
                            .filter(p -> p.getGrade().startsWith(GetStuList))
                            .collect(Collectors.toList());
            //output from filter
            System.out.println("Classroom:"+GetStuList);
            for(int i=0;i<filtered.size();i++)
            {
                System.out.println(filtered.get(i).getId()+"\t"+filtered.get(i).getName()+"\t"+filtered.get(i).getAge()+"\t"+filtered.get(i).getGender()+"\t"+filtered.get(i).getGrade());
            }
            //print
            System.out.println("Do you want to view the list of student from another classroom?");
            System.out.print("Y/N:");
            //get input
            String str= sc.next();
            // leaving the loop
            if(str.equals("N") || str.equals("n"))break;
        }
    }
}
