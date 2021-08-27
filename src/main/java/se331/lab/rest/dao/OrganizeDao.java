package se331.lab.rest.dao;

import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface OrganizeDao {
    //Organizer
    Integer getOrganizSize();
    List<Organizer> getOrganizs(Integer pageSize, Integer page);
    Organizer getOrganiz(Long id);
}
