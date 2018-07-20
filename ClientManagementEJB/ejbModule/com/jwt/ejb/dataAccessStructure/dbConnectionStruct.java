package com.jwt.ejb.dataAccessStructure;

import java.sql.Connection;

import javax.ejb.Remote;

@Remote
public interface dbConnectionStruct {

	public Connection dbConnection();
}
