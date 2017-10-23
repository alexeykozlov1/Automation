package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;
import ru.stqa.pft.addressbook.appmanager.NavigationHelper;

/**
 * Created by alexeykozlov on 10/13/17.
 */
public class TestBase {

  protected final ApplicationManager app = new ApplicationManager();

  NavigationHelper getNavigationHelper() {
    return app.getNavigationHelper();
  }

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() throws Exception {
    app.stop();
  }

}
