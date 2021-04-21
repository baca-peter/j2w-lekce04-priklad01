package cz.czechitas.java2webapps.lekce4.controller;

import cz.czechitas.java2webapps.lekce4.entity.Lektor;
import cz.czechitas.java2webapps.lekce4.entity.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující sekci lektorů.
 */
@Controller()
@RequestMapping("/lektori")
public class LektoriController {
  private final List<Lektor> lektori;

  public LektoriController() {
    lektori = Arrays.asList(
            new Lektor("Markéta Pátková", Role.WORKSHOPISTKA),
            new Lektor("Filip Jirsák", Role.LEKTOR),
            new Lektor("Adam Výšinský", Role.KOUC)
    );
  }

  /**
   * Metoda kontroleru obsluhující adresu {@code /lektori/}. Používá šablonu {@code /templates/lektori/index.html}.
   *
   */
  @GetMapping("/")
  public ModelAndView lektori() {
    ModelAndView modelAndView = new ModelAndView("lektori/index");
    modelAndView.addObject("lektori", lektori);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("lektori/detail");
    modelAndView.addObject("lektor", lektori.get(id));
    return modelAndView;
  }


}
