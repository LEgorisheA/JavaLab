package Lab6;

import java.io.IOException;
import java.util.*;

public class Schoolchild extends Learner {
    private int math;
    private int ruLang;
    private int enLang;
    private int history;
    private int schoolNumber;
    private Map<String, Integer> evaluations = new HashMap<>();
    private ArrayList<Olympiad> olympiads = new ArrayList<>();

    public Schoolchild(String name, String lastName, Sex sex,Integer schoolNumber, Integer age, int math, int ruLang,
                       int enLang, int history) throws IOException {
        super(name, lastName, sex, age);
        if (schoolNumber <= 0 || math > 5 || math < 2 || history > 5 || history < 2 || ruLang < 2 || ruLang > 5 ||
                enLang > 5 || enLang < 2) throw new IOException();
        this.schoolNumber = schoolNumber;
        this.math = math;
        this.history = history;
        this.ruLang = ruLang;
        this.enLang = enLang;
    }

    public Schoolchild(String name, String lastName, Sex sex, Integer age) {
        super(name, lastName, sex, age);
    }

    public Schoolchild(Learner learner) {
        super(learner);
    }

    public void setHistory(int history) throws IOException {
        if (history > 5 || history < 2) throw new IOException();
        this.history = history;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) throws IOException {
        if (schoolNumber <= 0) throw new IOException();
        this.schoolNumber = schoolNumber;
    }

    public void setMath(int math) throws IOException {
        if (math > 5 || math < 2) throw new IOException();
        this.math = math;
    }

    public void setRuLang(int ruLang) throws IOException {
        if (ruLang > 5 || ruLang < 2) throw new IOException();
        this.ruLang = ruLang;
    }

    public void setEnLang(int enLang) throws IOException {
        if (enLang > 5 || enLang < 2) throw new IOException();
        this.enLang = enLang;
    }

    public int getMath() {
        return math;
    }

    public int getRuLang() {
        return ruLang;
    }

    public int getEnLang() {
        return enLang;
    }

    public int getHistory() {
        return history;
    }

    public void setEvaluation(String object, int evaluation) {
        if (evaluation > 5 || evaluation < 2) throw new RuntimeException();
        evaluations.put(object.toLowerCase(), evaluation);
    }

    public int getEvaluation(String object) {
        return evaluations.get(object.toLowerCase());
    }

    public ArrayList<Olympiad> getOlympiads() {
        return olympiads;
    }

    public void addOlympiads(Olympiad olympiad) {
        olympiads.add(olympiad);
    }

    public void addOlympiads(ArrayList<Olympiad> olympiads) {
        for (Olympiad ol: olympiads) this.olympiads.add(ol);
    }


    public float averageEvaluation() {
        float sum = math + ruLang + enLang + history;
        for (Map.Entry<String, Integer> evaluation: evaluations.entrySet()) sum += evaluation.getValue();
        return sum / (evaluations.size() + 4);
    }


    private boolean checkEvaluations() {
        for (Map.Entry<String, Integer> evaluation: evaluations.entrySet()) if (evaluation.getValue() < 4) return false;
        return math == 5 && ruLang == 5 && enLang == 5 && history == 5;
    }

    private boolean checkOlympiads() {
        for (Olympiad olympiad: olympiads) {
            if (olympiad.getLevel() == Level.SCHOOL && olympiad.getPlace() == PrizePlace.WINNER ||
                    olympiad.getLevel() == Level.CITY && olympiad.getPlace() == PrizePlace.PRIZE_WINNER ||
                    olympiad.getLevel() == Level.REGIONAL && olympiad.getPlace() == PrizePlace.PARTICIPANT ||
                    olympiad.getLevel() == Level.CITY && olympiad.getPlace() == PrizePlace.WINNER ||
                    olympiad.getLevel() == Level.REGIONAL && olympiad.getPlace() == PrizePlace.WINNER ||
                    olympiad.getLevel() == Level.REGIONAL && olympiad.getPlace() == PrizePlace.PRIZE_WINNER
            ) return true;
        }
        return false;
    }

    public boolean checkGrant () {
        return checkEvaluations() && checkOlympiads();
    }

}
