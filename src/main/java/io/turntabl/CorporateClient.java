package io.turntabl;
public class CorporateClient extends AccountRegister{

    @Override
    public String getName() {
        return super.getName();
    }

    public CorporateClient(String name, int id, io.turntabl.ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);
        this.getName();
    }
}
