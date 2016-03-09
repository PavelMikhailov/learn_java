package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModifiction() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGruopHelper().selectGroup();
    app.getGruopHelper().initGroupModification();
    app.getGruopHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGruopHelper().submitGroupModification();
    app.getGruopHelper().returnToGroupPage();
  }
}