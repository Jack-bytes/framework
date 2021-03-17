package cn.com.lezz.configuration.common;

import cn.com.lezz.configuration.common.exception.ProjectException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProjectException.class)
    public JsonResult<Void> ProjectExceptionHandler(ProjectException e) {
        return new JsonResult<>(e);
    }
}
