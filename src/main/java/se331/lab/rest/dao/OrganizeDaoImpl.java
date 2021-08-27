package se331.lab.rest.dao;

import org.springframework.stereotype.Service;
import se331.lab.rest.entity.Organizer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrganizeDaoImpl implements OrganizeDao{
    List<Organizer> organizerList;

    @PostConstruct
    public void  init(){

        //Organizer
        organizerList = new ArrayList<>();
        organizerList.add(Organizer.builder()
                .id(123L)
                .name("MMO")
                .address("What do you want.")
                .build());
        organizerList.add(Organizer.builder()
                .id(456L)
                .name("RPG")
                .address("What you want to do?")
                .build());
        organizerList.add(Organizer.builder()
                .id(789L)
                .name("GAP")
                .address("want What you do.")
                .build());
        organizerList.add(Organizer.builder()
                .id(1011L)
                .name("CAT")
                .address("do What you want.")
                .build());
        organizerList.add(Organizer.builder()
                .id(1213L)
                .name("BAG")
                .address("you want do What.")
                .build());
        organizerList.add(Organizer.builder()
                .id(1415L)
                .name("GAD")
                .address("What want do you ")
                .build());
    }

    //Organizer
    @Override
    public Integer getOrganizSize() {
        return organizerList.size();
    }

    @Override
    public List<Organizer> getOrganizs(Integer pageSize, Integer page) {
        pageSize = pageSize == null ? organizerList.size() : pageSize;
        page = page == null ? 1 : page;
        int firstIndex = (page - 1) * pageSize;
        return organizerList.subList(firstIndex, firstIndex + pageSize);
    }

    @Override
    public Organizer getOrganiz(Long id) {
        return organizerList.stream().filter(event -> event.getId().equals(id)).findFirst().orElse(null);
    }
}
