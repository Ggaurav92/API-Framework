package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.BeforeStep;

public class Hooks {

	@BeforeStep ("@DeletePlace")
	public void Before() throws IOException {
		
		StepDefinition m = new StepDefinition();
		
		
		if(StepDefinition.place_id==null) {
		m.add_place_payload_with("Garje", "Spanish", "Asia");
		m.user_calls_with_http_request("AddPlaceAPI", "POST");
		m.verify_place_id_created_maps_to_using("Garje", "getPlaceAPI");
		}//End of if
		
	
		
		
	}
	
}//End of Class


