package fr.eni.tp.azurepipeline.entity;

public class User {
  String name = "";
  String email = "";
  int date = 0;

  public User() {
  }

  public User(String name, String email, int date) {
    this.name = name;
    this.email = email;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", date=" + date +
        '}';
  }
}
