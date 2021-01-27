package com.vti.frontend;

import java.util.Scanner;

import com.vti.backend.QLTV;

public class ProgramQLTV {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			QLTV qltv = new QLTV();

			while(true) {
				System.out.println("Chương trình quản lý thư viện");
				System.out.println("1: Thêm mới tài liệu");
				System.out.println("2: Xóa tài liệu theo mã tài liệu");
				System.out.println("3: Hiển thị thông tin về tài liệu");
				System.out.println("4: Tìm kiếm tài liệu theo loại");
				System.out.println("5: Thoát khỏi chương trình");
				
				System.out.println("");
				System.out.println("Chọn chương trình muốn thực hiện");
				int x = scanner.nextInt();
				scanner.nextLine();
				
				if(x == 1) {
					while(true) {
						qltv.addNewTL();;
						
						System.out.println("Bạn có muốn thêm tài liệu không?");
						System.out.println("1: Có; 2: Không");
						int y = scanner.nextInt();
						if (y == 1) {
							continue;
						} else {
							qltv.outProgram();
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
						qltv.outProgram();
						break;
					}
					
				}else if(x == 2) {
					while(true) {
						qltv.deleteTL();
						System.out.println("Bạn có muốn tìm kiếm tiếp không?");
						System.out.println("1: Có; 2: Không");
						int y = scanner.nextInt();
						if (y == 1) {
							continue;
						} else {
							qltv.outProgram();
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
						qltv.outProgram();
						break;
					}
				}else if(x == 3) {
					qltv.infoTL();;
					System.out.println("");
					System.out.println("Bạn có muốn thực hiện chức năng khác không?");
					System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
						qltv.outProgram();
						break;
					}
				}else if(x == 4) {
					while(true) {
						qltv.searchTL();
						System.out.println("Bạn có muốn xóa thêm cán bộ không?");
						System.out.println("1: Có; 2: Không");
						int y = scanner.nextInt();
						if (y == 1) {
							continue;
						} else {
							qltv.outProgram();
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
						qltv.outProgram();
						break;
					}
				}else if(x == 5) {
					qltv.outProgram();
					break;
				}else {
					System.out.println("Nhập sai! Mời bạn nhập lại!");
					System.out.println("===========================");
					continue;
				}
			}
	}

}
