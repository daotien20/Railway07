package entity;

public class NgayThangNam {
	public int ngay, thang, nam;

	public class GioPhutGiay {
		public int gio;
		public int phut;
		public int giay;

		public void xuatThongTin() {
			System.out.println("Ngày: " + ngay + "/" + thang + "/" + nam);
			System.out.println("Giờ: " + gio + ":" + phut + ":" + giay);
		}
	}
}
