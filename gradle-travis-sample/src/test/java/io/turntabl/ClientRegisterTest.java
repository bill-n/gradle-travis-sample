package io.turntabl;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ClientRegisterTest {

    @Test
    public void testGetGoldClientNames() {
        List<Client> newClients = Arrays.asList(
                new CorporateClient("Bill Ali",1002,ServiceLevel.Gold),
                new PrivateClient("Memuna Ali",1010,ServiceLevel.Gold),
                new CorporateClient("Imani Davis",1019,ServiceLevel.Gold),
                new PrivateClient("Fafa Akpedonu",1020,ServiceLevel.Platinum),
                new CorporateClient("Bliss Ali",1013,ServiceLevel.Premium),
                new PrivateClient("Moses Casey",1050,ServiceLevel.Platinum)
        );
        ClientRegister register =  new ClientRegister(newClients);
        List<String> expected = Arrays.asList("Bill Ali","Memuna Ali","Imani Davis");
        assertEquals("List of Gold Clients Names: ",expected,register.getGoldClientNames());
    }


    @Test
    public void testGetClientNameByID() {
        List<Client> newClients = Arrays.asList(
                new CorporateClient("Bill Ali",1002,ServiceLevel.Gold),
                new PrivateClient("Memuna Ali",1010,ServiceLevel.Gold),
                new CorporateClient("Imani Davis",1019,ServiceLevel.Gold),
                new PrivateClient("Fafa Akpedonu",1020,ServiceLevel.Platinum),
                new CorporateClient("Bliss Ali",1013,ServiceLevel.Premium),
                new PrivateClient("Moses Casey",1050,ServiceLevel.Platinum)
        );
        ClientRegister register =  new ClientRegister(newClients);
        Optional<String> expected = Optional.of("Memuna Ali");
        Optional<Client> actual = register.getClientNameByID(1010);
        assertEquals("Get Client's Name by ID: ",expected.get(),actual.get().getName());
    }


    @Test
    public void testCountServiceLevel() {
        List<Client> newClients = Arrays.asList(
                new CorporateClient("Bill Ali",1002,ServiceLevel.Gold),
                new PrivateClient("Memuna Ali",1010,ServiceLevel.Gold),
                new CorporateClient("Imani Davis",1019,ServiceLevel.Gold),
                new PrivateClient("Fafa Akpedonu",1020,ServiceLevel.Platinum),
                new CorporateClient("Bliss Ali",1013,ServiceLevel.Premium),
                new PrivateClient("Moses Casey",1050,ServiceLevel.Platinum)
        );
        ClientRegister register =  new ClientRegister(newClients);
        Map<ServiceLevel, Long> actual = register.countServiceLevel();
        Map<ServiceLevel, Long> expected = new HashMap<>();
        expected.put(ServiceLevel.Gold, (long) 3);
        expected.put(ServiceLevel.Platinum, (long) 2);
        expected.put(ServiceLevel.Premium, (long) 1);
        assertEquals("Get Count By Service Level: ",expected,actual);
    }

}