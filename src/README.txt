How To Compile and Run the Program:
I wrote the program using eclipse. The Jersey framework is needed to run this program. The lastest version of the jersey program
can be found https://jersey.java.net/download.html. The program can be compiled in Eclipse and run by deploying the war file. 
The war file can be exported by going to File->Export->Web->War File. This war file should be placed in webapps
folder of tomcat. After starting tomcat, http://localhost:8080/CodingChallenge/rest/MitchellClaimService/claim/{claimNumber} should
get the specificed claim. Changing the URL will allow the other methods to be tested. 

Tests:
1. Create tests for the creating a new claim
	- test combinations of input values
	- try to submit a claim which does not have a required value
	- try to submit a claim with too value values
	- try to submit a claim with the information in the wrong order
	- test large integers and large strings
2. Create tests for Getting a claim
	- Test with valid claim number
	- test valid claim number with empty database
	- test invalid claim number
3. Create Tests for getting claims in a date range
	- valid date range
	- invalid date range
4.Test for Update
	- Test update with valid claim number
	- Test update with invalid claim number
	- Test update with valid claim number and invalid values
	- Test update wtih invalid claim number and invalid values
	- Test update with valid claim but values are out of order
5.Tests for reading a specific vehicle
	- Test with invalid claim number with and without a vehicle list
	- test with valid claim number with vehicle(s)
	- test valid claim without vehicles
6.Test Delete
	- Test delete existing claim number
	- delete from empty backing store
	- delete non existant claim

Files Included:
	- README.txt
	- MitchellClaim.java
	- MitchellClaimService.java
	- MitchellClaimDao.java
	- CauseOfLoss.java
	- LossInfo.java
	- StatusCode.java
	- VehicleList.java
	- VehicleType.java

Questions:
1. Difference between Loss description and Damage description
2. Why is Loss information separated out from the rest of the claim?
3. Why is reported date part of the LossInfoType and not part of the main claim?
4. Why are most of the fields optional?

 Resources Used:
 http://www.tutorialspoint.com/restful/index.htm
