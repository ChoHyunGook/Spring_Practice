package kr.co.crp.boardpicture.domains;

import lombok.*;


@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FileDTO {
    private Long id;
    private String origFilename;
    private String filename;
    private String filePath;


    public File toEntity() {
        File build = File.builder()
                .id(id)
                .origFilename(origFilename)
                .filename(filename)
                .filePath(filePath)
                .build();
        return build;
    }

}
