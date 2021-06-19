package com.example.demo.service;

import com.example.demo.model.MemberEntity;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
      memberRepository.deleteById(id);
  }
}
