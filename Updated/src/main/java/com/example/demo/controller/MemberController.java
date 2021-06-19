package com.example.demo.controller;

import com.example.demo.model.MemberEntity;
import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/member/all")
    public List<MemberEntity> getAllMember()
    {
        return memberService.getAllMember();
    }
@DeleteMapping("/member/delete")
    public void deletemember(@RequestBody  int id)
{
    memberService.deleteMember(id);
}

}
