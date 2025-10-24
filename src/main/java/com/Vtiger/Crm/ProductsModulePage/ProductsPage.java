package com.Vtiger.Crm.ProductsModulePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	WebDriver driver;

	public ProductsPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[@class='tabUnSelected' and contains(., 'Product')]")
	private WebElement productmodule;

	@FindBy(xpath = "//img[@alt='Create Product...']")
	private WebElement createProduct_Add_PlusSign;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::input[@name='productname']")
	private WebElement productnameTextField;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::input[@name='discontinued']")
	private WebElement productactive;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::select[@name='productcategory']")
	private WebElement productCategoryDropDown;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::img[@title='Select']")
	private WebElement vendorNamePlusSign;

	// Vender's Name selected, always select 1 row
	@FindBy(xpath = "//table[@class='small']//descendant::tr[@class='lvtColData']")
	private WebElement venderName;

	@FindBy(xpath = "//input[@id='search_txt']")
	private WebElement vendernamesearch;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::select[@name='usageunit']")
	private WebElement usageUnit_Dropdown;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::input[@id='qtyinstock']")
	private WebElement quantityInStock;

	@FindBy(xpath = "//td[@class='dvtCellInfo']//descendant::input[@value='U']")
	private WebElement handler_UserCheckBox;

	@FindBy(xpath = "//span[@id='assign_user']//descendant::select[@name='assigned_user_id']")
	private WebElement handler_UserCheckBox_Dropdown;

	@FindBy(xpath = "//textarea[@class='detailedViewTextBox']")
	private WebElement descriptionTextField;

	@FindBy(xpath = "//table[@class='small']//descendant::input[@title='Save [Alt+S]']")
	private WebElement save;

	// Getter

	public WebElement getProductmodule() {
		return productmodule;
	}

	public WebElement getCreateProductAddPlussign() {
		return createProduct_Add_PlusSign;
	}

	public WebElement getProductnameTextField() {
		return productnameTextField;
	}

	public WebElement getProductactive() {
		return productactive;
	}

	public WebElement getProductCategoryDropDown() {
		return productCategoryDropDown;
	}

	public WebElement getVendorNamePlusSign() {
		return vendorNamePlusSign;
	}

	public WebElement getVenderName() {
		return venderName;
	}

	public WebElement getVendernamesearch() {
		return vendernamesearch;
	}

	public WebElement getUsageUnit_Dropdown() {
		return usageUnit_Dropdown;
	}

	public WebElement getQuantityInStock() {
		return quantityInStock;
	}

	public WebElement getHandler_UserCheckBox() {
		return handler_UserCheckBox;
	}

	public WebElement getHandler_UserCheckBox_Dropdown() {
		return handler_UserCheckBox_Dropdown;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public WebElement getSave() {
		return save;
	}

	// Setter

	public void setProductmodule(WebElement productmodule) {
		this.productmodule = productmodule;
	}

	public void setAdd_plussign(WebElement createProduct_Add_PlusSign) {
		this.createProduct_Add_PlusSign = createProduct_Add_PlusSign;
	}

	public void setProductname(WebElement productnameTextField) {
		this.productnameTextField = productnameTextField;
	}

	public void setProductactive(WebElement productactive) {
		this.productactive = productactive;
	}

	public void setProductCategoryDropDown(WebElement productCategoryDropDown) {
		this.productCategoryDropDown = productCategoryDropDown;
	}

	public void setVendorNamePlusSign(WebElement vendorNamePlusSign) {
		this.vendorNamePlusSign = vendorNamePlusSign;
	}

	public void setVenderName(WebElement venderName) {
		this.venderName = venderName;
	}

	public void setVendernamesearch(WebElement vendernamesearch) {
		this.vendernamesearch = vendernamesearch;
	}

	public void setUsageUnit_Dropdown(WebElement usageUnit_Dropdown) {
		this.usageUnit_Dropdown = usageUnit_Dropdown;
	}

	public void setQuantityInStock(WebElement quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public void setHandler_UserCheckBox(WebElement handler_UserCheckBox) {
		this.handler_UserCheckBox = handler_UserCheckBox;
	}

	public void setHandler_UserCheckBox_Dropdown(WebElement handler_UserCheckBox_Dropdown) {
		this.handler_UserCheckBox_Dropdown = handler_UserCheckBox_Dropdown;
	}

	public void setDescriptionTextField(WebElement descriptionTextField) {
		this.descriptionTextField = descriptionTextField;
	}

	public void setSave(WebElement save) {
		this.save = save;
	}

}
