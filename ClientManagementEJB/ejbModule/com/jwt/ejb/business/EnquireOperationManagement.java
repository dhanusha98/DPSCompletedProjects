package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface EnquireOperationManagement {

    public void searchEnquiry();
    public String insertEnquiry();
    public String updateEnquiry();
    public String deleteEnquiry();
}
