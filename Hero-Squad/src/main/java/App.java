import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.post;

import static spark.Spark.*;

public class App {
  
  public static  void main(String[] args) {
    staticFileLocation("/public");
    get("/", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model,"layout.hbs");
    }, new HandlebarsTemplateEngine());

    get("/home", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model,"home.hbs");
    }, new HandlebarsTemplateEngine());

    get("/hero", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model,"hero.hbs");
    }, new HandlebarsTemplateEngine());


    get("/hero_squad", (request, response) -> {
      Map<String, ArrayList<Hero>> model = new HashMap<>();
      Object hero = model.put("hero", (ArrayList<Hero>) Hero.getAll());
      return new ModelAndView(model, "hero_squad.hbs");
    }, new HandlebarsTemplateEngine());
    post("/hero_squad", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String power = request.queryParams("power");
      String weakness = request.queryParams("weakness");
      Hero hero = new Hero(name, age, power, weakness);
      model.put("hero", hero);
      return new ModelAndView(model, "hero_squad.hbs");
    }, new HandlebarsTemplateEngine());

    get("/squad", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model,"squad.hbs");
    }, new HandlebarsTemplateEngine());


    get("/squad_hero", (request, response) -> {
      Map<String, ArrayList<Squad>> model = new HashMap<>();
      Object squad = model.put("squad", (ArrayList<Squad>) Squad.getAll());
      return new ModelAndView(model, "squad_hero.hbs");
    }, new HandlebarsTemplateEngine());
    post("/squad_hero", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      int size = Integer.parseInt(request.queryParams("size"));
      String cause = request.queryParams("cause");
      Squad squad = new Squad(name, size, cause);
      model.put("squad", squad);
      return new ModelAndView(model, "squad_hero.hbs");
    }, new HandlebarsTemplateEngine());


    get("/squad_hero", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model, "squad_hero.hbs");
    }, new HandlebarsTemplateEngine());

    get("/squad", (request, response) -> {
      Map<String, Object> model = new HashMap<>();
      ArrayList<models.Squad> squads = models.Squad.getAll();
      return new ModelAndView(model, "squad.hbs");
    }, new HandlebarsTemplateEngine());


    post("/squad_hero", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      String cause = request.queryParams("cause");
      String size = request.queryParams("size");
      ArrayList<models.Squad> squads = models.Squad.getAll();
      model.put("name", squads);
      return new ModelAndView(model, "squad_hero.hbs");
    }, new HandlebarsTemplateEngine());
  }
}