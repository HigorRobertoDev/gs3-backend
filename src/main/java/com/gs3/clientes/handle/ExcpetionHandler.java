package com.gs3.clientes.handle;

import com.gs3.clientes.dto.RetornoErroDTO;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.AuthenticationException;
import javax.ws.rs.NotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@ControllerAdvice
public class ExcpetionHandler {

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<RetornoErroDTO> notFound(NotFoundException e) {
        return new ResponseEntity<>(new RetornoErroDTO(HttpStatus.NOT_FOUND.value(), e.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = DuplicateKeyException.class)
    public ResponseEntity<RetornoErroDTO> notFound(DuplicateKeyException e) {
        return new ResponseEntity<>(new RetornoErroDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage()), HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<RetornoErroDTO> notFound(MethodArgumentNotValidException e) {
        List<String> erroList = e.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
        return new ResponseEntity<>(new RetornoErroDTO(HttpStatus.BAD_REQUEST.value(), erroList), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = AuthenticationException.class)
    public ResponseEntity<RetornoErroDTO> notFound(AuthenticationException e) {
        return new ResponseEntity<>(new RetornoErroDTO(HttpStatus.BAD_REQUEST.value(), e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<RetornoErroDTO> notFound(RuntimeException e) {
        return new ResponseEntity<>(new RetornoErroDTO(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
