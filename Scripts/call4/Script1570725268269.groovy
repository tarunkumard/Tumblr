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

WebUI.setText(findTestObject('Page_Create your own - IFTTT/textarea_httppinterestcomjanewfeedrss'), testcaseRSS, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color btn-md btn-create'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/input_Step3of 6_search'), 'pin', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

'Add code here for click'
WebUI.click(findTestObject('pinterest/Page_Create your own - IFTTT/img_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_Create your own - IFTTT/span_This Action'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('pinterest/Page_Create your own - IFTTT/span_This Action will add a new Pin to one of your boards'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Here Is Best'), 'DIY Zipper sweatshirts', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Add a description_fieldsnote'), 
    Keys.chord(Keys.CONTROL, 'a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Add a description_fieldsnote'), 
    Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Add a description_fieldsnote'), 
    'DIY Zipper sweatshirts #diy #crafts #teencrafts #projects #diycrafts #diyprojects #fundiys #funprojects #diyideas #craftprojects #diyprojectidea #teencraftidea #wedding #bridal #AcrylicSummerNails #Beauty #NailArt #SummerNailsArt #uñas #uñasdecoradas #uñaslindas #uñasdegel #uñashermosas #manicura #manos #fuego #uñasfuego #cazzu #women cardigan winter cardigan #women cardigan winter cardigan cardigan #cardigans for women', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Source URL_fieldslink'), 
    Keys.chord(Keys.CONTROL, 'a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Source URL_fieldslink'), 
    Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/pinterest/Page_Create your own - IFTTT/textarea_Source URL_fieldslink'), 
    'https://amzn.to/2QreKJy', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('pinterest/Page_Create your own - IFTTT/input_Add ingredie'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('pinterest/Page_Create your own - IFTTT/input_works with_btn btn-primary btn-lg'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PinterestEnd/Page_Create your own - IFTTT/input_works with_btn btn-primary btn-lg'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PinterestEnd/Page_If New feed/div_Search_profile-avatar-container'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PinterestEnd/Page_If New feed/a_Create'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(7)

WebUI.callTestCase(findTestCase('call2'), [:], FailureHandling.CONTINUE_ON_FAILURE)

