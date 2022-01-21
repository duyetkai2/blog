package com.duyet.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duyet.springmvc.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {

}
