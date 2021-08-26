package se331.lab.rest.dao;

import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface EventDao {
    Integer getEventSize();
    List<Event> getEvents(Integer pageSize, Integer page);
    Event getEvent(Long id);

    //Organizer
    Integer getOrganizSize();
    List<Organizer> getOrganizs(Integer pageSize, Integer page);
    Organizer getOrganiz(Long id);
}
