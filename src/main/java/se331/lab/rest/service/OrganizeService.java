package se331.lab.rest.service;

import se331.lab.rest.entity.Organizer;

import java.util.List;

public interface OrganizeService {
    //Organizer
    Integer getOrganizSize();
    List<Organizer> getOrganizs(Integer pageSize, Integer page);
    Organizer getOrganiz(Long id);
}
