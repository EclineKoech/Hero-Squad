import models.Hero;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
      Map<String, String> model = new HashMap<>();
      return new ModelAndView(model, "hero_squad.hbs");
    }, new HandlebarsTemplateEngine());
    post("/hero_squad", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String power = request.queryParams("power");
      String weakness = request.queryParams("weakness");
      Hero hero = new Hero(name, age, power, weakness);
      ArrayList<models.Hero> heroes = models.Hero.getAll();
      model.put("hero", heroes);
      return new ModelAndView(model, "hero_squad.hbs");
    }, new HandlebarsTemplateEngine());


    get("/squad", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      return new ModelAndView(model, "squad.hbs");
    }, new HandlebarsTemplateEngine());
    post("/squad_hero", (request, response) ->{
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("name");
      ArrayList<models.Hero> heroes = models.Hero.getAll();
      model.put("name", heroes);
      return new ModelAndView(model, "squad_hero.hbs");
    }, new HandlebarsTemplateEngine());
  }
}