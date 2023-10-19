package ch.bfh.cas.mad.data;

public class PersonJava {
    private final String fistName;
    private final String familyName;
    private final int age;

    public PersonJava(String fistName, String familyName, int age) {
        this.fistName = fistName;
        this.familyName = familyName;
        this.age = age;
    }

    public String getFistName() { return fistName; }

    public String getFamilyName() { return familyName; }

    public int getAge() { return age; }

    @Override
    public boolean equals(Object o) {
        boolean result = true;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 0;
        return result;
    }
}
