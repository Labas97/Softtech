package activity;


public class vacuum extends Engine{

	protected int vacuum_id;
	protected int vacuum_timing;
	protected String vacuum_description;
	
	public int getVacuum_id() {
		return vacuum_id;
	}
	public void setVacuum_id(int vacuum_id) {
		this.vacuum_id = vacuum_id;
	}
	public int getVacuum_timing() {
		return vacuum_timing;
	}
	public void setVacuum_timing(int vacuum_timing) {
		this.vacuum_timing = vacuum_timing;
	}
	public String getVacuum_description() {
		return vacuum_description;
	}
	public void setVacuum_description(String vacuum_description) {
		this.vacuum_description = vacuum_description;
	}
	
}
