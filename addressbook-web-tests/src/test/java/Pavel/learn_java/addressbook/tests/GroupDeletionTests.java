package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if(! app.getGruopHelper().isThereAGroup()){
      app.getGruopHelper().createGroup(new GroupData("test1", null, "test3"));
    }
    app.getGruopHelper().selectGroup();
    app.getGruopHelper().deleteSelectedGroups();
    app.getGruopHelper().returnToGroupPage();
  }

}