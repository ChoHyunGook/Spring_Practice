package kr.co.crp.auth.services;

import kr.co.crp.users.domains.User;
import kr.co.crp.users.repositories.UserRepository;
import kr.co.crp.auth.domains.Auth;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * packageName:kr.co.clozet.security.domains
 * fileName        :UserDetailsServiceImpl.java
 * author          : kimyunseop
 * date            :2022-05-23
 * desc            : 회원가입할때
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23           kimyunseop      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements UserDetailsService {

    private final UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = Optional.ofNullable(repository.findByUsername(username))
                .orElseThrow(() -> new UsernameNotFoundException(username+"에 해당하는 객체가 존재하지 않습니다."));
        return Auth.build(user.get());
    }
}
