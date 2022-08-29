package kr.co.crp.boards.domains;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name="boards")
public class Board {

    @Id
    @Column(name = "board_id")
    @GeneratedValue(strategy = GenerationType.AUTO) private long boardId;
    @CreatedDate
    @Column(name = "created_date", updatable = false) private String createdDate;
    @Column private String qna;










}
