import {browser, by, element, protractor} from "protractor";
import {GooglePo} from "./google.po";

describe('Google Search Page Test PO', () => {

  function sleep() {
    return browser.sleep(1);
  }


  let googlePage:GooglePo;

  beforeEach(() => {
    browser.waitForAngularEnabled(false);
    googlePage = new GooglePo();
  });

  it('should find wikipedia as second entry on a search for "hello world"', async () => {
    googlePage.navigateTo();


    sleep();
    googlePage.setSearchText("hello world");


    sleep();
    googlePage.removeSearchSuggestions();


    let text = googlePage.getSearchButton().getLabel();
    expect(text).toEqual('Google-Suche');

    sleep();
    googlePage.getSearchButton().click();

    let searchResultElements = await googlePage.getSearchResults();
    expect(searchResultElements[1].getHeadlineText()).toEqual('"Hello, World!" program - Wikipedia');

    sleep();
    searchResultElements[1].click();


    expect(browser.getCurrentUrl()).toEqual('https://en.wikipedia.org/wiki/%22Hello,_World!%22_program');
    expect(browser.getTitle()).toEqual('"Hello, World!" program - Wikipedia');
    sleep();
  })

});
