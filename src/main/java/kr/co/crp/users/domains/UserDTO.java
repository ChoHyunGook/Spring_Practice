package kr.co.crp.users.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Component @Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    @ApiModelProperty(position = 1) private long userId;
    @ApiModelProperty(position = 2) String username;
    @ApiModelProperty(position = 3) String password;
    @ApiModelProperty(position = 4) String name;
    @ApiModelProperty(position = 5) String birth;
    @ApiModelProperty(position = 6) String nickname;
    @ApiModelProperty(position = 7) String email;
    @ApiModelProperty(position = 8) String phone;
    @ApiModelProperty(position = 9) private String token;
    @ApiModelProperty(position = 10) private List<Role> roles;

    public User toEntity(){
        User user = User.builder().token(token).build();
        return user;
}}
