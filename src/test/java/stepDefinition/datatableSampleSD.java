package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatableSampleSD {

	
	@Given("LMStrail User is on Registration page")
	public void lm_strail_user_is_on_registration_page() {
		System.out.println("LMStrail User is on Registration page -- is executing");
	}

	@When("LMStrail enters all details and click on register")
	public void lm_strail_enters_all_details_and_click_on_register(DataTable regTable) {

		List<List<String>> userList = regTable.asLists(String.class);
		for(List<String> user:userList)
		{
			System.out.println(user);
		}
		
	}
	
	@When("LMStrail enters all details and click on register with columns")
	public void lm_strail_enters_all_details_and_click_on_register_with_columns(DataTable dataTable) {
	     List<Map<String,String>> userListCol = dataTable.asMaps(String.class,String.class);
	     for (Map<String,String> user : userListCol)
	    	 System.out.println(user);
	}



	@Then("LMStrail registration is successful")
	public void lm_strail_registration_is_successful() {
		System.out.println("LMStrail registration is successful -- is executed");
	}
}
