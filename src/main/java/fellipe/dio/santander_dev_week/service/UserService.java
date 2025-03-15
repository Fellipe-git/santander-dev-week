package fellipe.dio.santander_dev_week.service;

import fellipe.dio.santander_dev_week.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);


}
