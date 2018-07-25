package com.jwt.ejb.dataAccessStructure;

import java.sql.Connection;

import javax.ejb.Remote;

@Remote
public interface dbConnectionStruct {
	
	//INTERFACE TO BUILD DATABASE CONNECTION

	public Connection dbConnection(); //METHOD FOR DATABASE CONNECTION OPERATION
}
