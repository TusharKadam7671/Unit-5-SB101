package com.question3;

import java.util.Objects;

public class AdditionalMembers implements Comparable<AdditionalMembers>{
	
	private int memberId;
	private String memberName;
	private int membershipNo;
	private int memberShipEnddate;

	public AdditionalMembers()
	{
		
	}

	public AdditionalMembers(int memberId, String memberName, int membershipNo, int memberShipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.memberShipEnddate = memberShipEnddate;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}

	public int getMemberShipEnddate() {
		return memberShipEnddate;
	}

	public void setMemberShipEnddate(int memberShipEnddate) {
		this.memberShipEnddate = memberShipEnddate;
	}

	@Override
	public String toString() {
		return "AdditionalMembers [memberId=" + memberId + ", memberName=" + memberName + ", membershipNo="
				+ membershipNo + ", memberShipEnddate=" + memberShipEnddate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdditionalMembers other = (AdditionalMembers) obj;
		return memberId == other.memberId || this.getMembershipNo()==other.getMembershipNo();
	}

	@Override
	public int compareTo(AdditionalMembers o) {
		// TODO Auto-generated method stub
		if(this.getMemberShipEnddate() > o.getMemberShipEnddate())
		{
			return +1;
		}else
		{
			return -1;
		}
	}
	
	
	
	
}
