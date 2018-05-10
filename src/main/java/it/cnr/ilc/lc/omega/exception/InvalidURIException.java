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
public class InvalidURIException extends RuntimeException {

    public InvalidURIException() {
    }

    public InvalidURIException(String message) {
        super(message);
    }

    public InvalidURIException(Throwable cause) {
        super(cause);
    }

    public InvalidURIException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidURIException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
