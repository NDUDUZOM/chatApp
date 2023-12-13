package example.com.DumaApp.repository;

import example.com.DumaApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRep extends JpaRepository<User,Long>
{

    Optional<User> findByContact(String contact);
}
