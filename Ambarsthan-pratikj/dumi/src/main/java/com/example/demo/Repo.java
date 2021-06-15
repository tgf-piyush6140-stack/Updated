package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Repo extends JpaRepository<member,Integer> {
@Query("select m from member m where m.KhojiId=:id")
public member getoen(@Param("id") int id);
}
