package codingChallengeCode;
import java.io.Serializable;
import java.util.Calendar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "claim")
public class MitchellClaim implements Serializable{
   private static final long serialVersionUID = 1L;
   private String claimNumber;
   private String claimantFirstName;
   private String claimantLastName;
   private StatusCode status;
   private Calendar lossDate;
   private LossInfo lossInfo;
   private long assignedAdjusterID;
   private VehicleList vehicles;

   public MitchellClaim(){}
   
   public MitchellClaim(String claimNumber){
	   this.claimNumber = claimNumber;
   }
   
   public MitchellClaim(String claimNumber, StatusCode status){
	   this.claimNumber = claimNumber;
	   this.status = status;
   }
   
   public MitchellClaim(String claimNumber, Calendar lossDate){
	   this.claimNumber = claimNumber;
	   this.lossDate = lossDate;
   }
   
   public MitchellClaim(String claimNumber, String claimantFirstName, String claimantLastName){
	   this.claimNumber = claimNumber;
	   this.claimantFirstName = claimantFirstName;
	   this.claimantLastName = claimantLastName;
   }
   
   //TODO: Finish constructor combinations
   
   public String getClaimNumber() {
      return claimNumber;
   }

   @XmlElement
   public void setClaimNumber(String claim) {
      this.claimNumber = claimNumber;
   }
   
   public String getClaimantFirstName() {
	      return claimantFirstName;
	   }
   @XmlElement
   public void setClaimantFirstName(String claimantFirstName) {
      this.claimantFirstName = claimantFirstName;
   }
   
   public String getClaimantLastName() {
	      return claimantLastName;
	   }
	@XmlElement
	public void setClaimantLastName(String claimantLastName) {
	   this.claimantLastName = claimantLastName;
	}
	
	public StatusCode getStatus() {
	      return status;
	   }
	 @XmlElement
	public void setStatus(StatusCode status) {
      this.status = status;
    }
	 
	public Calendar getLossDate() {
	      return lossDate;
	}
	@XmlElement
	public void setLossDate(Calendar lossDate) {
	    this.lossDate = lossDate;
	}
	
	public LossInfo getLossInfo() {
	      return lossInfo;
	}
	@XmlElement
	public void setLossInfo(LossInfo lossInfo) {
	    this.lossInfo = lossInfo;
	}
	
	public long getAssignedAdjusterID() {
	      return assignedAdjusterID;
	}
	@XmlElement
	public void setAssignedAdjusterID(long assignedAdjusterID) {
	    this.assignedAdjusterID = assignedAdjusterID;
	}
	
	public VehicleList getVehicles() {
	      return vehicles;
	}
	@XmlElement
	public void setVehicles(VehicleList vehicles) {
	    this.vehicles = vehicles;
	}
}
