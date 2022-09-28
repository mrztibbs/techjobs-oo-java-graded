package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        try {
            this.name = name;
            this.employer = employer;
            this.location = location;
            this.positionType = positionType;
            this.coreCompetency = coreCompetency;
        } catch(Exception e) {
            if (this.getId() != 0 && this.name == "" || this.getEmployer().getValue() == ""
                    || this.getLocation().getValue() == "" || this.getPositionType().getValue() == ""
                    || this.getCoreCompetency().getValue() == "") {
            System.out.println("OOPS! This job does not seem to exist.");
            }
        }

    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return this.getId() == job.getId();
    }

    public int hashCode () {return Objects.hash(getId());}

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

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

    public String toString () {
        String msg = "Data not available";
        String jobString;
             if (this.id == 0) { jobString = "\nID: " + msg + "\n";} else { jobString= "\nID: " + id + "\n";}
             if (this.name == "") {jobString = jobString + "Name: " + msg + "\n";} else {jobString = jobString + "Name: " + this.name + "\n";}
             if (this.employer.getValue() == "") {jobString = jobString + "Employer: " + msg + "\n";} else {jobString = jobString + "Employer: " + this.employer + "\n";}
             if (this.location.getValue() == "") {jobString = jobString + "Location: " + msg + "\n";} else {jobString = jobString + "Location: " + this.location + "\n";}
             if (this.positionType.getValue() == "") {jobString = jobString + "Position Type: " + msg + "\n";} else {jobString = jobString + "Position Type: " + this.positionType + "\n";}
             if (this.coreCompetency.getValue() == "") {jobString = jobString + "Core Competency: " + msg + "\n";} else {jobString = jobString + "Core Competency: " + this.coreCompetency + "\n";}
        return jobString;
    }
}
