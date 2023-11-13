package method_reference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class Person{
    private int age;
    private String name;

    public Person(int age, String name){
        this.name = name;
        this.age = age;
    }

    public Person(String s, Integer integer) {
    }

    public static int compareByName(Person p1, Person p2){
        return p1.name.compareTo(p2.name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name + " (" + age + ")";
    }
}


public class MRTest{
    public static void main(String []args){

        //1.static method
        List<Person> people= Arrays.asList(new Person(17,"Bob"),
                                            new Person(21,"Darren")
        );

        //lambda
        people.sort((p1,p2)->Person.compareByName(p1,p2));

        //method reference
        people.sort(Person::compareByName);


        //2. entity method
        Comparator<Person> byAgeComparator = Comparator.comparingInt(Person::getAge);
        people.sort(byAgeComparator);


        //3. 类的实例方法引用
        // 不要尝试理解Function,将会被stream使用。
        Function<Person, String> getNameFunction = Person::getName;
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.sort(String::compareToIgnoreCase);

        // 4. 构造方法引用
        // 不要尝试理解BiFunction,将会被stream使用。
        BiFunction<String, Integer, Person> personCreator = Person::new;
        Person newPerson = personCreator.apply("David", 40);

        System.out.println(people);








    }
}