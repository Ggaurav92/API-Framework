package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {

	
	public AddPlace addPlacePayload(String name,String language,String address) {
		
		//Initializing the POJO class
		AddPlace p = new AddPlace();
		//adding the values by using POJO class
		p.setAccuracy(50);
		p.setName(name);
		p.setPhone_number("(+91) 983 893 3937");
		p.setAddress(address);
		p.setWebsite("http://google.com");
		p.setLanguage(language);
		List<String> myList = new ArrayList<String>();
		myList.add("shoe park");
		myList.add("shop");
		p.setTypes(myList);

		
		//To add values to Location first we have to create the object of Location
		Location l = new Location();
		l.setLat(-38.383494);
		l.setLng(33.427362);
		p.setLocation(l);
		
		return p;
		
	}//End of addPlacePayload
	
	
	public String deletePlacePayLoad(String place_id) {
		
		return "{\r\n\"place_id\":\""+ place_id +"\"\r\n}";
	}//End of deletePlacePayLoad
	
}//End of Class
