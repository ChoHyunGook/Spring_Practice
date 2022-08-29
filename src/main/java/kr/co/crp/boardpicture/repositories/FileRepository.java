package kr.co.crp.boardpicture.repositories;

import kr.co.crp.boardpicture.domains.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FileRepository extends JpaRepository<File,Long> {

}
