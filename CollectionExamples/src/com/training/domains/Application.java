package com.training.domains;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<Donor> donorlist = new ArrayList<Donor>(); 
        Donor d = new Donor(0, null, 0, null);
        
        DonorImpl hi = new DonorImpl(donorlist);
        hi.addDonor(d);
        
        Donor donor1 = new Donor(102, "John", 84899, "john@abc.com");
        Donor donor2 = new Donor(102, "Bob", 19082, "bob@abc.com");
        Donor donor3 = new Donor(102, "Greg", 39785, "greg@abc.com");
        
        hi.addDonors(donor1, donor2, donor3);
        
        List<Donor>donorList=hi.getDonorList();
        
//        for(Donor obj:donorList) {
//            System.out.println(obj);
//        }
        
        StringBuffer b = new StringBuffer();
        b.append("hi").append("hi").append("hi");
        
        System.out.println(b);
        
        


    }

}
