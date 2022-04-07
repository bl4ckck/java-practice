package week3.streampractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApplication {
    public static void main(String[] args) {
        Person nama1 = new Person("Alvin", "Bekasi", 22);
        Person nama2 = new Person("Adit", "Jakarta", 23);
        Person nama3 = new Person("Awe", "Bekasi", 21);

        List<Person> personList = new ArrayList<>();
        personList.add(nama1);
        personList.add(nama2);
        personList.add(nama3);

        List<String> namaList = personList.stream().map(Person::getName).collect(Collectors.toList());
        List<String> cityList = personList.stream().map(Person::getCity).collect(Collectors.toList());
        Set<String> cityOne = personList.stream().map(Person::getCity).collect(Collectors.toSet());
        List<String> filterAge = personList.stream().filter(val -> val.getAge() > 21).map(Person::getName).collect(Collectors.toList());
        List<Person> objFilter = personList.stream().filter(val -> val.getAge() > 21).collect(Collectors.toList());

        Anak[] anak = new Anak[]{new Anak("anaknya"), new Anak("anaknya 2")};
        List<List<Anak>> anakList = new ArrayList<>();
        anakList.add(Arrays.asList(anak));

        List<Anak> flatten = anakList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(namaList);
        System.out.println(cityList);
        System.out.println(cityOne);
        System.out.println(filterAge);
        System.out.println(objFilter);

        flatten.forEach(e -> System.out.println(e.getName()));
//        System.out.println(flatten);

        sorted();
    }

    public static void sorted() {
        List<String> list = new ArrayList<>() {
            {add("nama4");}
            {add("nama2");}
            {add("nama3");}
        };

        List<String> listSorted = list.stream().sorted().collect(Collectors.toList());
        List<String> listSortedReversed = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(listSorted);
        System.out.println(listSortedReversed);
        System.out.println(Integer.valueOf(2));
    }
}

class Anak {
    private String name;

    public Anak(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Person {
    private String name;
    private String city;
    private int age;


    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}