package Pavel.learn_java.addressbook.appmanager;

import Pavel.learn_java.addressbook.model.ContaktData;
import Pavel.learn_java.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HeplerBase{

  public GroupHelper(FirefoxDriver wd) {
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

  public void submitNewContakt() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContaktForm(ContaktData ContaktData) {
    type(By.name("firstname"), ContaktData.getName());
    type(By.name("middlename"), ContaktData.getMiddlename());
    type(By.name("lastname"), ContaktData.getLastname());
    type(By.name("nickname"), ContaktData.getNickname());
    type(By.name("title"), ContaktData.getTitle());
    type(By.name("company"), ContaktData.getCompany());
    type(By.name("address"), ContaktData.getWorkaddress());
    type(By.name("home"), ContaktData.getHomenumber());
    type(By.name("mobile"), ContaktData.getMobilenumber());
    type(By.name("work"), ContaktData.getWorknumber());
    type(By.name("fax"), ContaktData.getFaxnumber());
    type(By.name("email"), ContaktData.getEmail1());
    type(By.name("email2"), ContaktData.getEmail2());
    type(By.name("email3"), ContaktData.getEmail3());
    type(By.name("homepage"), ContaktData.getHomepage());
    type(By.name("address2"), ContaktData.getHomeaddress());
    type(By.name("phone2"), ContaktData.getHousenumber());
    type(By.name("notes"), ContaktData.getNotes());
  }

  public void newContaktCreation() {
    click(By.linkText("add new"));
  }
}
