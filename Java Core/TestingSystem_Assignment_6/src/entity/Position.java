package entity;

import backend.ScannerUtils;

public class Position {
	private int			positionID;
	private String	positionName;
	
	public Position(byte positionID, String positionName) {
		super();
		this.positionID = positionID;
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [positionID=" + positionID + ", positionName=" + positionName + "]";
	}

	public int getPositionID() {
		return positionID;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionID(byte positionID) {
		this.positionID = positionID;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	public Position() {
		positionName = inputPName();
		positionID = inputPID();
	}

	private String inputPName() {
		System.out.println("Mời bạn nhập vào tên vị trí: ");
		String namePosition = ScannerUtils.inputString("Nhập sai! Nhập lại! ");
		return namePosition;
	}
	
	private int inputPID() {
		System.out.println("Mời bạn nhập vào ID của vị trí: ");
		int idPosition = ScannerUtils.inputInt("Nhập sai, Nhập lại");
		return idPosition;
		
	}
	

	
	
}
