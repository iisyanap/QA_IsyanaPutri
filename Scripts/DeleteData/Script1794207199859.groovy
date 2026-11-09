import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(null)

WebUI.navigateToUrl('file:///D:/Test/web1.html')

WebUI.setText(findTestObject('Page_Inventory System/input_Product Name'), 'Meja')

WebUI.setText(findTestObject('Page_Inventory System/input_Price'), '10000')

WebUI.setText(findTestObject('Page_Inventory System/input_Quantity'), '1')

WebUI.click(findTestObject('Page_Inventory System/button_Add Item'))

WebUI.click(findTestObject('Page_Inventory System/button_Delete'))

WebUI.verifyElementNotPresent(findTestObject('Page_Inventory System/td_Meja'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Inventory System/td_10000'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Inventory System/td_1'), 0)

WebUI.verifyElementNotPresent(findTestObject('Page_Inventory System/td_Delete'), 0)

