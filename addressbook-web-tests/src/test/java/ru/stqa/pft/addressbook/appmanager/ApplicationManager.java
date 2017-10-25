package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexeykozlov on 10/13/17.
 */
public class ApplicationManager {
  ChromeDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {
    System.setProperty("webdriver.chrome.driver", "/Users/alexeykozlov/Desktop/automation/chromedriver");
    wd = new ChromeDriver();
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
