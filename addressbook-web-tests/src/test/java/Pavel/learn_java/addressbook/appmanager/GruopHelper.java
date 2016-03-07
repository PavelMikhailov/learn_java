package Pavel.learn_java.addressbook.appmanager;

import Pavel.learn_java.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Pavel on 07.03.2016.
 */
public class GruopHelper extends HelperBase{

  public GruopHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returnToGroupPage() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupData GroupData) {
    type(By.name("group_name"), GroupData.getName());
    type(By.name("group_header"), GroupData.getHeader());
    type(By.name("group_footer"), GroupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.name("delete"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
