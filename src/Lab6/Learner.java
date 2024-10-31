package Lab6;

import java.util.Comparator;

abstract public class Learner{
    private String name;
    private String lastName;
    private Sex sex;
    private int age;


    public Learner(String name, String lastName, Sex sex, Integer age) {
        try {
            if (!name.matches("[A-Z][a-z]+") && !name.matches("[А-Я][а-я]+")){
                throw new RuntimeException();
            }
        } catch (RuntimeException exception) {
            System.out.println("Вы ввели имя с мальнекой буквы.");
            System.exit(0);
        }
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Learner(Learner learner) {
        name = learner.name;
        lastName = learner.lastName;
        sex = learner.sex;
        age = learner.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    abstract public boolean checkGrant();

    public boolean compareName(Learner a, Learner b) {
        int result = a.getName().compareTo(b.getName());
        if (result > 0 || result == 0) return true;
        return false;
    }
}



