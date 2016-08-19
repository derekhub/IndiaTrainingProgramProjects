package com.training.ifaces;

import java.util.List;

import com.training.domains.Donor;

public interface IDonor {

    public boolean addDonor(Donor obj);
    public boolean addDonors(Donor...dnrList);
    public void printDonorList();
    public List<Donor> getDonorList();
    
}
