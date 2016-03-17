package Pavel.learn_java.addressbook.model;

public class ContactData {
  private final String name;
  private final String middlename;
  private final String lastname;
  private final String nickname;
  private final String title;
  private final String company;
  private final String workaddress;
  private final String homenumber;
  private final String mobilenumber;
  private final String worknumber;
  private final String faxnumber;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String homepage;
  private String group;
  private final String homeaddress;
  private final String housenumber;
  private final String notes;

  public ContactData(String name, String middlename, String lastname, String nickname, String title, String company, String workaddress, String homenumber, String mobilenumber, String worknumber, String faxnumber, String email1, String email2, String email3, String homepage, String group, String homeaddress, String housenumber, String notes) {
    this.name = name;
    this.middlename = middlename;
    this.lastname = lastname;
    this.nickname = nickname;
    this.title = title;
    this.company = company;
    this.workaddress = workaddress;
    this.homenumber = homenumber;
    this.mobilenumber = mobilenumber;
    this.worknumber = worknumber;
    this.faxnumber = faxnumber;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.homepage = homepage;
    this.group = group;
    this.homeaddress = homeaddress;
    this.housenumber = housenumber;
    this.notes = notes;
  }

  public String getName() {
    return name;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getTitle() {
    return title;
  }

  public String getCompany() {
    return company;
  }

  public String getWorkaddress() {
    return workaddress;
  }

  public String getHomenumber() {
    return homenumber;
  }

  public String getMobilenumber() {
    return mobilenumber;
  }

  public String getWorknumber() {
    return worknumber;
  }

  public String getFaxnumber() {
    return faxnumber;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getHomepage() {
    return homepage;
  }

  public String getHomeaddress() {
    return homeaddress;
  }

  public String getHousenumber() {
    return housenumber;
  }

  public String getNotes() {
    return notes;
  }

  public String getGroup() {
    return group;
  }
}
