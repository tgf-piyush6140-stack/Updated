package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class memberService {
    @Autowired
    Repo repo;
    public List<member> getall()
    {
        return repo.findAll();
    }

    public void addone(member member)
    {
        repo.save(member);
    }

    public void delet(int id)
    {
        repo.deleteById(id);
    }

    public  void update (member member)
    {
        repo.save(member);
    }

    public String get1(int id)
    {
        return repo.getoen(id).toString();
    }
}
