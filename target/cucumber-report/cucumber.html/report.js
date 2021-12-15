$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bank.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "User should be able to use all the functionalities of the XYZ bank successfully",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9463844200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Bank manager should add customer successfully",
  "description": "",
  "id": "bank-test;bank-manager-should-add-customer-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Smoke"
    },
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on bank manager login tab",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on add customer tab",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters first name \"Sam\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters last name \"Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters postcode \"HA0 3PT\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks on add customer button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User can see \"Customer added successfully with customer id :6\" message popup",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User clicks on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "BankSteps.userIsOnHomepage()"
});
formatter.result({
  "duration": 212632300,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.userClicksOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 544019200,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.userClicksOnAddCustomerTab()"
});
formatter.result({
  "duration": 377788900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sam",
      "offset": 24
    }
  ],
  "location": "BankSteps.userEntersFirstName(String)"
});
formatter.result({
  "duration": 437586100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Patel",
      "offset": 23
    }
  ],
  "location": "BankSteps.userEntersLastName(String)"
});
formatter.result({
  "duration": 150488500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "HA0 3PT",
      "offset": 22
    }
  ],
  "location": "BankSteps.userEntersPostcode(String)"
});
formatter.result({
  "duration": 154334400,
  "status": "passed"
});
formatter.match({
  "location": "BankSteps.userClicksOnAddCustomerButton()"
});
formatter.result({
  "duration": 136999800,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Customer added successfully with customer id :6}\n  (Session info: chrome\u003d96.0.4664.110): Customer added successfully with customer id :6\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-UDEPHFU\u0027, ip: \u0027172.31.112.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c04035006fe00eccc494a17738cb8532, findElement {using\u003dxpath, value\u003d//button[@type\u003d\u0027submit\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\shilp\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63034}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63034/devtoo..., se:cdpVersion: 96.0.4664.110, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c04035006fe00eccc494a17738cb8532\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:131)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.toString(Unknown Source)\r\n\tat com.bank.pages.AddCutomerPage.clickOnAddCutomerBtn(AddCutomerPage.java:48)\r\n\tat com.bank.cucumber.steps.BankSteps.userClicksOnAddCustomerButton(BankSteps.java:43)\r\n\tat ✽.And User clicks on add customer button(Bank.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully with customer id :6",
      "offset": 14
    }
  ],
  "location": "BankSteps.userCanSeeMessagePopup(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankSteps.userClicksOnOkButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1524941100,
  "status": "passed"
});
formatter.before({
  "duration": 4090340300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "bank manager should open account successfully",
  "description": "",
  "id": "bank-test;bank-manager-should-open-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Sanity"
    },
    {
      "line": 16,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User has already got an account",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "User clicks on open account tab",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User searches for the customer account \"Sam Patel\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User selects currency \"Pound\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User clicks on process button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User can see \"Account created successfully with account Number :1016\" message popup",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "User clicks on ok button",
  "keyword": "And "
});
formatter.match({
  "location": "BankSteps.userHasAlreadyGotAnAccount()"
});
formatter.result({
  "duration": 1996242000,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Customer added successfully with customer id :6}\n  (Session info: chrome\u003d96.0.4664.110): Customer added successfully with customer id :6\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-UDEPHFU\u0027, ip: \u0027172.31.112.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_144\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c9e4b03faa5f55a2795dadffe974f690, findElement {using\u003dxpath, value\u003d//button[@type\u003d\u0027submit\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.110, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\shilp\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:63066}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:63066/devtoo..., se:cdpVersion: 96.0.4664.110, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: c9e4b03faa5f55a2795dadffe974f690\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:131)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.toString(Unknown Source)\r\n\tat com.bank.pages.AddCutomerPage.clickOnAddCutomerBtn(AddCutomerPage.java:48)\r\n\tat com.bank.cucumber.steps.BankSteps.userHasAlreadyGotAnAccount(BankSteps.java:91)\r\n\tat ✽.Given User has already got an account(Bank.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BankSteps.userClicksOnOpenAccountTab()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Sam Patel",
      "offset": 40
    }
  ],
  "location": "BankSteps.userSearchesForTheCustomerAccount(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Pound",
      "offset": 23
    }
  ],
  "location": "BankSteps.userSelectsCurrency(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankSteps.userClicksOnProcessButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Account created successfully with account Number :1016",
      "offset": 14
    }
  ],
  "location": "BankSteps.userCanSeeMessagePopup(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BankSteps.userClicksOnOkButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1616866000,
  "status": "passed"
});
