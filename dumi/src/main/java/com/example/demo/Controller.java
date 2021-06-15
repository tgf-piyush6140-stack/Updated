package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    memberService service;
    @DeleteMapping("/param")
    public int re(@RequestBody int name)
    {
        return name;
    }

    @GetMapping("/member")
    public List<member> getal()
    {
        return service.getall();
    }

    @PostMapping("/member/add")
    public member add(@RequestBody member member)
    {
        service.addone(member);
        return member;
    }
    @DeleteMapping("/member/delete/{id}")
    public String delt(@PathVariable("id") int id) {
        service.delet(id);
        return "Deleted";
    }

    @PutMapping("/member/update")
    public String updat(@RequestBody member member)
    {
        service.update(member);
        return "updated";
    }

    @GetMapping("/member/one/{id}")
    public String geton(@PathVariable int id)
    {
        return service.get1(id);
    }
}
