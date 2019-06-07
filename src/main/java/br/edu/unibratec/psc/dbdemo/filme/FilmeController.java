package br.edu.unibratec.psc.dbdemo.filme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * 
 *
 */
@RestController
@RequestMapping(path = "/filme")
// http://localhost:8080/filme
public class FilmeController {
    
    @Autowired
    private FilmeRepository FilmeRepository;
    
    @GetMapping(path = "/")
    public @ResponseBody Iterable<Filme> getfilme(){
        return FilmeRepository.findAll();
    }

}