package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.QLCB;

public class ProgramQLCB {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();
		
		while(true) {
			System.out.println("Chương trình quản lý cán bộ");
			System.out.println("1: Thêm mới cán bộ");
			System.out.println("2: Tìm kiếm theo họ tên");
			System.out.println("3: Hiển thị thông tin về danh sách các cán bộ");
			System.out.println("4: Xóa cán bộ");
			System.out.println("5: Thoát khỏi chương trình");
			
			System.out.println("");
			System.out.println("Chọn chương trình muốn thực hiện");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if(x == 1) {
				while(true) {
					qlcb.addNewCB();
					
					System.out.println("Bạn có muốn thêm cán bộ không?");
					System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						qlcb.outProgram();
						break;
					}
				}
				
				System.out.println("");
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					qlcb.outProgram();
					break;
				}
				
			}else if(x == 2) {
				while(true) {
					qlcb.searchCB();
					System.out.println("Bạn có muốn tìm kiếm tiếp không?");
					System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						qlcb.outProgram();
						break;
					}
				}
				
				System.out.println("");
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					qlcb.outProgram();
					break;
				}
			}else if(x == 3) {
				qlcb.infoCB();
				System.out.println("");
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					qlcb.outProgram();
					break;
				}
			}else if(x == 4) {
				while(true) {
					qlcb.deleteCB();
					System.out.println("Bạn có muốn xóa thêm cán bộ không?");
					System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						qlcb.outProgram();
						break;
					}
				}
				
				System.out.println("");
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					qlcb.outProgram();
					break;
				}
			}else if(x == 5) {
				qlcb.outProgram();
				break;
			}else {
				System.out.println("Nhập sai! Mời bạn nhập lại!");
				System.out.println("===========================");
				continue;
			}
		}
	}

}
