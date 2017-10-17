package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by alexeykozlov on 10/13/17.
 */
public class NavigationHelper extends HelperBase{


  public NavigationHelper(ChromeDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
