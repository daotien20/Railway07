package frontend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Ex1Q1_News;

public class TestEx1Q1_MyNews {
	List<Ex1Q1_News> cacNews = new ArrayList<Ex1Q1_News>();
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Ex1Q1_News> cacNews = new ArrayList<Ex1Q1_News>();
		Ex1Q1_News myNews = new Ex1Q1_News();
		
		while(true) {
			System.out.println("======= MENU =======");
			System.out.println("1: Insert news");
			System.out.println("2: View list news");
			System.out.println("3: Average rate");
			System.out.println("4: Exit");
			
			System.out.println("");
			System.out.println("Chọn chương trình muốn thực hiện");
			int x = scanner.nextInt();
			scanner.nextLine();
			
			if (x == 1) {
				while(true) {
					System.out.println("Insert news");
					myNews.insertNews();
					cacNews.add(myNews);
					
					System.out.println("Bạn có muốn thêm tin không?");
					System.out.println("1: Có; 2: Không");
					int y = scanner.nextInt();
					if (y == 1) {
						continue;
					} else {
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
					break;
				}
				
			}else if (x == 2){
				System.out.println("View list news");
				for(Ex1Q1_News news : cacNews) {
					news.display();
					System.out.println("");
				}
		
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					break;
				}
			}else if (x == 3) {
				System.out.println("Average rate");
				for(Ex1Q1_News news : cacNews) {
					news.calculate();
					news.display();
					System.out.println("");
				}
				System.out.println("Bạn có muốn thực hiện chức năng khác không?");
				System.out.println("1: Có; 2: Không");
				int y = scanner.nextInt();
				if (y == 1) {
					continue;
				} else {
					break;
				}
			}else if (x == 4) {
				System.out.println("Kết thúc chương trình!");
				break;
			}else {
				System.out.println("Nhập sai! Mời nhập lại!");
			}
			continue;
		}
	}

}
