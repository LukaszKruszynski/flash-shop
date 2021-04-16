package com.shop.service.group;

import com.shop.model.group.Group;
import com.shop.repository.group.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupService {
    private final GroupRepository repository;

    public Group saveGroup(Group group) {
        return repository.save(group);
    }
    public void deleteGroup(Group group) {
        repository.delete(group);
    }
}
