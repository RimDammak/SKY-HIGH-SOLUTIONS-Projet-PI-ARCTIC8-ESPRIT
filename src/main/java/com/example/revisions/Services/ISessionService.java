package com.example.revisions.Services;

import com.example.revisions.Entities.Session;

import java.util.List;

public interface ISessionService {
    Session addSession(Session session);

    List<Session> getAllSession();

    Session getSessionById (Long idSession );

    void deleteSession(long idSession);

    Session updateSession(Session session);
}
