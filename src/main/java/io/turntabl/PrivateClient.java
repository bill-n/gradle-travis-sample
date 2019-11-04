package io.turntabl;

public class PrivateClient extends AccountRegister {
    @Override
    public String getName() {
        return super.getName();
    }

    public PrivateClient(String name, int id, io.turntabl.ServiceLevel serviceLevel) {
        super(name, id, serviceLevel);

        this.getName();
    }

}
