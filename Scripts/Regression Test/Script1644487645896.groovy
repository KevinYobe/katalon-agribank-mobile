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

/*Agribank Mobile Application END to End Tests*/
/*Load application*/
Mobile.startApplication('C:\\Users\\KYobe\\Downloads\\vmobile-flutter-retail-agribank-mchabanga-11-01-2022.apk', true)

/*Preload Screen, Splash Screens and Terms and Conditions*/
Mobile.tap(findTestObject('Welcome Screens/Preload/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Welcome Screens/Weclome Screen 2/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Welcome Screens/WelcomeScreen - 1/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Welcome Screens/WelcomeScreen - 3/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Privacy Policy/android.widget.Button'), 0)

Mobile.tap(findTestObject('Privacy Policy/android.widget.Button'), 0)

/*Start Banking - Validate Mobile Number*/
Mobile.tap(findTestObject('Start Banking Screen/android.widget.Button'), 0)

Mobile.tapAndHold(findTestObject('Validate Phone Screen/android.widget.EditText - Mobile number'), 0, 0)

Mobile.setText(findTestObject('Validate Phone Screen/android.widget.EditText - Mobile number'), '263784909008', 0)

Mobile.tap(findTestObject('Validate Phone Screen/android.widget.Button (1)'), 0, FailureHandling.STOP_ON_FAILURE)

/*Start Banking - Validate OTP*/
Mobile.tapAndHold(findTestObject('OTP Page/android.widget.EditText - Otp Code'), 0, 0)

Mobile.setText(findTestObject('OTP Page/android.widget.EditText - Otp Code'), '123456', 0)

Mobile.tap(findTestObject('OTP Page/android.widget.Button (1)'), 0, FailureHandling.STOP_ON_FAILURE)

/*Enter PIN Page - Validate PIN*/
Mobile.tapAndHold(findTestObject('Login Page/android.widget.EditText - PIN NUMBER'), 0, 0)

Mobile.setText(findTestObject('Login Page/android.widget.EditText - PIN NUMBER'), '1234', 0)

Mobile.tap(findTestObject('Login Page/android.widget.Button'), 0)

/*On successful login - Landing Page*/
Mobile.tap(findTestObject('Landing Page/Enable Biometrics/android.widget.Button No'), 0)

/*TEST BALANCE ENQ AND MINI STATEMENT*/
Mobile.tap(findTestObject('Landing Page/android.widget.Button View Account'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/android.widget.Button REFRESH BALANCE'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/Confirm MiniStatement/android.widget.Button CONFIRM'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/android.widget.Button REFRESH BALANCE'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/Confirm MiniStatement/android.widget.Button CONFIRM'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/android.widget.Button FULL STATEMENT'), 0)

Mobile.tap(findTestObject('Landing Page/Accounts/android.widget.Button Back'), 0)

/*TEST AIRTIME PURCHASE*/
Mobile.tap(findTestObject('Landing Page/android.widget.ImageView Airtime'), 0)

Mobile.tap(findTestObject('BillPayements/Airtime/android.view.View TOPUP SELF'), 0)

Mobile.tapAndHold(findTestObject('BillPayements/Airtime/Airtime Self/android.widget.EditText - Amount'), 0, 0)

Mobile.setText(findTestObject('BillPayements/Airtime/Airtime Self/android.widget.EditText - Amount'), '3', 0)

Mobile.tapAndHold(findTestObject('BillPayements/Airtime/Airtime Self/android.widget.Button Buy Airtime'), 0, 0)

Mobile.tap(findTestObject('BillPayements/Airtime Confirmation/android.widget.Button CONFIRM'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BillPayements/Airtime/Airtime Success Page/android.widget.Button Done'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Landing Page/android.widget.ImageView Airtime'), 0)

Mobile.tap(findTestObject('BillPayements/Airtime/android.view.View TOPUP OTHER'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAndHold(findTestObject('BillPayements/Airtime/Airtime Other/android.widget.EditText - Amount'), 0, 0)

Mobile.setText(findTestObject('BillPayements/Airtime/Airtime Other/android.widget.EditText - Amount'), '3', 0)

Mobile.tapAndHold(findTestObject('BillPayements/Airtime/Airtime Other/android.widget.EditText - Mobile Number'), 0, 0)

Mobile.setText(findTestObject('BillPayements/Airtime/Airtime Other/android.widget.EditText - Mobile Number'), '0774116711', 
    0)

Mobile.tap(findTestObject('BillPayements/Airtime/Airtime Other/android.widget.Button Buy Airtime'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('BillPayements/Airtime Confirmation/android.widget.Button CONFIRM'), 0)

Mobile.tap(findTestObject('BillPayements/Airtime/Airtime Success Page/android.widget.Button Done'), 0)

/*1. INTERNAL TRANSFER*/
Mobile.tap(findTestObject('Landing Page/android.widget.ImageView Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Transfers/android.view.View Zipit Transfer'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.Button - Select Dest Bank'), 
    0, 0)

Mobile.tap(findTestObject('Object Repository/Transfers/ZIPIT Transfer/Select Bank/android.view.View FBC Bank'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 6017042200014736, Destination account'), 
    0, 0)

Mobile.setText(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 6017042200014736, Destination account'), 
    '100003223269', 0)

Mobile.tapAndHold(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 0774116711, Destination phone'), 
    0, 0)

Mobile.setText(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 0774116711, Destination phone'), 
    '0774116711', 0)

Mobile.tapAndHold(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - Ref, Reference'), 
    0, 0)

Mobile.setText(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - Ref, Reference'), 'Ref', 
    0)

Mobile.tapAndHold(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 5, Amount'), 0, 0)

Mobile.setText(findTestObject('Object Repository/Transfers/ZIPIT Transfer/android.widget.EditText - 5, Amount'), '5', 0)

Mobile.tap(findTestObject('Object Repository/Transfers/Internal Transfer/android.widget.Button Transfer'), 0)

Mobile.tap(findTestObject('Object Repository/Transfers/Transfer Confirmation/android.widget.Button CONFIRM'), 0)

Mobile.tap(findTestObject('Object Repository/Transfers/Transfer Successful/android.widget.Button Done'), 0)

Mobile.closeApplication()

