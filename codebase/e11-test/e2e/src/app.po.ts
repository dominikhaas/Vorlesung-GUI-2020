import { browser, by, element } from 'protractor';

export class AppPage {
  navigateTo() {
    return browser.get(browser.baseUrl) as Promise<any>;
  }

  getTitleText() {
    return element(by.css('app-root h1')).getText() as Promise<string>;
  }

  getName() {
    return element(by.id('name-input')).getText();
  }

  setName(value:string) {
    element(by.id('name-input')).sendKeys(value)
  }

  clickReset() {
    element(by.id('reset-button')).click();
  }
}
