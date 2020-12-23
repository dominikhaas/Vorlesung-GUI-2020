import {browser, by, element, ElementFinder} from "protractor";

export class LoginPagePo {

  private userInput:ElementFinder = element(by.id("nameInput"));
  private passwordInput:ElementFinder = element(by.id("passwordInput"));
  private loginButton: ElementFinder = element(by.id("loginButton"));

  public navigateTo(): void {
    browser.get(browser.baseUrl);
  }

  public set user(value: string) {
    this.userInput.sendKeys(value);
  }

  public set password(value: string) {
    this.passwordInput.sendKeys(value);
  }

  public get isLoginEnabled() {
    return this.loginButton.isEnabled();
  }
}
