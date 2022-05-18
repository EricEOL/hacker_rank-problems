package GradingStudents;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);

        System.out.println(grandingStudents(grades));
    }

    public static List<Integer> grandingStudents(List<Integer> grades) {
        List<Integer> newGrade = new ArrayList<>();

        for(int grade: grades) {
            if(grade >= 38) {
                int rest = grade % 5;
                double nextMultiple = Math.floor(grade / 5) * 5 + 5;
                if(rest >= 3) {
                    newGrade.add((int) nextMultiple);
                } else {
                    newGrade.add(grade);
                }
            } else {
                newGrade.add(grade);
            }
        }
        return newGrade;
    }
}
