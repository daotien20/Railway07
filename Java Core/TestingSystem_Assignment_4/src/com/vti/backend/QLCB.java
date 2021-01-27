package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;

public class QLCB {
	List<CanBo> danhSachCB = new ArrayList<CanBo>();
	
	
	public void addNewCB() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Thêm mới cán bộ: ");
			System.out.println("1: Công Nhân; 2: Kỹ Sư; 3: Nhân Viên");
			int x = scanner.nextInt();
			scanner.nextLine();
			if (x == 1) {
				System.out.println("Thêm cán bộ Công Nhân");
				CongNhan canBo1 = new CongNhan();
				
				System.out.println("Nhập tên cán bộ: ");
				canBo1.setFullName(scanner.nextLine());
				
				System.out.println("Nhập tuổi: ");
				canBo1.setAge(scanner.nextInt());
				
				System.out.println("Giới tính của cán bộ:");
				System.out.println("Chọn giới tính: ");
				System.out.println("1: Male; 2: Female; 3: Unknwon");
				canBo1.setGender(scanner.nextInt());
				
				scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				canBo1.setAddress(scanner.nextLine());
				
				System.out.println("Nhập bậc của công nhân: ");
				canBo1.setLevel(scanner.nextInt());
				
				danhSachCB.add(canBo1);
				break;
				
			}else if( x == 2) {
				System.out.println("Thêm cán bộ Kỹ Sư");
				KySu canBo1 = new KySu();
				
				System.out.println("Nhập tên cán bộ: ");
				canBo1.setFullName(scanner.nextLine());
				
				System.out.println("Nhập tuổi: ");
				canBo1.setAge(scanner.nextInt());
				
				System.out.println("Giới tính của cán bộ:");
				System.out.println("Chọn giới tính: ");
				System.out.println("1: Male; 2: Female; 3: Unknwon");
				canBo1.setGender(scanner.nextInt());
				
				scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				canBo1.setAddress(scanner.nextLine());
				
				System.out.println("Nhập ngành đào tạo của kỹ sư: ");
				canBo1.setNganhDaoTao(scanner.nextLine());
				
				danhSachCB.add(canBo1);
				break;
				
			}else if( x == 3) {
				System.out.println("Thêm cán bộ Nhân Viên");
				NhanVien canBo1 = new NhanVien();
				
				System.out.println("Nhập tên cán bộ: ");
				canBo1.setFullName(scanner.nextLine());
				
				System.out.println("Nhập tuổi: ");
				canBo1.setAge(scanner.nextInt());
				
				System.out.println("Giới tính của cán bộ:");
				System.out.println("Chọn giới tính: ");
				System.out.println("1: Male; 2: Female; 3: Unknwon");
				canBo1.setGender(scanner.nextInt());
				
				scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				canBo1.setAddress(scanner.nextLine());
				
				System.out.println("Nhập công việc của nhân viên: ");
				canBo1.setCongViec(scanner.nextLine());
				
				danhSachCB.add(canBo1);
				break;
			}else {
				System.out.println("Nhập sai! Mời nhập lại!");
			}
			continue;
		}

	}
	
	public void searchCB() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên muốn tìm kiếm: ");
		String fullName = scanner.nextLine();
		
		for (CanBo canBo: danhSachCB) {
			if(fullName.equals(canBo.getFullName()))
			System.out.println("Done!");
			canBo.getInfor();
		}
	}
	
	public void infoCB() {
		for (CanBo canBo: danhSachCB) {
			System.out.println("");
			System.out.println("Done!");
			canBo.getInfor();
		}
	}
	
	public void deleteCB() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên muốn xóa: ");
		String fullName = scanner.nextLine();
		
		for(int i = 0; i < danhSachCB.size();) {
			if(danhSachCB.get(i).getFullName().equals(fullName)){
				danhSachCB.remove(i);				
			}else {
				i++;
			}
		}
		
//		danhSachCB.removeIf()
		
//		for(CanBo canBo : danhSachCB) {
//			if(canBo.getFullName().equals(fullName)) {
//				danhSachCB.remove(canBo);
//			}
		}
	
	public void outProgram() {
		System.out.println("Chương trình đã kết thúc!");
	}
}
