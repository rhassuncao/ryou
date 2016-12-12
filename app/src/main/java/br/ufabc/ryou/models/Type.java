package br.ufabc.ryou.models;

/**
 *
 * @author Notebook Asus
 */
public class Type {
    
    private int id_type;
    private String name;
    private String description;

    public int getId_type() {
        return id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    } 
}
