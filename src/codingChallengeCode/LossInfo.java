package codingChallengeCode;

import java.util.Calendar;

public class LossInfo {
	private CauseOfLoss causeOfLoss;
	private Calendar reportedDate;
	private String lossDescription;
	
	public LossInfo(){
	}
	
	public LossInfo(CauseOfLoss c){
		this.causeOfLoss = c;
	}
	
	public LossInfo(Calendar r){
		this.reportedDate = r;
	}
	
	public LossInfo(String ld){
		this.lossDescription = ld;
	}
	
	public LossInfo(CauseOfLoss c, Calendar r){
		this(c);
		this.reportedDate =r;
	}
	
	public LossInfo(CauseOfLoss c, String ld){
		this(c);
		this.lossDescription = ld;
	}
	
	public LossInfo(Calendar r, String ld){
		this(r);
		this.lossDescription = ld;
	}
	
	public LossInfo(CauseOfLoss c, Calendar r, String ld){
		this(c,r);
		this.lossDescription = ld;
	}
	
	public CauseOfLoss getCauseOfLoss(){
		return causeOfLoss;
	}
	
	public Calendar getReportedDate(){
		return reportedDate;
	}
	
	public String getLossDescription(){
		return lossDescription;
	}
	
	public void setCauseOfLoss(CauseOfLoss causeOfLoss){
		this.causeOfLoss = causeOfLoss;
	}
	
	public void setReportedDate(Calendar date){
		this.reportedDate = date;
	}
	
	public void setLossDescription(String ld){
		this.lossDescription = ld;
	}
}
