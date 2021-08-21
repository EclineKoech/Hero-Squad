package models;

import java.util.ArrayList;

public class Hero {
  private String content;
  private static ArrayList<Hero> instances = new ArrayList<>();
    public Hero(String content) {
      this.content = content;
      instances.add(this);
    }

  public Hero(String name, int age, String power, String weakness) {
  }

  public String getContent(){
      return content;
    }
  public static void main(String[] args) {

  }
  public static ArrayList<Hero> getAll(){
    ArrayList<Hero> instances = new ArrayList<>();
    return instances;
  }
  public static void clearAllPosts(){
      instances.clear();
  }
}
