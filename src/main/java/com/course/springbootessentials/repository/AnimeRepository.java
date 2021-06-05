package com.course.springbootessentials.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.springbootessentials.domain.Anime;

public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
