package lab7;

import Lab6.Learner;
import Lab6.Schoolchild;
import Lab6.Student;

import java.util.Comparator;

public class MyComparators {
    public static class NameComparator implements Comparator<Learner> {
        @Override
        public int compare(Learner o1, Learner o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static class LastNameComparator implements Comparator<Learner> {
        @Override
        public int compare(Learner o1, Learner o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class ScGradeComparator implements Comparator<Schoolchild> {
        @Override
        public int compare(Schoolchild o1, Schoolchild o2) {
            if (Float.compare(o1.averageEvaluation(), o2.averageEvaluation()) == 0)
                return Integer.compare(o1.getSchoolNumber(),
                        o2.getSchoolNumber());
            else {
                return Float.compare(o1.averageEvaluation(), o2.averageEvaluation());
            }
        }
    }

    public static class ReverseComparator implements Comparator<Double> {
        @Override
        public int compare(Double a1, Double a2) {
            if (Double.compare(a1, a2) == 1) return -1;
            else if (Double.compare(a1, a2) == -1) return 1;
            return 0;
        }
    }

    public static class StGradeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Float.compare(o1.averageGrade(), o2.averageGrade());
        }
    }

    public static class SchoolNumberComparator implements Comparator<Schoolchild> {
        @Override
        public int compare(Schoolchild s1, Schoolchild s2) {
            return Integer.compare(s1.getSchoolNumber(), s2.getSchoolNumber());
        }
    }
}

