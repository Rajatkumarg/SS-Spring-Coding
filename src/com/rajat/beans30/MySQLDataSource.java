package com.rajat.beans30;

public class MySQLDataSource implements DataSource{

	@Override
	public String[] getEmails() {
		return new String[] {"ghi.gmail.com","jkl.gmail.com"};
	}

}
