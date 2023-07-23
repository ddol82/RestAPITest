package com.example.homework.common.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

/**
 * Data에 {@link HttpStatus HTTP응답}과 관련된 내용을 추가합니다.
 *
 * @since 1.0
 * @version 1.0
 * @author JinNyeongLee
 */

@Getter
@Setter
@ToString
public class ResponseDTO {
    private int status;
    private String detail;
    private String message;
    private Object data;
    public ResponseDTO(HttpStatus httpStatus, String message, Object data) {
        this.status = httpStatus.value();
        this.detail = httpStatus.getReasonPhrase();
        this.message = message;
        this.data = data;
    }
}
