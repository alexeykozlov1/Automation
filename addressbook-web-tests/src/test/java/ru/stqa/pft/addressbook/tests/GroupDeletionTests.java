package ru.stqa.pft.addressbook.tests;

/**
 * Created by alexeykozlov on 10/13/17.
 */

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {


  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().goToGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().deleteSelectedGroups();
    app.getGroupHelper().returnToGroupPage();
  }

}
