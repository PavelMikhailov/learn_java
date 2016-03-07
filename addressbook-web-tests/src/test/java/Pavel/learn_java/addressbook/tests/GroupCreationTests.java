package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGruopHelper().initGroupCreation();
    app.getGruopHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGruopHelper().submitGroupCreation();
    app.getGruopHelper().returnToGroupPage();
  }

}
