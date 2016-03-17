package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGruopHelper().getGroupList();
    app.getGruopHelper().initGroupCreation();
    app.getGruopHelper().fillGroupForm(new GroupData("test1", null, "test3"));
    app.getGruopHelper().submitGroupCreation();
    app.getGruopHelper().returnToGroupPage();
    List<GroupData> after = app.getGruopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
