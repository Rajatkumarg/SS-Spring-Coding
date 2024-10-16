package com.rajat.beans30;

public class FileDataSource implements DataSource{

	@Override
	public String[] getEmails() {
		return new String[] {"abc.gmail.com","def.gmail.com"};
	}
}
