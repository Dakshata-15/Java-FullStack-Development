package com.example.postgresdemo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/names")
public class NameController {
    private final NameRepository repo;
    public NameController(NameRepository repo){
        this.repo = repo;
    }
    @GetMapping
    public List<Name> getAll(){
        return repo.findAll();
    }
    @PostMapping
    public Name add(@RequestBody Name n){
        return repo.save(n);
    }
}
