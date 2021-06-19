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
    public boolean deletemember(@RequestBody MemberEntity memberEntity)
    {
        return memberService.deleteMember(memberEntity);

    }

    @PostMapping("/member/add")
    public boolean addmember(@RequestBody  MemberEntity memberEntity)
    {
        return memberService.addMember(memberEntity);
    }

    @PutMapping("/member/update")
    public boolean update(@RequestBody MemberEntity memberEntity)
    {
        return memberService.updateMember(memberEntity);
    }


}
