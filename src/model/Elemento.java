package model;

import java.util.Date;

/**
 *
 * @author jorge
 */
public class Elemento {
    String location;
    String autor;
    String name;
    Date year;
    String method;
    String State;
    String Matirial;

    public Elemento(String location, String autor, String name, Date year, String method, String State, String Matirial) {
        this.location = location;
        this.autor = autor;
        this.name = name;
        this.year = year;
        this.method = method;
        this.State = State;
        this.Matirial = Matirial;
    }

    public String getLocation() {
        return location;
    }

    public String getAutor() {
        return autor;
    }

    public String getName() {
        return name;
    }

    public Date getYear() {
        return year;
    }

    public String getMethod() {
        return method;
    }

    public String getState() {
        return State;
    }

    public String getMatirial() {
        return Matirial;
    }
    

}
