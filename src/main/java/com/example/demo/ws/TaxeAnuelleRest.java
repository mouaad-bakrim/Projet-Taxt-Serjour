package com.example.demo.ws;

import com.example.demo.bean.TaxeAnuelle;
import com.example.demo.service.TaxeAnuelleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class TaxeAnuelleRest {
    @Autowired
    private TaxeAnuelleService taxeAnuelleService ;
    @GetMapping("/code/{code}")
    public List<TaxeAnuelle> findByRedevableId(Long id) {
        return taxeAnuelleService.findByRedevableId(id);
    }
    @GetMapping("/code/{code}")
    public List<TaxeAnuelle> findByCategorieLocaleSejour(Long id) {
        return taxeAnuelleService.findByCategorieLocaleSejour(id);
    }
    @GetMapping("/code/{code}")
    public List<TaxeAnuelle> findByLocale(Long id) {
        return taxeAnuelleService.findByLocale(id);
    }
    @GetMapping("/code/{code}")
    public TaxeAnuelle findByAnnee(int annee) {
        return taxeAnuelleService.findByAnnee(annee);
    }
    @Transactional
    @DeleteMapping("/code/{code}")
    public int deleteByAnnee(int annee) {
        return taxeAnuelleService.deleteByAnnee(annee);
    }
    @PostMapping("/")
    public int save(TaxeAnuelle taxeAnuelle) {
        return taxeAnuelleService.save(taxeAnuelle);
    }

}
