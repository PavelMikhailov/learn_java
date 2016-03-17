package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NewContaktCreationTest extends TestBase {

  @Test
  public void testNewContaktCreation() {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().newContaktCreation();
    app.getContactHelper().fillContaktForm(new ContactData("Ivan", "II", "Ivanov", "Vanya", "employee", "Company", "address", "4444444", "5555555", "6666666", "7777777", "ivan.ivanovii.@company.com", "ivan@home.ru", "ivan@hame2.ru", "www.ivan.ru", "test1", "Address", "Number", "edit"), true);
    app.getContactHelper().submitNewContakt();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() + 1);
  }

}
