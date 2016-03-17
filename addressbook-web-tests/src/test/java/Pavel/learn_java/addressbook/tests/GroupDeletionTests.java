package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGruopHelper().isThereAGroup()){
      app.getGruopHelper().createGroup(new GroupData("test1", null, "test3"));
    }
    List<GroupData> before = app.getGruopHelper().getGroupList();
    app.getGruopHelper().selectGroup(before.size() -1);
    app.getGruopHelper().deleteSelectedGroups();
    app.getGruopHelper().returnToGroupPage();
    List<GroupData> after = app.getGruopHelper().getGroupList();
    Assert.assertEquals(after.size(), before.size() - 1);
  }

}