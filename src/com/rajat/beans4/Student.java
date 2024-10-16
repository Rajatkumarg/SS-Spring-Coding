package com.rajat.beans4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Student {
	private String name;
	private int rollno;
	private String[] subjects;
	private List<String> subjectList;
	private List<Integer> marks;
	private LinkedList<Long> mobileNo;
	private Set<String> emails;
	private TreeSet<String> emialsInIncOrder;
	private Map<String, Integer> subjectMarksMap;
	private Map<String, Integer> subjectMarksMapAsc;
	
	public Map<String, Integer> getSubjectMarksMapAsc() {
		return subjectMarksMapAsc;
	}

	public void setSubjectMarksMapAsc(Map<String, Integer> subjectMarksMapAsc) {
		this.subjectMarksMapAsc = subjectMarksMapAsc;
	}

	public Map<String, Integer> getSubjectMarksMap() {
		return subjectMarksMap;
	}

	public void setSubjectMarksMap(Map<String, Integer> subjectMarksMap) {
		this.subjectMarksMap = subjectMarksMap;
	}

	public TreeSet<String> getEmialsInIncOrder() {
		return emialsInIncOrder;
	}

	public void setEmialsInIncOrder(TreeSet<String> emialsInIncOrder) {
		this.emialsInIncOrder = emialsInIncOrder;
	}

	public Set<String> getEmails() {
		return emails;
	}

	public void setEmails(Set<String> emails) {
		this.emails = emails;
	}

	public LinkedList<Long> getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(LinkedList<Long> mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Student() {
		super();
		System.out.println("Creating Student object...");
	}
	
	public void setName(String name) {
		System.out.println("Initializing name...");
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		System.out.println("Initializing rollno...");
		this.rollno = rollno;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public List<String> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", subjects=" + Arrays.toString(subjects)
				+ ", subjectList=" + subjectList + ", marks=" + marks + ", mobileNo=" + mobileNo + ", emails=" + emails
				+ ", emialsInIncOrder=" + emialsInIncOrder + ", subjectMarksMap=" + subjectMarksMap
				+ ", subjectMarksMapAsc=" + subjectMarksMapAsc + "]";
	}

}
