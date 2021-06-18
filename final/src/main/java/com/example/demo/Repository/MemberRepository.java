package com.example.demo.Repository;

import com.example.demo.Model.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity,Integer> {
}
