package Lab6;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Student extends Learner{
    private Map<String, Integer> sessionEvaluations = new HashMap<>();
    private Map<String, Integer> courseworkGrades = new HashMap<>();

    public Student(String name, String lastName, Sex sex, int age) {
        super(name, lastName, sex, age);
    }

    public Student(Learner learner) {
        super(learner);
    }

    public void setCourseworkGrade(String courseName, int grade) throws IOException {
        if (grade > 5 || grade < 2) throw new IOException();
        courseworkGrades.put(courseName.toLowerCase(), grade);
    }

    public void setSessionEvaluation(String objectName, int grade) throws IOException {
        if (grade > 5 || grade < 2) throw new IOException();
        sessionEvaluations.put(objectName.toLowerCase(), grade);
    }

    public Map<String, Integer> getCourseworkGrades() {
        return courseworkGrades;
    }

    public Map<String, Integer> getSessionEvaluations() {
        return sessionEvaluations;
    }

    public int getCourseworkGrade(String courseworkName) {
        return courseworkGrades.get(courseworkName.toLowerCase());
    }

    public int getObjectGrade(String objectName) {
        return sessionEvaluations.get(objectName.toLowerCase());
    }

    private boolean checkCourseworkGrades() {
        for (Integer evaluation: courseworkGrades.values()) {if (evaluation != 5) return false;}
        return true;
    }

    private boolean checkSessionAverage() {
        if (sessionEvaluations.size() == 0) return false;
        int sessionAverage = 0;
        for (Integer num: sessionEvaluations.values()) sessionAverage += num;
        sessionAverage = sessionAverage / sessionEvaluations.size();
        return sessionAverage >= 4.75;
    }

    public boolean checkGrant() {
        return checkSessionAverage() && checkCourseworkGrades();
    }

    public float averageGrade() {
        if (courseworkGrades.size() == 0 && sessionEvaluations.size() == 0) return 0;
        int sum = 0;
        for (Integer evaluation: courseworkGrades.values()) sum += evaluation;
        for (Integer evaluation: sessionEvaluations.values()) sum += evaluation;
        return sum / (courseworkGrades.size() + sessionEvaluations.size());
    }
}
