package class_package;

public class Author {

    private String name;
    private int age;
    private char gender;
    private String education;

    Author(String name, int age, char gender, String education) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}
