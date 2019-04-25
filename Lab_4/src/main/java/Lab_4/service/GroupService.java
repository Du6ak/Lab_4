package Lab_4.service;

import Lab_4.entity.Group;

public interface GroupService extends Service<Group> {

    Group readByName(String name);

}
