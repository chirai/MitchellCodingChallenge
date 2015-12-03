package codingChallengeCode;

import java.util.List;

public class VehicleList {
	public List<VehicleType> listOfVehicles;
	
	public VehicleList(List<VehicleType> listOfVehicles){
		this.listOfVehicles = listOfVehicles;
	}
	
	public VehicleList() {
	}

	public List<VehicleType> getListOfVehicles(){
		return listOfVehicles;
	}
	
	public void setListOfVehicles(List<VehicleType> listOfVehicles){
		this.listOfVehicles = listOfVehicles;
	}
}
