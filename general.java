package com.basic;

public class general {
	
	private int empnum;
	private String empName;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empnum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		general other = (general) obj;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empnum != other.empnum)
			return false;
		return true;
	}

	public int getEmpnum() {
		return empnum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpnum(int empnum) {
		this.empnum = empnum;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
