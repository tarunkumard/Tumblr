import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import java.util.regex.Pattern as Pattern
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.junit.Assert.*
import static org.apache.commons.lang3.StringUtils.join
import com.kms.katalon.core.testdata.InternalData as InternalData
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.openBrowser('')
WebUI.delay(10)
WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ifttt.com/login?wp_=1')
WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your IFTTT account - IFTTT/input_Sign in_userusername'),
	'hernandez01y25founta@gmail.com')
WebUI.delay(10)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your IFTTT account - IFTTT/input_Sign in_userpassword'),
	'YS6c9Dql4+YpAaWAUFDAjw==')
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Page_Sign in to your IFTTT account - IFTTT/input_Forgot your password_commit'))

WebUI.delay(5)


WebUI.click(findTestObject('Page_My services - IFTTT/div_Search_profile-avatar-container'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_My services - IFTTT/a_Create'))

WebUI.delay(5)