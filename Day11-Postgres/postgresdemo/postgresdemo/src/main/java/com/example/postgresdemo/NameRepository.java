package com.example.postgresdemo;

import org.springframework.data.jpa.repository.JpaRepository;

interface NameRepository extends JpaRepository<Name,Long> {
}