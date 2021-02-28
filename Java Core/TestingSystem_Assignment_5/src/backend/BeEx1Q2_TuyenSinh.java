package backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Ex1Q2_ThiSinh;

public class BeEx1Q2_TuyenSinh implements BeEx1Q2_ITuyenSinh {
	List<Ex1Q2_ThiSinh> listTS = new ArrayList<Ex1Q2_ThiSinh>();
	@Override
	public void addNewTS() {
		Ex1Q2_ThiSinh thiSinh = new Ex1Q2_ThiSinh();
		thiSinh.inputTS();
		listTS.add(thiSinh);
	}

	@Override
	public void inforTS() {
		for(Ex1Q2_ThiSinh cacTS : listTS) {
			cacTS.showTS();
			System.out.println("");
		}
	}

	@Override
	public void searchTS() {
		Scanner scanner = new Scanner(System.in);
		int soBD = scanner.nextInt();
		for(Ex1Q2_ThiSinh cacTS : listTS) {
			if(cacTS.getSoBaoDanh() == soBD) {
				cacTS.showTS();
			}
		}
	}

	@Override
	public void outProgram() {
		System.out.println("Chương trình đã kết thúc!");
	}
	
}
