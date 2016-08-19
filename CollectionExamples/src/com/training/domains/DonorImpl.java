package com.training.domains;

import java.util.List;

import com.training.ifaces.IDonor;

public class DonorImpl implements IDonor {

    private List<Donor>donorlist;
    
    public DonorImpl(List<Donor> donorlist){
        super();
        this.donorlist = donorlist;
    }
    
    @Override
    public boolean addDonor(Donor obj) {
        // TODO Auto-generated method stub
        donorlist.add(obj);
        return false;
    }

    @Override
    public boolean addDonors(Donor... dnrList) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void printDonorList() {
        // TODO Auto-generated method stub

    }

    @Override
    public List<Donor> getDonorList() {
        // TODO Auto-generated method stub
        return null;
    }

}
