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

WebUI.callTestCase(findTestCase('call1'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('call2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_httppinterestcomjanewfeedrss'), 'https://macholatcho.tumblr.com/rss', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color btn-md btn-create'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'visit the help page\'])[1]/following::input[1]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'?\'])[1]/following::span[2]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('id=search')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.type('id=search', 'pinte')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Choose action service\'])[1]/following::img[1]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add Pin to board\'])[1]/following::span[1]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[board_name]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.type('name=fields[board_name]', 'WomenKnowsLanguageOfLove')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[photo_url]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.type('name=fields[photo_url]', '<a href="https://amzn.to/33hVwK0">Here Is Best Flawless Women\'s Painless Hair Remover</a>')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[note]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[photo_url]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[note]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.type('name=fields[note]', 'Here Is Best Flawless Women\'s Painless Hair Remover')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[link]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[photo_url]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[photo_url]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('name=fields[link]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.type('name=fields[link]', 'https://amzn.to/33hVwK0')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Add ingredient\'])[4]/following::input[1]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'works with\'])[1]/following::input[1]')

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

