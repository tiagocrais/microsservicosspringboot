package com.tiagocr.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagocr.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
