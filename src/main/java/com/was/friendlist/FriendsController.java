package com.was.friendlist;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("friends")
public class FriendsController {
     FriendsRespository repo;
    public FriendsController (){
        repo = new FriendsRespository();
    }
    @GetMapping("all")
    public Collection<Friends> getAll(){
        return repo.viewAll();
    }

    @PostMapping("add")
    public String addplayer (@RequestBody Friends p){
        repo.save(p);
        return "Friend saved as " + p.getName();
    }
}
