package sda.jackson;

import org.codehaus.jackson.map.annotate.JsonSerialize;

//adnotacja pomija pola o wartości null w czasie tworzenia JSONa
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Person {
    private String name;
    private String lastName;
    private int age;
    private PersonAddress address;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonAddress getAddress() {
        return address;
    }

    public void setAddress(PersonAddress address) {
        this.address = address;
    }
}
