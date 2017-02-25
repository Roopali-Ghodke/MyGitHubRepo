import { MyHerosListPage } from './app.po';

describe('my-heros-list App', () => {
  let page: MyHerosListPage;

  beforeEach(() => {
    page = new MyHerosListPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
