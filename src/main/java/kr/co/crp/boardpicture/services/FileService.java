package kr.co.crp.boardpicture.services;

import kr.co.crp.boardpicture.domains.File;
import kr.co.crp.boardpicture.domains.FileDTO;
import kr.co.crp.boardpicture.repositories.FileRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class FileService {
    private final FileRepository fileRepository;

    @Transactional
    public Long saveFile(FileDTO fileDto) {
        return fileRepository.save(fileDto.toEntity()).getId();
    }

    @Transactional
    public FileDTO getFile(Long id) {
        File file = fileRepository.findById(id).get();

        FileDTO fileDto = FileDTO.builder()
                .id(id)
                .origFilename(file.getOrigFilename())
                .filename(file.getFilename())
                .filePath(file.getFilePath())
                .build();
        return fileDto;
    }
}
