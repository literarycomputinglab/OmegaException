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
public class VirtualResourceSystemException extends Exception {

    public VirtualResourceSystemException() {
    }

    public VirtualResourceSystemException(String message) {
        super(message);
    }

    public VirtualResourceSystemException(String message, Throwable cause) {
        super(message, cause);
    }

    public VirtualResourceSystemException(Throwable cause) {
        super(cause);
    }

    public VirtualResourceSystemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
