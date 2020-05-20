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

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_httppinterestcomjanewfeedrss'), testcaseRSS)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color btn-md btn-create'))

WebUI.click(findTestObject('Page_Create your own - IFTTT/span_'))

WebUI.delay(5)

'Above for Pinterest as well'

WebUI.setText(findTestObject('Page_Create your own - IFTTT/input_Step1of 6_search'), 'twi', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/img_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Create your own - IFTTT/span_This Action will post a new tweet to y_84febc'),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Create your own - IFTTT/textarea_Tweet text_fieldstweet'), '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Photo caption_fieldscaption'), Keys.chord(Keys.CONTROL,
	'a'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Photo caption_fieldscaption'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Create your own - IFTTT/textarea_httpkalikeshtocom competition infl_178516'),
	'http://kalikeshto.com/ #competition #influencer #influencermarketing #fridayfeeling #MondayMotivation #tbt #wcw\n#WinItWednesday  #Win #Giveaway #FreebieFriday #LoungingPretty',
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Create your own - IFTTT/input_Add ingredient_btn btn-on-color btn-m_c474a4'),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Create your own - IFTTT/input_Add ingredient_btn btn-on-color btn-m_c474a4'),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_If New feed item from httpswwwpinteres_788210/div_Explore_profile-avatar-container'),
	FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_If New feed item from httpswwwpinteres_788210/a_Create'), FailureHandling.CONTINUE_ON_FAILURE)


WebUI.callTestCase(findTestCase('call2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

