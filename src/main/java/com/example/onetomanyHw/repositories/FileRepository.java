package com.example.onetomanyHw.repositories;

import com.example.onetomanyHw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository <File, Long> {
}
