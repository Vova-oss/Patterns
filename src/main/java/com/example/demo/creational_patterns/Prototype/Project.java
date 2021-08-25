package com.example.demo.creational_patterns.Prototype;

public class Project implements Prototype{

    private String name;
    private String stuff;
    private String version;

    public Project(String name, String stuff, String version) {
        this.name = name;
        this.stuff = stuff;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuff() {
        return stuff;
    }

    public void setStuff(String stuff) {
        this.stuff = stuff;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public Object copy() {
        return new Project(name, stuff, version);
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", stuff='" + stuff + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
