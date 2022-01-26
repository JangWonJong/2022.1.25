package com.example.sample.grade;

import java.util.Scanner;

/**
 * packageName: com.example.sample.grade
 * fileName   : GradeDemo
 * author     : Jangwonjong
 * date       : 2022-01-26
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-01-26     Jangwonjong       최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeAPP gradeAPP = new GradeAPP();
        String name = scanner.next();
        int kor = scanner.nextInt();
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        String grade = gradeAPP.getGrade(name,kor,eng,math);
        System.out.println(grade);

    }
}