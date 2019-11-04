package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Main {


    public static void main(String[] args){

        List<PrivateClient> Client = new Arrays.asList(
                new PrivateClient("ben",102,ServiceLevel.GOLD),
                new PrivateClient("ali", 122, ServiceLevel.GOLD),
                new PrivateClient("yaa", 120, ServiceLevel.PLATINUM),
                new PrivateClient("Cassie", 200, ServiceLevel.PREMMIUM),
                new PrivateClient("Henry", 400, ServiceLevel.PLATINUM),
                new PrivateClient("eva", 400, ServiceLevel.GOLD)
        );

        List<PrivateClient> goldClient = new ArrayList<>();
        for (PrivateClient privateclient : PrivateClient){
            //Names of all the Gold clients
            if(privateclient.getServiceLevel()==ServiceLevel.GOLD) {
                goldClient.add(privateclient);


            }


        }




    }
}
