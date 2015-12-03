package codingChallengeCode;

public class VehicleType {
	private int modelYear;
	private String makeDescription;
	private String modelDescription;
	private String engineDescription;
	private String exteriorColor;
	private String VIN;
	private String licensePlate;
	private String licensePlateState;
	private String licensePlateExerationDate;
	private String damageDescription;
	private int mileage;
	
	public VehicleType(int modelYear){
		this.modelYear= modelYear;
	}
	
	public VehicleType(int modelYear, String makeDescription, String modelDescription, String engineDescription,
			String exteriorColor, String vIN, String licensePlate, String licensePlateState,
			String licensePlateExerationDate, String damageDescription, int mileage) {
		this.modelYear = modelYear;
		this.makeDescription = makeDescription;
		this.modelDescription = modelDescription;
		this.engineDescription = engineDescription;
		this.exteriorColor = exteriorColor;
		VIN = vIN;
		this.licensePlate = licensePlate;
		this.licensePlateState = licensePlateState;
		this.licensePlateExerationDate = licensePlateExerationDate;
		this.damageDescription = damageDescription;
		this.mileage = mileage;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public String getMakeDescription() {
		return makeDescription;
	}
	public void setMakeDescription(String makeDescription) {
		this.makeDescription = makeDescription;
	}
	public String getModelDescription() {
		return modelDescription;
	}
	public void setModelDescription(String modelDescription) {
		this.modelDescription = modelDescription;
	}
	public String getEngineDescription() {
		return engineDescription;
	}
	public void setEngineDescription(String engineDescription) {
		this.engineDescription = engineDescription;
	}
	public String getExteriorColor() {
		return exteriorColor;
	}
	public void setExteriorColor(String exteriorColor) {
		this.exteriorColor = exteriorColor;
	}
	public String getVIN() {
		return VIN;
	}
	public void setVIN(String vIN) {
		VIN = vIN;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getLicensePlateState() {
		return licensePlateState;
	}
	public void setLicensePlateState(String licensePlateState) {
		this.licensePlateState = licensePlateState;
	}
	public String getLicensePlateExerationDate() {
		return licensePlateExerationDate;
	}
	public void setLicensePlateExerationDate(String licensePlateExerationDate) {
		this.licensePlateExerationDate = licensePlateExerationDate;
	}
	public String getDamageDescription() {
		return damageDescription;
	}
	public void setDamageDescription(String damageDescription) {
		this.damageDescription = damageDescription;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
