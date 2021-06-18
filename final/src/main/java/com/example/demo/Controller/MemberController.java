package com.example.demo.Controller;

import com.example.demo.Model.MemberEntity;
import com.example.demo.Service.MemberService;
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
    public void deletemember(@RequestBody int id)
    {
        memberService.deleteMember(id);
    }

    @PostMapping("/member/add")
    public void addmember(@RequestBody  MemberEntity memberEntity)
    {
        memberService.addMember(memberEntity);
    }

    @PutMapping("/member/update")
    public void update(@RequestBody MemberEntity memberEntity)
    {
        memberService.updateMember(memberEntity);
    }


}
