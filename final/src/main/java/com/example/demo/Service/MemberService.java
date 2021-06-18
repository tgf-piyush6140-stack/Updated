package com.example.demo.Service;

import com.example.demo.Model.MemberEntity;
import com.example.demo.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    public List<MemberEntity> getAllMember()
    {
        return memberRepository.findAll();
    }

    public void deleteMember(int id)
    {
        if(memberRepository.existsById(id))
        {
            memberRepository.deleteById(id);
        }
    }
    public void addMember(MemberEntity memberEntity)
    {
        memberRepository.save(memberEntity);
    }
    public void updateMember(MemberEntity member)
    {
        if(memberRepository.existsById(member.getId()))
        {
        memberRepository.deleteById(member.getId());
        memberRepository.save(member);
        }

    }


}
