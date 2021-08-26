package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.EventDao;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;

@Service
public class EventServiceImpl implements EventService{
    @Autowired
    EventDao eventDao;
    @Override
    public Integer getEventSize() {
        return eventDao.getEventSize();
    }

    @Override
    public List<Event> getEvents(Integer pageSize, Integer page) {
        return eventDao.getEvents(pageSize, page);
    }

    @Override
    public Event getEvent(Long id) {
        return eventDao.getEvent(id);
    }

    //Organizer
    @Override
    public Integer getOrganizSize() {
        return eventDao.getOrganizSize();
    }

    @Override
    public List<Organizer> getOrganizs(Integer pageSize, Integer page) {
        return eventDao.getOrganizs(pageSize, page);
    }

    @Override
    public Organizer getOrganiz(Long id) {
        return eventDao.getOrganiz(id);
    }
}
