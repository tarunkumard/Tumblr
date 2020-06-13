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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_httppinterestcomjanewfeedrss'), testcaseRSS)

WebUI.delay(5)

WebUI.click(findTestObject('Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color btn-md btn-create'))

WebUI.click(findTestObject('that/Page_Create your own - IFTTT/PlusThat'))

WebUI.delay(5)

'Above for Pinterest as well'
WebUI.setText(findTestObject('Page_Create your own - IFTTT/input_Step3of 6_search'), 'tum')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Create your own - IFTTT/img_1'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Create your own - IFTTT/span_This Action'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_Photo caption_fieldscaption'), '')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Photo caption_fieldscaption'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Photo caption_fieldscaption'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Create your own - IFTTT/textarea_a hrefhttps'), '<a href="https://www.youtube.com/watch?v=VY2yxLyDDgU">Cute Puppies Doing Funny Things 2020 </a> ')

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_Tags_fieldstags'), '')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Tags_fieldstags'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Page_Create your own - IFTTT/textarea_Tags_fieldstags'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Object Repository/Page_Create your own - IFTTT/textarea_foodcakedessertp'), 'food,cake,dessert,pastries,intersectional feminism,feminist,my hero academia,all might,lingerie,babe,sexy,babes,kakagai,halloween,horror,gold,gold flakes,nutrition,chocolate,cute,fitness,athletic,summer,fruit by the foot,fruit snacks,hot,bikini,fashion')

WebUI.delay(5)

WebUI.click(findTestObject('Pin/Page_Create your own - IFTTT/comments'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Pin/Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color _6a1bb4'))

WebUI.delay(5)

WebUI.click(findTestObject('Pin/Page_Create your own - IFTTT/input_works with_btn btn-primary btn-lg'))

WebUI.delay(5)

WebUI.navigateToUrl('https://ifttt.com/create')

WebUI.delay(15)

WebUI.callTestCase(findTestCase('call2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

