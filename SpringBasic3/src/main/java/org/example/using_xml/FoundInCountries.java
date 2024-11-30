package org.example.using_xml;

import java.util.List;

public class FoundInCountries {
    private List<String> countries;

    public List<String> getCountries() {
        return countries;
    }

    public FoundInCountries(){
        super();
    }

    public FoundInCountries(List<String> countries) {
        this.countries = countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "FoundInCountries{" + countries +
                '}';
    }
}
