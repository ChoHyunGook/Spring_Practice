package kr.co.crp.users.repositories;

import kr.co.crp.users.domains.User;
import kr.co.crp.users.domains.UserDTO;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;



interface UserCustomRepository{
    // 000. 사용자의 비밀번호를 수정하시오
    @Query(value = "select u.username from User u")
    public String [] selectAllJPQL();

    @Query("SELECT u.username FROM User u WHERE u.name= :name AND u.email= :email")
    public String find_id(@Param("name") String name, @Param("email") String email);

  /*  @Query("select u.username from User u where u.name= :name and u.email= :email")
    public String findUser(@Param("name") String name, @Param("email") String email);*/
}

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserCustomRepository{
    Optional<User> findByUsername(String username);
    Optional<User> findByToken(String token);
    boolean existsByPhone(String phone);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    boolean existsByNickname(String nickname);

}

