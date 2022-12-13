package com.example.onetomanyHw.repositories;

import com.example.onetomanyHw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository <Folder, Long> {
}
