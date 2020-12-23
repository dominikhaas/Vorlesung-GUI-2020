import { AppPage } from './app.po';
import {browser, by, element, logging} from 'protractor';
import {LoginPagePo} from "./LoginPagePo";

describe('Login page', () => {

  let sleepTime = 1;
  let loginPage = new LoginPagePo();

  beforeEach(() => {
    loginPage.navigateTo()

  });

  it('login button should be disabled if inputs are empty', () => {
        loginPage.user = "user";
        loginPage.password = "pass";

        expect(loginPage.isLoginEnabled).toBeTruthy();
  });

  it('reset button should reset the values', () => {
    browser.sleep(sleepTime);

    element(by.id("nameInput")).sendKeys("user");

    browser.sleep(sleepTime);

    element(by.id("resetButton")).click();

    browser.sleep(sleepTime);

    expect(element(by.id("nameInput")).getText()).toEqual("");
  });
});
