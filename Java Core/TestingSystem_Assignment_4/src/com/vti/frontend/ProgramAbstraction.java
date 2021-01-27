package com.vti.frontend;

import com.vti.entity.VietnamesePhone;

public class ProgramAbstraction {

	public static void main(String[] args) {
		VietnamesePhone test = new VietnamesePhone();
		test.insertContact("Hà Kiều", "0123456789");
		test.removeContact("Hà Kiều");
		test.updateContact("Hà Kiều", "234567890");
		test.searchContact("Hà Kiều");
	}

}
