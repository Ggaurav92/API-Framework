package resources;
//enum is a special class in java which has a collection of constants or methods
public enum APIResources {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	getPlaceAPI("/maps/api/place/get/json"),
	deletePlaceAPI("/maps/api/place/delete/json");
	
	private String resource;
	
	APIResources(String resource){
		
		this.resource = resource;
	}
	
	
	
	
	public String getResource() {
		
		return resource;
	}//End of getResource
	
}//End of enum
