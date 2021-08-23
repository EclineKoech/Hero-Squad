package models;

import java.util.ArrayList;

public class Squad {
  private static Object Squad;
  private String name;
  private String cause;
  private int size;
  public static ArrayList<Squad> instances = new ArrayList<>();

  public Squad(String name, String cause, int size) {
    this.name = name;
    this.cause = cause;
    this.size = size;
  }

  public static Object getAll() {
    return (Object) Squad;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCause() {
    return cause;
  }

  public void setCause(String cause) {
    this.cause = cause;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public static ArrayList<Squad> getSquad() {
    return (ArrayList<models.Squad>) Squad;
  }

}
