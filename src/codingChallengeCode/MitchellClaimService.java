package codingChallengeCode;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/MitchellClaimService")
public class MitchellClaimService {
	MitchellClaimDao claimDao = new MitchellClaimDao();
	private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String FAILURE_RESULT="<result>failure</result>";
	
	   //return a specific claim
	   @GET
	   @Path("/claim/{claimNumber}")
	   @Produces(MediaType.APPLICATION_XML)
	   public MitchellClaim getClaim(@PathParam("ClaimNumber") String claimNumber){
	      return MitchellClaimDao.getClaim(claimNumber);
	   }
	   
	   //GET --> Return All the claims based on a date range
	   @GET
	   @Path("/claim/{stateDate}-{endDate}")
	   @Produces(MediaType.APPLICATION_XML)
	   public List<MitchellClaim> getClaims(Calendar start, Calendar end){
	      return MitchellClaimDao.getClaims(start, end);
	   }
	   
	   //PUT to create a new claim
	   /*Need several versions to deal with different claim info*/
	   @PUT
	   @Path("/claim")
	   @Produces(MediaType.APPLICATION_XML)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String createClaim(@FormParam("ClaimNumber") String ClaimNumber,
	      @Context HttpServletResponse servletResponse) throws IOException{
	      MitchellClaim claim = new MitchellClaim(ClaimNumber);
	      int result = MitchellClaimDao.addClaim(claim);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }
	   
	   //Optional - update claim
	   @POST
	   @Path("/claim")
	   @Produces(MediaType.APPLICATION_XML)
	   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	   public String updateClaim(@FormParam("ClaimNumber") String ClaimNumber,
	      @Context HttpServletResponse servletResponse) throws IOException{
		  MitchellClaim claim = new MitchellClaim(ClaimNumber);
		      int result = MitchellClaimDao.updateClaim(claim);
		      if(result == 1){
		         return SUCCESS_RESULT;
		      }
		      return FAILURE_RESULT;
	   }
	   
	   //Optional -delete claim
	   @DELETE
	   @Path("/claim/{claimNumber}")
	   @Produces(MediaType.APPLICATION_XML)
	   public String deleteClaim(@PathParam("ClaimNumber") String ClaimNumber){
	      int result = MitchellClaimDao.deleteClaim(ClaimNumber);
	      if(result == 1){
	         return SUCCESS_RESULT;
	      }
	      return FAILURE_RESULT;
	   }
	   
	   //Optional- get vehicle info from claim
	   @GET
	   @Path("/claim/{claimNumber}")
	   @Produces(MediaType.APPLICATION_XML)
	   public VehicleList getVehicleInfo(@PathParam("ClaimNumber") String ClaimNumber){
	      return MitchellClaimDao.getVehicleInfo(ClaimNumber);
	   }
}
