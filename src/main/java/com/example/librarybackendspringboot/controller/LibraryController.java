package com.example.librarybackendspringboot.controller;

import com.example.librarybackendspringboot.dao.LibraryDao;
import com.example.librarybackendspringboot.dao.UserregisterationDao;
import com.example.librarybackendspringboot.model.Library;
import com.example.librarybackendspringboot.model.Userregisteration;
import jakarta.servlet.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LibraryController {

    @Autowired
    private LibraryDao dao;
    private UserregisterationDao dao1;
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public Map<String,String> Addbook(@RequestBody Library l){
        System.out.println(l.getTitle().toString());
        System.out.println(l.getImage().toString());
        System.out.println(l.getAuthor().toString());
        System.out.println(l.getDescription().toString());
        System.out.println(l.getLanguage().toString());
        System.out.println(l.getDistributor().toString());
        System.out.println(l.getReleasedyear().toString());
        System.out.println(l.getPrice().toString());
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/view")
    public List<Library> Viewproduct(){
        return (List<Library>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/search",consumes = "application/json",produces = "application/json")
    public List<Library> Searchbook(@RequestBody Library l){
        String title=l.getTitle();
        System.out.println(title);
        return (List<Library>) dao.Searchbook((l.getTitle()));
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> deleteBook(@RequestBody Library l)
    {
        String id=String.valueOf((l.getId()));
        System.out.println(id);
        dao.deleteBook((l.getId()));
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin", consumes = "application/json", produces = "application/json")
    public List<Userregisteration> UserLogin(@RequestBody Userregisteration r) {

        return (List<Userregisteration>) dao1.userLogin(r.getUsername(),r.getPassword());

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userreg", consumes = "application/json", produces = "application/json")
    public List<Userregisteration> UserReg(@RequestBody Userregisteration u){
        return (List<Userregisteration>) dao1.userReg(u.getPassword(),u.getConfirmpass());
    }


}
