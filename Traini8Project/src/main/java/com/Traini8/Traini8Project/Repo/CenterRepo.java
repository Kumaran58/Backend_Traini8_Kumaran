package com.Traini8.Traini8Project.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Traini8.Traini8Project.Model.CenterModel;

@Repository
public interface CenterRepo extends JpaRepository<CenterModel, Long> {

}
