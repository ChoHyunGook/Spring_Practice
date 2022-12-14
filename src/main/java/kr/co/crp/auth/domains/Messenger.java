package kr.co.crp.auth.domains;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName:kr.co.clozet.security.domains
 * fileName        :Messenger.java
 * author          : kimyunseop
 * date            :2022-05-23
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-23           kimyunseop      최초 생성
 **/
@Getter @Builder
public class Messenger {
    private String message, code;
    private int status;
}
