package se331.lab.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.OrganizeDao;
import se331.lab.rest.entity.Organizer;

import java.util.List;
@Service
public class OrganizeServiceImpl implements OrganizeService{

    @Autowired
    OrganizeDao organizeDao;
    //Organizer
    @Override
    public Integer getOrganizSize() {
        return organizeDao.getOrganizSize();
    }

    @Override
    public List<Organizer> getOrganizs(Integer pageSize, Integer page) {
        return organizeDao.getOrganizs(pageSize, page);
    }

    @Override
    public Organizer getOrganiz(Long id) {
        return organizeDao.getOrganiz(id);
    }
}
