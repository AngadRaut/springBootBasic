package org.example.using_xml;

public class Animal {
    private int no;
    private String name;
    private Species species;
    private FoundInCountries countries;


    @Override
    public String toString() {
        return "Animal{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", species=" + species +
                ", countries=" + countries +
                '}';
    }

    public Animal(){
        super();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Animal(int no, String name, Species species, FoundInCountries countries) {
        this.no = no;
        this.name = name;
        this.species = species;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public FoundInCountries getCountries() {
        return countries;
    }

    public void setCountries(FoundInCountries countries) {
        this.countries = countries;
    }
}
