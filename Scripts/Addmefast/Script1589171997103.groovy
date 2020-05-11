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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://addmefast.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(60, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_AddMeFastcom - 100 FREE Social Media M_bff687/input__email'), 'hurt82a32poirier@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_AddMeFastcom - 100 FREE Social Media M_bff687/input_Registration_password'), 
    'NWb4hwkuz3GVfPttLabpAw==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_AddMeFastcom - 100 FREE Social Media M_bff687/input_Forgot your password _login_button'), 
    FailureHandling.CONTINUE_ON_FAILURE)

for (def index : (0..200)) {
    WebUI.click(findTestObject('Object Repository/Page_AddMeFastcom - Welcome/a_Facebook Likes'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Object Repository/Page_AddMeFastcom - Facebook Likes/div_Like'), 0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Object Repository/Page_AddMeFastcom - Facebook Likes/div_Like'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('Page_Partyonus - Local Service - Patiala In_784040/div_Like-1'), 4, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.click(findTestObject('Page_Partyonus - Local Service - Patiala In_784040/div_Like-1'), FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(30, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.delay(10, FailureHandling.CONTINUE_ON_FAILURE)
}

