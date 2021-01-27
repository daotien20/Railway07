package com.vti.entity;

public class KySu extends CanBo{
	private String	nganhDaoTao;
	
	
	public KySu(String fullName, int age, Gender gender, String address, String nganhDaoTao) {
		super(fullName, age, gender, address);
		this.nganhDaoTao = nganhDaoTao;
	}


	public KySu() {
	}


	public String getNganhDaoTao() {
		return nganhDaoTao;
	}


	public void setNganhDaoTao(String nganhDaoTao) {
		this.nganhDaoTao = nganhDaoTao;
	}
	
}
