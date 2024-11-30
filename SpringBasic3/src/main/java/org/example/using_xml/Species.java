package org.example.using_xml;

public class Species {
    private String species;

    public Species(String species) {
        this.species = species;
    }
    public Species(){
        super();
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Species{ "+ species + '\'' +
                '}';
    }
}
