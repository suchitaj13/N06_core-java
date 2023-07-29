//program to demonstrate on Encapsulation
/*Encapsulation achieves a data hiding using private access
 * specifier*/
package org.tnsif.encapsulation;

public class HDFC {
	
	//private data members
	
	private String accType;
	private long accountNO;
	private long atmCardNO;
	private int pinNo;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAccountNO() {
		return accountNO;
	}
	public void setAccountNO(long accountNO) {
		this.accountNO = accountNO;
	}
	public long getAtmCardNO() {
		return atmCardNO;
	}
	public void setAtmCardNO(long atmCardNO) {
		this.atmCardNO = atmCardNO;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accountNO=" + accountNO + ", atmCardNO=" + atmCardNO + ", pinNo=" + pinNo
				+ "]";
	}

}
