package org.launchcode.techjobs.oo;

public class PositionType extends JobField{

    public PositionType(String value) {
        super();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:
    //Removed to JobField abstract class

    @Override
    public String toString () {return value;}

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return this.getId()== positionType.getId();
    }
}
