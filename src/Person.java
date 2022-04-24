import java.util.Objects;

public class Person {
    private String name;
    private Integer age;
    private Character gender;
    private int height;

    public Person(String name, Integer age, char gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(!this.getClass().equals(o.getClass())) {
            return false;
        }
//        if(o instanceof Person) {
//
//        }
        Person person = (Person) o;
        return this.name.equals(person.name)
                && Objects.equals(this.age, person.age)
                && this.gender == person.gender
                && this.height == person.height;
    }

    public String toString() {
        return name + " are " + age + " ani si inaltime " + height + " cm.";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getHeight() {
        return height;
    }
}


