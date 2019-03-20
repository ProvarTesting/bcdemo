package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="LineItem"                                
               , summary=""
               , connection="BCAdmin"
               , lightningComponent="LineItem"
               , namespacePrefix=""
     )             
public class LineItem {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.lineItem.Quantity}']", qualifier = "Quantity")
	public WebElement quantity;
	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value='{!v.lineItem.TotalPrice}']", qualifier = "TotalPrice")
	public WebElement totalPrice;


	
}
