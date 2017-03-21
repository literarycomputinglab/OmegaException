/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.ilc.lc.omega.exception;

/**
 *
 * @author simone
 */
public class AnnotationAlreadyExistsException extends RuntimeException{

    public AnnotationAlreadyExistsException() {
    }

    public AnnotationAlreadyExistsException(String message) {
        super(message);
    }

    public AnnotationAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public AnnotationAlreadyExistsException(Throwable cause) {
        super(cause);
    }

    public AnnotationAlreadyExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
        
}
