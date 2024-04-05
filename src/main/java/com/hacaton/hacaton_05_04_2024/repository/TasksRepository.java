package com.hacaton.hacaton_05_04_2024.repository;

import com.hacaton.hacaton_05_04_2024.domain.entity.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TasksRepository extends JpaRepository<Tasks, Integer> {
}
