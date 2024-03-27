package com.example.revisions.Controller;

import com.example.revisions.Entities.Session;
import com.example.revisions.Services.ISessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/session")
public class SessionRestController {
    ISessionService sessionService;
    @GetMapping("/retrieve-all-sessions")
    public List<Session>getSession(){
        List<Session> sessionList= sessionService.getAllSession();
        return sessionList;
    }
    @GetMapping("/retrieve-session/{session-id}")
    public Session getSessionByid(@PathVariable("session-id")
       Long chID                           ){
        Session session =sessionService.getSessionById(chID);
        return  session;
    }
    @PostMapping("/add-bloc")
    public Session addSession(@RequestBody Session s)
    {
        Session session = sessionService.addSession(s);
        return  session;
    }
    @DeleteMapping("/remove-session/{session-id}")

    public void delSession(@PathVariable("session-id")
          Long delID){
        sessionService.deleteSession(delID);


    }
    @PutMapping("/update-session")
    public Session upSession(@RequestBody Session s){
        Session session =sessionService.updateSession(s);
        return session;
    }
}
