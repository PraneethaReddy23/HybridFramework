package Testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepos.CreateNewOrgPage;
import ObjectRepos.HomePage;
import ObjectRepos.OrganizationInformationPage;
import ObjectRepos.OrganizationPage;
import genericutil.Base;

public class CreateOrg extends Base {
 @Test
 public void createorganization() throws Throwable {
	 //Homepage click on module
	 HomePage hp = new HomePage(driver);
	 hp.clickOnOrgLnk();
	 //Organization
	 OrganizationPage op = new OrganizationPage(driver);
	 op.clickonOrglookupImg();
	 //Create New organization
	 Thread.sleep(5000);
	 CreateNewOrgPage cnop = new CreateNewOrgPage(driver);
	 cnop.createOrg(eu.readDataFromExcel("Sheet1", 0, 0)+ju.getRandomNum());
	 Thread.sleep(5000);
	 OrganizationInformationPage oip = new OrganizationInformationPage(driver);
	 String header = oip.getTextofOrg();
	 Assert.assertTrue(header.contains("wipro"));
	 System.out.println("Tc is pass");
 }

}
