package kr.co.crp.boards.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;


@Component @Data
public class BoardDTO {
    @ApiModelProperty(position = 1) private long boardId;
    @ApiModelProperty(position = 8) private String createdDate;
    @ApiModelProperty(position = 12) private String qna;
}
