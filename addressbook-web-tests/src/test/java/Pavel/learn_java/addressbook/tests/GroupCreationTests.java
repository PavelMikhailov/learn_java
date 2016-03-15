package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGruopHelper().getGroupCount();
    app.getGruopHelper().initGroupCreation();
    app.getGruopHelper().fillGroupForm(new GroupData("test1", null, "test3"));
    app.getGruopHelper().submitGroupCreation();
    app.getGruopHelper().returnToGroupPage();
    int after = app.getGruopHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }

}
