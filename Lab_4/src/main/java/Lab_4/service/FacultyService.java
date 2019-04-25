package Lab_4.service.impl;

import Lab_4.entity.Faculty;

public interface FacultyService extends Service<Faculty> {

    Faculty readByName(String name);

    Faculty readByphone(String name);

}
