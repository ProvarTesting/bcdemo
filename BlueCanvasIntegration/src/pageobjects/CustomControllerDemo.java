package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="CustomControllerDemo"                                
               , summary=""
               , connection="BCAdmin"
               , lightningComponent="CustomControllerDemo"
               , namespacePrefix=""
     )             
public class CustomControllerDemo {

	@PageRow()
	public static class LineItems {
	}

	@AuraBy(componentXPath = "//aura:iteration[@iterationListName = 'v.lineItems']")
	@PageTable(firstRowContainsHeaders = false, row = LineItems.class)
	public List<LineItems> lineItems;
	@TextType()
	@AuraBy(componentXPath = "//lightning:formattedNumber[@value= '{!v.OpportunityTotal}']")
	public WebElement opportunityTotal;
	@TextType()
	@FindBy(xpath = "//th[starts-with(normalize-space(.),'Description')]")
	public WebElement DescriptionLabel;
	
}
