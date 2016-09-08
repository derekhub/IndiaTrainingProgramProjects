package com.training.randomstuff;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private ModelAndView mdl;

    @ExceptionHandler(DuplicateKeyException.class)
    public ModelAndView globalHandler(HttpServletRequest req, Exception ex) {

        mdl.addObject("message", "Primary Key already exists");
        mdl.addObject("exceptionClass", ex.getClass());
        mdl.addObject("requestURI", req.getRequestURI());
        mdl.setViewName("error");
        return mdl;
    }

}
