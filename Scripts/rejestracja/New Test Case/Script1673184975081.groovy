import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

//WebUI.click(findTestObject('Object Repository/PAGE_MAIN/lnk_login'))
//WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_firstnname'), firstnname)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_lastnname'), lastnname)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_addres'), addres)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_city'), city)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_state'), state)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_zipcode'), zipcode)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_phone'), phone)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_ssn'), ssn)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_username'), username)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_password'), password)

WebUI.setText(findTestObject('Object Repository/LOGIN_PAGE/inp_password2'), password2)

WebUI.delay(GlobalVariable.time_delay)

WebUI.click(findTestObject('Object Repository/LOGIN_PAGE/btn_login'))

WebUI.delay(GlobalVariable.time_delay)

String el_error_msg = WebUI.getText(findTestObject('Object Repository/LOGIN_PAGE/str_error_msg'))

assert error_msg == el_error_msg

WebUI.closeBrowser()

