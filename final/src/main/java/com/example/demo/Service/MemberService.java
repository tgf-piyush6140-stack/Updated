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

    public boolean deleteMember(MemberEntity memberEntity)
    {
        if(memberRepository.existsById(memberEntity.getId())) {
            memberRepository.deleteById(memberEntity.getId());
            return true ;
        }
        else { return false;}
    }
    public boolean addMember(MemberEntity memberEntity)
    {
        memberRepository.save(memberEntity);
        return true;
    }
    public boolean updateMember(MemberEntity member)
    {
        if(memberRepository.existsById(member.getId()))
        {
        memberRepository.deleteById(member.getId());
        memberRepository.save(member);
        return true;
        }
        else
        {
            return false;
        }

    }


}
