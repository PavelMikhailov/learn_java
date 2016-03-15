package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGruopHelper().getGroupCount();
    if(! app.getGruopHelper().isThereAGroup()){
      app.getGruopHelper().createGroup(new GroupData("test1", null, "test3"));
    }
    app.getGruopHelper().selectGroup(before -1);
    app.getGruopHelper().deleteSelectedGroups();
    app.getGruopHelper().returnToGroupPage();
    int after = app.getGruopHelper().getGroupCount();
    Assert.assertEquals(after, before - 1);
  }

}