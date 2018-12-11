package activity;

import activity.*;
import screenManager.Functions_panel;

public class Engine implements Functions_panel{

	public int engine_id;
	public String engine_type;
	
	public void eventHandler();
	
	public int getEngine_id() {
		return engine_id;
	}
	public void setEngine_id(int engine_id) {
		this.engine_id = engine_id;
	}
	public String getEngine_type() {
		return engine_type;
	}
	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}
	
}
