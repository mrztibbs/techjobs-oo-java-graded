package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    int id;
    static int nextId = 1;
    String value;
    String name;
    Employer employer;
    Location location;
    PositionType positionType;
    CoreCompetency coreCompetency;

    public JobField() {
        id = nextId;
        nextId++;
    }

    int getId() {return id;}

    String getName () {return name;}

    void setName (String name) {this.name = name;}

    Employer getEmployer() {return employer;}

    void setEmployer(Employer employer) {this.employer = employer;}

    Location getLocation() {return location;}

   void setLocation (Location location) {this.location = location;}

    PositionType getPositionType () {return positionType;}

    void setPositionType(PositionType positionType) {this.positionType = positionType;}

    CoreCompetency getCoreCompetency() {return coreCompetency;}

    void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getValue() {return value;}

    public void setValue(String value) {this.value = value;}

}
