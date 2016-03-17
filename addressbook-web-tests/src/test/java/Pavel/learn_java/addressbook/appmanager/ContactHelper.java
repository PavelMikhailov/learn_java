package Pavel.learn_java.addressbook.appmanager;

import Pavel.learn_java.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitNewContakt() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillContaktForm(ContactData ContactData, boolean creation) {
    type(By.name("firstname"), ContactData.getName());
    type(By.name("middlename"), ContactData.getMiddlename());
    type(By.name("lastname"), ContactData.getLastname());
    type(By.name("nickname"), ContactData.getNickname());
    type(By.name("title"), ContactData.getTitle());
    type(By.name("company"), ContactData.getCompany());
    type(By.name("address"), ContactData.getWorkaddress());
    type(By.name("home"), ContactData.getHomenumber());
    type(By.name("mobile"), ContactData.getMobilenumber());
    type(By.name("work"), ContactData.getWorknumber());
    type(By.name("fax"), ContactData.getFaxnumber());
    type(By.name("email"), ContactData.getEmail1());
    type(By.name("email2"), ContactData.getEmail2());
    type(By.name("email3"), ContactData.getEmail3());
    type(By.name("homepage"), ContactData.getHomepage());
    type(By.name("address2"), ContactData.getHomeaddress());
    type(By.name("phone2"), ContactData.getHousenumber());
    type(By.name("notes"), ContactData.getNotes());

    if (creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(ContactData.getGroup());
      } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void newContaktCreation() {
    click(By.linkText("add new"));
  }

  public void selectContact(int index) {
    wd.findElements(By.name ("selected[]")).get(index).click();
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

  public void createContact(ContactData contact) {
    newContaktCreation();
    fillContaktForm(contact);
    submitNewContakt();
    returnToHomePage();

  }

  private void fillContaktForm(ContactData ContactData) {
    type(By.name("firstname"), ContactData.getName());
    type(By.name("middlename"), ContactData.getMiddlename());
    type(By.name("lastname"), ContactData.getLastname());
    type(By.name("nickname"), ContactData.getNickname());
    type(By.name("title"), ContactData.getTitle());
    type(By.name("company"), ContactData.getCompany());
    type(By.name("address"), ContactData.getWorkaddress());
    type(By.name("home"), ContactData.getHomenumber());
    type(By.name("mobile"), ContactData.getMobilenumber());
    type(By.name("work"), ContactData.getWorknumber());
    type(By.name("fax"), ContactData.getFaxnumber());
    type(By.name("email"), ContactData.getEmail1());
    type(By.name("email2"), ContactData.getEmail2());
    type(By.name("email3"), ContactData.getEmail3());
    type(By.name("homepage"), ContactData.getHomepage());
    type(By.name("address2"), ContactData.getHomeaddress());
    type(By.name("phone2"), ContactData.getHousenumber());
    type(By.name("notes"), ContactData.getNotes());
  }

 public void returnToHomePage() {
if (isElementPresent(By.id("maintable"))){
       return;
    }
  click(By.linkText("home page"));
 }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }

  public List<ContactData> getContactList() {
    List<ContactData> contacts = new ArrayList<ContactData>();
    List<WebElement> elements = wd.findElements(By.name("selected[]"));
    for (WebElement element : elements) {
      String name = element.getText();
      String lastname = element.getText();
      String address = element.getText();
      ContactData contact = new ContactData(name,lastname,address,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
      contacts.add(contact);
    }
    return contacts;
  }
}
