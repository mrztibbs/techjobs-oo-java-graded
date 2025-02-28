package org.launchcode.techjobs.oo;

public class Employer extends JobField{

    public Employer(String value) {
        super();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    // Getters and Setters:
    //Removed to JobField abstract class

}
