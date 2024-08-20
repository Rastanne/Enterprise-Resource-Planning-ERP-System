package com.example.myproject.repository;

import com.example.myproject.model.MyModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepository extends JpaRepository<MyModel, Long> {
}
