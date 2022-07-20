package org.example;
import java.util.HashMap;
import java.util.Map;
public class Registry {
    private Map<Person_gender, Person> Persons = new HashMap<>();
    public Registry() {
        this.initialize();
    }
    public Person getPerson(Person_gender person_gender){
        Person person =null;
        try {
             person = (Person) Persons.get(person_gender).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return person;}
    public void initialize(){
        Student student1 =new Student();
        student1.setSID(001);
        student1.setName("Kamal");
        Teacher teacher = new Teacher();
        teacher.setTID(101);
        teacher.setName("Nimal");
        Persons.put(Person_gender.MALE, student1);
        Persons.put(Person_gender.FEMALE, teacher);

    }
}
