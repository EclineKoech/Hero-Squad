package models;

import java.util.ArrayList;


public class Hero {
  private static Object Hero;
  private String name;
  private int age;
  private String power;
  private String weakness;
  private static ArrayList<Hero> instances = new ArrayList<>();

  public Hero(String name, int age, String power, String weakness) {
    this.name = name;
    this.age = age;
    this.power = power;
    this.weakness = weakness;
  }

  public static Object getAll() {
    return (Object) Hero;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPower() {
    return power;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public String getWeakness() {
    return weakness;
  }

  public void setWeakness(String weakness) {
    this.weakness = weakness;
  }

  public Hero() {
    super();
  }

}


//
//  public Hero(String hero) {
//      this.hero = hero;
//      instances.add(this);
//    }
//
//  public Hero(String hero, Object hero1) {
//    this.hero = hero;
//    Hero = hero1;
//  }
//
//  public void setHero(String hero) {
//    this.hero = hero;
//  }
//
//  public static ArrayList<models.Hero> getInstances() {
//    return instances;
//  }
//
//  public static void setInstances(ArrayList<models.Hero> instances) {
//    Hero.instances = instances;
//  }
//
//  public void setHero(Object hero) {
//    Hero = hero;
//  }
//
//  public Hero(String name, int age, String power, String weakness) {
//  }
//
//  public String getHero(){
//      return (String) Hero;
//    }
//  public static void main(String[] args) {
//
//  }
//  public static ArrayList<Hero> getAll(){
//    ArrayList<Hero> instances = new ArrayList<>();
//    return instances;
//  }
//  public static void clearAllPosts(){
//      instances.clear();
//  }
//}
