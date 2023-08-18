package com.diyo.realestatelist.repository;

import com.diyo.realestatelist.entity.Land;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepository extends JpaRepository<Land, Long> {
}
