package model;

public class Address {
	
	private int id;
	private String village;
	private Integer pinCode;
	private State state;
	
	
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	/**
	 * @param id
	 * @param village
	 * @param pinCode
	 * @param state
	 */
	public Address(int id, String village, Integer pinCode, State state) {
		super();
		this.id = id;
		this.village = village;
		this.pinCode = pinCode;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	

}
