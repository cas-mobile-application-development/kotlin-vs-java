package ch.bfh.cas.mad.lambdas;

import ch.bfh.cas.mad.data.PersonJava;

import java.util.List;
import java.util.stream.Collectors;

public class FilterPersonJava {
    public List<PersonJava> filterMajor(List<PersonJava> persons) {
        return persons
                .stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
    }
}
