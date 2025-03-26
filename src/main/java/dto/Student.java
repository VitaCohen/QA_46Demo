package dto;

import enums.Gender;
import enums.Hobbies;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private String email;
    private Gender gender;
    private String mobile;
    private String dateOfBitrh;
    private String subjects;
    private List<Hobbies> hobbies;
    private String picture;
    private String address;
    private String state;
    private String city;


    public Student() {}

    public Student(String name, String lastName, String email,
                   Gender gender, String mobile, String dateOfBitrh,
                   String subjects, List<Hobbies> hobbies, String picture,
                   String address, String state, String city) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.mobile = mobile;
        this.dateOfBitrh = dateOfBitrh;
        this.subjects = subjects;
        this.hobbies = hobbies;
        this.picture = picture;
        this.address = address;
        this.state = state;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDateOfBitrh() {
        return dateOfBitrh;
    }

    public void setDateOfBitrh(String dateOfBitrh) {
        this.dateOfBitrh = dateOfBitrh;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public List<Hobbies> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<Hobbies> hobbies) {
        this.hobbies = hobbies;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", mobile='" + mobile + '\'' +
                ", dateOfBitrh='" + dateOfBitrh + '\'' +
                ", subjects='" + subjects + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", picture='" + picture + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(email, student.email) && Objects.equals(gender, student.gender) && Objects.equals(mobile, student.mobile) && Objects.equals(dateOfBitrh, student.dateOfBitrh) && Objects.equals(subjects, student.subjects) && Objects.equals(hobbies, student.hobbies) && Objects.equals(picture, student.picture) && Objects.equals(address, student.address) && Objects.equals(state, student.state) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, email, gender, mobile, dateOfBitrh, subjects, hobbies, picture, address, state, city);
    }


}
