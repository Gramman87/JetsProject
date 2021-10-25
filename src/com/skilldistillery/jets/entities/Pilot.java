package com.skilldistillery.jets.entities;

import java.util.Objects;

public class Pilot extends Person {
	private String rank;
	private int empNum;

	public Pilot(String firstName, String lastName, int age, String rank, int empNum) {
		super(firstName, lastName, age);
		this.rank = rank;
		this.empNum = empNum;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public int getEmpNum() {
		return empNum;
	}

	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(empNum, rank);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pilot other = (Pilot) obj;
		return empNum == other.empNum && Objects.equals(rank, other.rank);
	}

	@Override
	public String toString() {
		return "Pilot [rank: " + rank + ", empNum: " + empNum + super.toString() + "]";
	}


	
}
