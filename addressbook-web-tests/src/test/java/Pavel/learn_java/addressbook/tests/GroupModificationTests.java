package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModifiction() {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGruopHelper().isThereAGroup()){
      app.getGruopHelper().createGroup(new GroupData("test1", null, "test3"));
    }
    List<GroupData> before = app.getGruopHelper().getGroupList();
    app.getGruopHelper().selectGroup(before.size() -1);
    app.getGruopHelper().initGroupModification();
    app.getGruopHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
    app.getGruopHelper().submitGroupModification();
    app.getGruopHelper().returnToGroupPage();
    List<GroupData> after = app.getGruopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size());
  }
}
