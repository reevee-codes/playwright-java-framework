package pages.complicatedPage;

import com.microsoft.playwright.Page;
import pages.BasePage;
import config.Configuration;

public class ComplicatedPageFunctions extends BasePage {
    private final ComplicatedPageComponent complicatedPageComponent;

    public ComplicatedPageFunctions(Page page) {
        super(page);
        this.complicatedPageComponent = new ComplicatedPageComponent(page);
    }

    public void navigate() {
        page.navigate(Configuration.getFullUrl(Configuration.Paths.COMPLICATED_PAGE));
        waitForPageLoad();
    }

    public void clickOnFirstButton() {
        complicatedPageComponent.firstButton.click();
    }
}
