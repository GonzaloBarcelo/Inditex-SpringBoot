package com.inditex.inditex;

import com.inditex.inditex.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    private ArrayList<User> users= new ArrayList<>();
    @GetMapping("/userControler")
    public String getUsers(){
        String s="";
        for (User a:users){
            s=s+"  ->   ";
            s=s+a.toString();
        }
        return "Los usuarios que figuran son:"+s;
    }

    @PostMapping("/userControler")
    public ResponseEntity<String> postInfo(@RequestBody User user){
        //return ResponseEntity.ok().body(user);
        if(isInUsers(user)){
            return ResponseEntity.ok().body("duplicado");
        }
        else{
            users.add(user);
            return ResponseEntity.accepted().body("creado");
        }

    }

    public boolean isInUsers(User user){
        for(User a:users){
            if(a.equals(user)){
                return true;
            }
        }
        return false;
    }

}
