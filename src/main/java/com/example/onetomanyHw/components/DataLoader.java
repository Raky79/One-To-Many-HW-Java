package com.example.onetomanyHw.components;

import com.example.onetomanyHw.models.File;
import com.example.onetomanyHw.models.Folder;
import com.example.onetomanyHw.models.User;
import com.example.onetomanyHw.repositories.FileRepository;
import com.example.onetomanyHw.repositories.FolderRepository;
import com.example.onetomanyHw.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        User sara = new User("Sara");
        userRepository.save(sara);

        Folder pictures = new Folder("Pictures", sara);
        folderRepository.save(pictures);

        File snowpictures = new File("Snow Pictures", "jpg", "8MB", pictures);
        fileRepository.save(snowpictures);


    }
}
