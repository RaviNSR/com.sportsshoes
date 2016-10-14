package com.sportsshoes.User;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 669561422177332417L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int UID;

private String FIRST_NAME;
private String LAST_NAME;
private String EMAIL;
private String PASSWORD;
@Transient
private String CONFIRMATION_PASSWORD;
private String MOBILE_NUMBER;
private int Role=1;
private boolean Active=true;


public int getUID() {
	return UID;
}


public void setUID(int uID) {
	UID = uID;
}


public String getFIRST_NAME() {
	return FIRST_NAME;
}


public void setFIRST_NAME(String fIRST_NAME) {
	FIRST_NAME = fIRST_NAME;
}


public String getLAST_NAME() {
	return LAST_NAME;
}


public void setLAST_NAME(String lAST_NAME) {
	LAST_NAME = lAST_NAME;
}


public String getEMAIL() {
	return EMAIL;
}


public void setEMAIL(String eMAIL) {
	EMAIL = eMAIL;
}


public String getPASSWORD() {
	return PASSWORD;
}


public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}


public String getCONFIRMATION_PASSWORD() {
	return CONFIRMATION_PASSWORD;
}


public void setCONFIRMATION_PASSWORD(String cONFIRMATION_PASSWORD) {
	CONFIRMATION_PASSWORD = cONFIRMATION_PASSWORD;
}


public String getMOBILE_NUMBER() {
	return MOBILE_NUMBER;
}


public void setMOBILE_NUMBER(String mOBILE_NUMBER) {
	MOBILE_NUMBER = mOBILE_NUMBER;
}


public int getRole() {
	return Role;
}


public void setRole(int role) {
	Role = role;
}


public boolean isActive() {
	return Active;
}


public void setActive(boolean active) {
	Active = active;
}


public static long getSerialversionuid() {
	return serialVersionUID;
}


@Override
public String toString()
{
	return "{UID:\"" + UID + "\", EMAIL:\"" + EMAIL + "\", FIRST_NAME:\"" + FIRST_NAME + "\", LAST_NAME:\"" + LAST_NAME + "\", MOBILE_NUMBER:\"" + MOBILE_NUMBER + "\", PASSWORD:\"" + PASSWORD + "\", Role:\"" + Role + "\", Active:" + Active + ", Delete: false}";
	
}
}

