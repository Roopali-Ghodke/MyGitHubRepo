import { UserInputPage } from './app.po';

describe('user-input App', () => {
  let page: UserInputPage;

  beforeEach(() => {
    page = new UserInputPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
