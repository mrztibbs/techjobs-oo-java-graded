package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    public int getId() {return id;}

    public String getName () {return name;}

    public void setName (String name) {this.name = name;}

    public Employer getEmployer() {return employer;}

    public void setEmployer(Employer employer) {this.employer = employer;}

    public Location getLocation() {return location;}

    public void setLocation (Location location) {this.location = location;}

    public PositionType getPositionType () {return positionType;}

    public void setPositionType(PositionType positionType) {this.positionType = positionType;}

    public CoreCompetency getCoreCompetency() {return coreCompetency;}

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int hashCode() {
        return Objects.hash(getId());
    }

}
