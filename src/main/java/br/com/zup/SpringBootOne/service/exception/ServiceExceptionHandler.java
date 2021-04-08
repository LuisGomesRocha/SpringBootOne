package br.com.zup.SpringBootOne.service.exception;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ServiceExceptionHandler {
	
	@ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<StandardError> validation(DataIntegrityViolationException e, HttpServletRequest request) {
    	
    	List <String> msgs = new ArrayList<>();
    	
    	msgs.add("Um campo único já existe no banco de dados!");
 
    	
        StandardError err = new StandardError(HttpStatus.CONFLICT.value(), msgs, System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.CONFLICT).body(err);
    }
    
 
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> validation(MethodArgumentNotValidException e, HttpServletRequest request) {
    	
    	List <String> msgs = new ArrayList<>();
    	
    	for (FieldError x : e.getBindingResult().getFieldErrors()) {
            msgs.add(x.getDefaultMessage());            
    		
        }
    	
        StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), msgs, System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }
    
    
    
    
}
    
    
