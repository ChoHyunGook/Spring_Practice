package kr.co.crp.boards.services;

import kr.co.crp.boards.domains.Board;
import kr.co.crp.boards.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repository;
    @Override
    public List<Board> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public String delete(Board board) {
        repository.delete(board);
        return "";
    }

    @Override
    public String save(Board board) {
        repository.save(board);
        return "";
    }

    @Override
    public Optional<Board> findById(String board) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String board) {
        return repository.existsById(0L);
    }
}
