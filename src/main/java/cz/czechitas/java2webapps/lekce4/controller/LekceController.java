package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lekce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci lekcí.
 */
@Controller()
@RequestMapping("/lekce")
public class LekceController {
  private final List<Lekce> lekce;

  public LekceController() {
    lekce = Arrays.asList(
            new Lekce("Lekce 1", LocalDate.of(2021, 4, 21), LocalTime.of(18, 0), LocalTime.of(20, 30), "Brno"),
            new Lekce("Lekce 2", LocalDate.of(2021, 5, 21), LocalTime.of(15, 30), LocalTime.of(18, 0), "Praha"),
            new Lekce("Lekce 3", LocalDate.of(2021, 6, 21), LocalTime.of(10, 0), LocalTime.of(12, 30), null)
    );
  }

  /**
   * Metoda kontroleru obsluhující adresu {@code /lekce/}. Používá šablonu {@code /templates/lekce/index.html}.
   */
  @GetMapping("/")
  public ModelAndView lekce() {
    ModelAndView modelAndView = new ModelAndView("lekce/index");
    modelAndView.addObject("lekce", lekce);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("lekce/detail");
    modelAndView.addObject("lekcia", lekce.get(id));
    return modelAndView;
  }
}
