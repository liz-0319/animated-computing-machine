package ru.mirea.pr2;

public class Author {

    private String name = "One";
    private String email = "Two";
    private char gender = 'T';

    public Author (String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return name + "(" + gender + ") : " + email;
    }

}
