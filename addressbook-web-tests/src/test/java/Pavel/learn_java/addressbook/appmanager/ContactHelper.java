package Pavel.learn_java.addressbook.appmanager;

import Pavel.learn_java.addressbook.model.contactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContakt() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContaktForm(contactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getWorkaddress());
    type(By.name("home"), contactData.getHomenumber());
    type(By.name("mobile"), contactData.getMobilenumber());
    type(By.name("work"), contactData.getWorknumber());
    type(By.name("fax"), contactData.getFaxnumber());
    type(By.name("email"), contactData.getEmail1());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomepage());
    type(By.name("address2"), contactData.getHomeaddress());
    type(By.name("phone2"), contactData.getHousenumber());
    type(By.name("notes"), contactData.getNotes());

    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
      } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void newContaktCreation() {
    click(By.linkText("add new"));
  }

  public void selectContact() {
    click(By.id("38"));
  }

  public void deleteContact() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void initContactModification(){
    click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));

  }

  public void submitContaktModification() {
    click(By.xpath("//div[@id='content']/form[1]/input[22]"));

  }

  public void createContact(contactData contact) {
    newContaktCreation();
    fillContaktForm(contact);
    submitNewContakt();
    returnToHomePage();

  }

  private void fillContaktForm(contactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("middlename"), contactData.getMiddlename());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("nickname"), contactData.getNickname());
    type(By.name("title"), contactData.getTitle());
    type(By.name("company"), contactData.getCompany());
    type(By.name("address"), contactData.getWorkaddress());
    type(By.name("home"), contactData.getHomenumber());
    type(By.name("mobile"), contactData.getMobilenumber());
    type(By.name("work"), contactData.getWorknumber());
    type(By.name("fax"), contactData.getFaxnumber());
    type(By.name("email"), contactData.getEmail1());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());
    type(By.name("homepage"), contactData.getHomepage());
    type(By.name("address2"), contactData.getHomeaddress());
    type(By.name("phone2"), contactData.getHousenumber());
    type(By.name("notes"), contactData.getNotes());
  }

  public boolean isThereAContact() {
    return isElementPresent(By.id("38"));
  }
}
