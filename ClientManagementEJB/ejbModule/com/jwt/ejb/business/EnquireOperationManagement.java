package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface EnquireOperationManagement {

    public void searchEnquiry();
    public void insertEnquiry();
    public void updateEnquiry();
    public void deleeEnquiry();
}
