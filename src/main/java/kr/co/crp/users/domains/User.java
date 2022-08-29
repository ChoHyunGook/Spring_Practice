package kr.co.crp.users.domains;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import kr.co.crp.users.repositories.UserRepository;
import lombok.*;
import org.junit.jupiter.api.Test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@ToString
@Setter // modelMapper 를 사용하기 위해
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
// 컴포넌트는 프로퍼티와 메소드의 집합
@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO) private long userId;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private  String name;
    @Column private  String birth;
    @Column private  String nickname;
    @Column private  String email;
    @Column private  String phone;
    @Column private String token;



    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role> roles;


}
