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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://ifttt.com/login', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Sign in to your IFTTT account - IFTTT/a_sign in'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Sign in to your IFTTT account - IFTTT/input_Sign in_userusername'), 
    'courtney76k71crause@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Sign in to your IFTTT account - IFTTT/input_Sign in_userpassword'), 
    'gOfOCVHPiWwqG8G8nhplyw==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Sign in to your IFTTT account - IFTTT/input_Forgot your password_commit'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_My Applets - IFTTT/div_Explore_profile-avatar-container'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_My Applets - IFTTT/a_Create'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/a_This'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/input_Step1of 6_search'), 
    'RSS', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/img'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/li_New feed itemThis Trigger fires every ti_36f227'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/textarea_httpswwwpinterestcomschoenbrdiy-craftsrss'), 
    'https://creativenailsteam.tumblr.com/rss', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color _6a1bb4'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/span_'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/input_Step1of 6_search'), 
    'PIN', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/img_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/li_Add Pin to boardThis Action will add a n_7ff150'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/textarea_CUTIE PIE DOGS'), 
    'CUTIE PIE DOGS', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/div_Add Pin to boardThis Action will add a _24c625'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/div_Add Pin to boardThis Action will add a _9d45d1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/form_Add Pin to boardThis Action will add a_db07cf'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/textarea_Source URL_fieldslink'), 
    '', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PINTERESTFAILURES/Page_Create your own - IFTTT/textarea_httpswwwpinterestcompin732257220655148970'), 
    'https://www.youtube.com/watch?v=VY2yxLyDDgU&feature=youtu.be', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pin/Page_Create your own - IFTTT/optional'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pin/Page_Create your own - IFTTT/input_visit the help page_btn btn-on-color _6a1bb4'))

