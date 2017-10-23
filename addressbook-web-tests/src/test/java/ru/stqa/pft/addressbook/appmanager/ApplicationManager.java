package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by alexeykozlov on 10/13/17.
 */
public class ApplicationManager {

  private RemoteWebDriver wd;
  private SessionHelper sessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public void init() {

    boolean firefox = System.getProperty("myDriver").equals("firefox");
    if (firefox) {
      System.setProperty("webdriver.gecko.driver", "/Users/alexeykozlov/Downloads/geckodriver 2");
      wd = new FirefoxDriver();
    } else {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-fullscreen");
      System.setProperty("webdriver.chrome.driver", "/Users/alexeykozlov/Desktop/automation/chromedriver");
      wd = new ChromeDriver(options);
    }
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
