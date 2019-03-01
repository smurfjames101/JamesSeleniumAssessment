package com.qa.task1;

import java.util.Random;

public class Constants {
	//General
	static int randNum = new Random().nextInt();
	public static final String url = "http://35.197.226.83:8080";
	
	//navigateToNewItem
	public static final String login = "Admin";
	public static final String usernameInput = "j_username";
	public static final String passwordInput = "j_password";
	//addNewItem
	public static final String newItem = "New Item";
	public static final String newItemOkay = "ok-button";
	public static final String newItemSave ="yui-gen38-button";
	public static final String itemName = "name";
	public static final String newItemName = "Test" + randNum;
	public static final String freestyleProject ="//*[@id=\"j-add-item-type-standalone-projects\"]/ul/li[1]/label";
	
	//newUsers
	public static final String excelTestPath = "C:\\Users\\Admin\\Desktop\\AssessmentFriday.xlsx";
	public static final String manageJenkins = "Manage Jenkins";
	public static final String manageUsers = "//*[@id=\"main-panel\"]/div[16]/a";
	public static final String createUser = "//*[@id=\"tasks\"]/div[3]/a[2]";
	public static final String userName = "username";
	public static final String password1 = "password1";
	public static final String password2 = "password2";
	public static final String fullName = "fullname";
	public static final String email = "email";
	public static final String submitUser ="yui-gen1-button";
	

}
