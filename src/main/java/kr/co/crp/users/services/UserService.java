package kr.co.crp.users.services;


import kr.co.crp.auth.domains.Messenger;
import kr.co.crp.users.domains.User;
import kr.co.crp.users.domains.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

public interface UserService {
    UserDTO login(UserDTO user);

    Messenger logout(HttpServletRequest request);

    List<User> findAll();
    UserDTO save1(UserDTO user) throws Exception;

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);
    Messenger count();

    void delete( UserDTO userDTO) throws Exception;
    Optional<User> findByToken(UserDTO userDTO);


    Messenger save(UserDTO user);


    User findById(Long userId);

    Messenger deleteAll();

    Messenger existsById(String username);

    Messenger getOne(Long id);

    //custom
    Messenger change(User user);

    User findByUserName(String username);

    Messenger update(User user);

    void removeUser(String userId);

    //이메일발송
    public void sendEmail(UserDTO user, String div) throws Exception;

    //비밀번호찾기
    public void findPw(HttpServletResponse resp, UserDTO user) throws Exception;


    //아이디찾기
    UserDTO find_id(UserDTO userDTO);
    //patch update
    void partialUpdate(UserDTO userDTO) throws Exception;


}
