package model;

public class State {
	
	/**
	 * @param id
	 * @param stateName
	 */
	public State(Integer id, String stateName) {
		super();
		this.id = id;
		this.stateName = stateName;
	}
	private Integer id;
	private String stateName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
