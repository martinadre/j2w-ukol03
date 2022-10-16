package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
          new Vizitka ("Deon", "Meyer", "Deon Mayer, a.s.", "Stellenbosch Ward 9, South Africa", "info@deonmeyer.com", "+44 (0)207 284 0408", "www.deonmeyer.com"),
          new Vizitka ("Lenny", "Kravitz", "Lenny Kravitz, s.r.o.", "Fleming Avenue, The Bahamas", null, "(615) 750-3590", "www.lennykravitz.com"),
          new Vizitka ("Monika", "Ptáčníková", "Vekra, a.s.", "Sokolská Třída 3, 70200, Ostrava", "monika@vekra.cz",null, "www.vekra.cz"),
          new Vizitka ("Mirka", "Zatloukalová","Java, s.r.o.", "Partyzánské nám. 4, 70200, Ostrava", "mirka@java.com","+420 756 321 456", null)
  );

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("/seznam");
    modelAndView.addObject("vizitky", seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("/detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }
}
