package Testclasses;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepos.CreateNewOrgPage;
import ObjectRepos.HomePage;
import ObjectRepos.OrganizationInformationPage;
import ObjectRepos.OrganizationPage;
import genericutil.Base;

public class TestingAllTCS extends Base{
	@Test
	 public void TC1() throws Throwable {
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



@Test
public void TC2() {
	System.out.println("Running TC2");
}

@Test
public void TC3() {
	System.out.println("Running TC3");
}

	
}

