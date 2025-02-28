package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField{

    public CoreCompetency(String value) {
        super();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.

    public int getId() {
        return id;
    }

}
