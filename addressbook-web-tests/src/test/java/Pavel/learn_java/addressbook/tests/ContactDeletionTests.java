package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.contactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    int before = app.getContactHelper().getContactCount();
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new contactData("Ivan", "II", "Ivanov", "Vanya", "employee", "Company", "address", "4444444", "5555555", "6666666", "7777777", "ivan.ivanovii.@company.com", "ivan@home.ru", "ivan@hame2.ru", "www.ivan.ru", "test1", "Address", "Number", "edit"));
    }
    app.getContactHelper().selectContact(before -1);
    app.getContactHelper().deleteContact();
    app.getContactHelper().alertAccept();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }
}
