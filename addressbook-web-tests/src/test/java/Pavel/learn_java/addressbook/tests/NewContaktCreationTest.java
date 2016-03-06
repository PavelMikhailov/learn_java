package Pavel.learn_java.addressbook.tests;

import Pavel.learn_java.addressbook.model.ContaktData;
import org.testng.annotations.Test;

public class NewContaktCreationTest extends TestBase {

  @Test
  public void testNewContaktCreation() {
    app.newContaktCreation();
    app.fillContaktForm(new ContaktData("Ivan", "II", "Ivanov", "Vanya", "employee", "Company", "address", "4444444", "5555555", "6666666", "7777777", "ivan.ivanovii.@company.com", "ivan@home.ru", "ivan@hame2.ru", "www.ivan.ru", "Address", "Number", "edit"));
    app.submitNewContakt();
  }

}
