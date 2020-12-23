import { AppPage } from './app.po';
import {browser, by, element, logging} from 'protractor';

describe('Login page', () => {

  let sleepTime = 1;

  beforeEach(() => {
    browser.get(browser.baseUrl);

  });

  it('login button should be disabled if inputs are empty', () => {
        browser.sleep(sleepTime);

        element(by.id("nameInput")).sendKeys("user");

        browser.sleep(sleepTime);

        element(by.id("passwordInput")).sendKeys("user");

        browser.sleep(sleepTime);

        expect(element(by.id("loginButton")).isEnabled()).toBeTruthy();
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
