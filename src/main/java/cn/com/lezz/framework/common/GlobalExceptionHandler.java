package cn.com.lezz.framework.common;

import cn.com.lezz.framework.common.exception.ProjectException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProjectException.class)
    public JsonResult<Void> ProjectExceptionHandler(ProjectException e) {
        return new JsonResult<>(e);
    }
}
