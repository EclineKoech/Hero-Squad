package models;

import org.junit.Test;


import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

  @org.junit.jupiter.api.BeforeEach
  void setUp() {
  }

  @Test
  public void NewPostObjectGetCorrectlyCreated_true() throws Exception {
    Hero hero = new Hero("Day 1: Intro");
    assertTrue(true);
  }

  @Test
  public void PostInstantiatesWithContent_true() throws Exception {
    Hero hero = new Hero("Day 1: Intro");
    assertEquals("Day 1: Intro", hero.getContent());
  }

  @org.junit.jupiter.api.AfterEach
  void tearDown() {
    Hero.clearAllPosts();
  }
  @Test
  public void AllPostsAreCorrectlyReturned_true(){
    Hero hero = new Hero("Day 1: Intro");
    Hero otherHero = new Hero("How to pair successfully");
    assertEquals(2, Hero.getAll().size());
  }
  @Test
  public void AllPostsContainsAllPosts_true(){
    Hero hero = new Hero("Day 1: Intro");
    Hero otherHero = new Hero("How to pair successfully");
    assertTrue(Hero.getAll().contains(hero));
    assertTrue(Hero.getAll().contains(otherHero));
  }

}