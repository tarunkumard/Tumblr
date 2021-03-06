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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.google.com/gmail/about/#')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Gmail - Free Storage and Email from Google/a_Sign in'))

WebUI.delay(5)

WebUI.switchToWindowTitle('Gmail')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Gmail/input_to continue to Gmail_identifier'), 'carolyn19k65juliana@gmail.com')

WebUI.click(findTestObject('Page_Gmail/span_Next'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('Page_Gmail/input_Too many failed attempts_password'), '/i3xyS8P3x2y+WAft1pI+w==')

WebUI.delay(35)

WebUI.navigateToUrl('https://ifttt.com/login?wp_=1')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Sign in to your IFTTT account - IFTTT/a_Continue with Google or Facebook'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_Sign in to your IFTTT account - IFTTT/a_Continue with Google'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_My services - IFTTT/div_Search_profile-avatar-container'))

WebUI.delay(5)

WebUI.click(findTestObject('Page_My services - IFTTT/a_Create'))

WebUI.delay(5)



