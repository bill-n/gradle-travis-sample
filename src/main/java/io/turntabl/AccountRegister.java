package io.turntabl;

public class AccountRegister {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public io.turntabl.ServiceLevel getServiceLevel() {
        return ServiceLevel;
    }

    public void setServiceLevel(io.turntabl.ServiceLevel serviceLevel) {
        ServiceLevel = serviceLevel;
    }

    public AccountRegister(String name, int id, io.turntabl.ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        ServiceLevel = serviceLevel;
    }

    private String name;
    private int id;
    private ServiceLevel ServiceLevel;



}




