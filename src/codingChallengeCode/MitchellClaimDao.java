package codingChallengeCode;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import exampleCode.User;

public class MitchellClaimDao {

	public static MitchellClaim getClaim(String claimNumber) {
		List<MitchellClaim> claims = getAllClaims();

	      for(MitchellClaim claim: claims){
	         if(claim.getClaimNumber() == claimNumber){
	            return claim;
	         }
	      }
	      return null;
	}

	public static List<MitchellClaim> getAllClaims() {
	      List<MitchellClaim> claimList = null;
	      try {
	         File file = new File("Claims.dat");
	         if (!file.exists()) {
	            return claimList;	
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            claimList = (List<MitchellClaim>) ois.readObject();
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }		
	      return claimList;
	}

	public static int addClaim(MitchellClaim claim) {
		List<MitchellClaim> claimList = getAllClaims();
	      boolean claimExists = false;
	      for(MitchellClaim claims: claimList){
	         if(claims.getClaimNumber() == claim.getClaimNumber()){
	            claimExists = true;
	            break;
	         }
	      }		
	      if(!claimExists){
	         claimList.add(claim);
	         saveClaimList(claimList);
	         return 1;
	      }
	      return 0;
	}

	private static void saveClaimList(List<MitchellClaim> claimList) {
		 try {
	         File file = new File("Claim.dat");
	         FileOutputStream fos;

	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);		
	         oos.writeObject(claimList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }

	public static int updateClaim(MitchellClaim claim) {
		List<MitchellClaim> claimList = getAllClaims();

	      for(MitchellClaim claims: claimList){
	         if(claims.getClaimNumber() == claim.getClaimNumber()){
	            int index = claimList.indexOf(claim);			
	            claimList.set(index, claim);
	            saveClaimList(claimList);
	            return 1;
	         }
	      }		
	      return 0;
	}

	public static int deleteClaim(String claimNumber) {
		List<MitchellClaim> claimList = getAllClaims();

	      for(MitchellClaim claim: claimList){
	         if(claim.getClaimNumber() == claimNumber){
	            int index = claimList.indexOf(claim);			
	            claimList.remove(index);
	            saveClaimList(claimList);
	            return 1;   
	         }
	      }		
	      return 0;
	}

	public static VehicleList getVehicleInfo(String claimNumber) {
		List<MitchellClaim> claimList = getAllClaims();

	      for(MitchellClaim claims: claimList){
	         if(claims.getClaimNumber() == claimNumber){
	            return claims.getVehicles();
	         }
	      }		
	      return new VehicleList();
	}

	public static List<MitchellClaim> getClaims(Calendar start, Calendar end) {
		List<MitchellClaim> claimList = null;
	      try {
	         File file = new File("Claims.dat");
	         if (!file.exists()) {
	            return claimList;	
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            claimList = (List<MitchellClaim>) ois.readObject();
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }
	      
	      for(int i=0; i<claimList.size(); i++){
	    	  if(claimList.get(i).getLossDate().before(start) || 
	    			  claimList.get(i).getLossDate().after(end)){
	    		  claimList.remove(i);
	    	  }
	      }
	      return claimList;
	}


}
