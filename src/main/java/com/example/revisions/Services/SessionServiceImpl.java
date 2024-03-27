package com.example.revisions.Services;

import com.example.revisions.Entities.Session;
import com.example.revisions.Repository.SessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SessionServiceImpl implements ISessionService {
SessionRepository sessionRepository;

    @Override
    public Session addSession(Session session) {
        return sessionRepository.save(session) ;
    }

    @Override
    public List<Session> getAllSession() {
        return (List<Session>)  sessionRepository.findAll();
    }

    @Override
    public Session getSessionById(Long idSession) {
        return sessionRepository.findById(idSession).get();
    }

    @Override
    public void deleteSession(long idSession) {
        sessionRepository.deleteById(idSession);
    }

    @Override
    public Session updateSession(Session session) {
        return sessionRepository.save(session);
    }
}
