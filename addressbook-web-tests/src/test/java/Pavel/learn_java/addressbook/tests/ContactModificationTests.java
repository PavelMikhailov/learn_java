package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.contactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if(! app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new contactData("Ivan", "II", "Ivanov", "Vanya", "employee", "Company", "address", "4444444", "5555555", "6666666", "7777777", "ivan.ivanovii.@company.com", "ivan@home.ru", "ivan@hame2.ru", "www.ivan.ru", "test1", "Address", "Number", "edit"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContaktForm(new contactData("Ivan", "II", "Ivanov", "Vanya", "employee", "Company", "address", "4444444", "5555555", "6666666", "7777777", "ivan.ivanovii.@company.com", "ivan@home.ru", "ivan@hame2.ru", "www.ivan.ru", null, "Address", "Number", "edit"), false);
    app.getContactHelper().submitContaktModification();
    app.getNavigationHelper().returnToHomePage();
  }
}
