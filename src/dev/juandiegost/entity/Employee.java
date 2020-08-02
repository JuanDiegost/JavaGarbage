package dev.juandiegost.entity;

public class Employee {
    private Long id;
    private String name;
    private String lastname;
    private String nit;
    private String mail;

    public Employee(Long id, String name, String lastname, String nit, String mail) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.nit = nit;
        this.mail = mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}

