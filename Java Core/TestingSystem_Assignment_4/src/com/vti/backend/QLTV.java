package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.Sach;
import com.vti.entity.TaiLieu;
import com.vti.entity.TapChi;

public class QLTV {
	List<TaiLieu> cacTaiLieu = new ArrayList<TaiLieu>();
	
	public void addNewTL() {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Thêm mới tài liệu: ");
			System.out.println("1: Sách; 2: Tạp chí; 3: Báo");
			int x = scanner.nextInt();
			scanner.nextLine();
			if (x == 1) {
				System.out.println("Thêm Sách vào thư viện");
				Sach taiLieu1 = new Sach();
				taiLieu1.inputSach();
				
				cacTaiLieu.add(taiLieu1);
				break;
				
			}else if (x == 2) {
				System.out.println("Thêm Tạp chí vào thư viện");
				TapChi taiLieu1 = new TapChi();
				taiLieu1.inputTapChi();;
				
				cacTaiLieu.add(taiLieu1);
				break;
				
			}else if (x == 3) {
				System.out.println("Thêm Báo vào thư viện");
				Bao taiLieu1 = new Bao();
				taiLieu1.inputBao();
				
				cacTaiLieu.add(taiLieu1);
				break;
			}else {
				System.out.println("Nhập sai! Mời nhập lại!");
			}
			continue;
		}
	}

	public void deleteTL() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã tài liệu muốn xóa: ");
		int maTL = scanner.nextInt();
		
		for(int i = 0; i < cacTaiLieu.size();) {
			if(cacTaiLieu.get(i).getMaTaiLieu() == maTL){
				cacTaiLieu.remove(i);				
			}else {
				i++;
			}
		}


	}

	public void infoTL() {
		for (TaiLieu taiLieu: cacTaiLieu) {
			System.out.println("");
			System.out.println("Done!");
			taiLieu.getInforTL();;
		}
	}

	public void searchTL() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập MTL muốn tìm kiếm: ");
		int maTL = scanner.nextInt();
		
		for (TaiLieu taiLieu: cacTaiLieu) {
			
			if(maTL == taiLieu.getMaTaiLieu()) {
				System.out.println("Done!");
				taiLieu.getInforTL();
			}else {
				System.out.println("Không có tài liệu cần tìm");
				break;
			}
		}
	}
	
	public void outProgram() {
		System.out.println("Chương trình đã kết thúc!");
	}
}
