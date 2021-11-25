package com.baa.boost.CodingMarathon.SchoolApplication.employers;

import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Employee;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.Name;
import com.baa.boost.CodingMarathon.SchoolApplication.commonClass.PhoneNumber;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Gender;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.MarriageStatus;
import com.baa.boost.CodingMarathon.SchoolApplication.enums.Occupation;

public class Officer extends Employee {
	
	public Officer() {
		// TODO Auto-generated constructor stub
	}
	
	public Officer(Name name, Gender gender, int age, Occupation occupation, int startingDate, int leavingDate,
			PhoneNumber phoneNumber, String regNo, double startingSalary, MarriageStatus marriageStatus) {
		super(name, gender, age, occupation, startingDate, leavingDate, phoneNumber, regNo, startingSalary,
				marriageStatus);
		
	}
	
	@Override
	public String toString() {
		return "Officer [marriageStatus=" + marriageStatus + ", name=" + name + ", gender=" + gender + ", age=" + age
				+ ", occupation=" + occupation + ", startingDate=" + startingDate + ", leavingDate=" + leavingDate
				+ ", getRegNo()=" + getRegNo() + ", getStartingSalary()=" + getStartingSalary() + ", getPhoneNumber()="
				+ getPhoneNumber() + "]";
	}
	
}
