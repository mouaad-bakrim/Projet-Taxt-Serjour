package com.example.demo.ws;

import com.example.demo.bean.Quartiere;
import com.example.demo.service.QuartierService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class Quartierws {
    @Autowired
    private QuartierService quartierService;
    @GetMapping("/code/{code}")

    public Quartiere findByCode(Double code) {
        return quartierService.findByCode(code);
    }
    @GetMapping("/")

    public List<Quartiere> findAll() {
        return quartierService.findAll();
    }
    @PostMapping("/")

    public int save(Quartiere quartiere) {
        return quartierService.save(quartiere);
    }
    @DeleteMapping("/")
    @Transactional
    public int deleteByCode(Double code) {
        return quartierService.deleteByCode(code);
    }
}