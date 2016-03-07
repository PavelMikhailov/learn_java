package Pavel.learn_java.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGruopHelper().selectGroup();
    app.getGruopHelper().deleteSelectedGroups();
    app.getGruopHelper().returnToGroupPage();
  }

}