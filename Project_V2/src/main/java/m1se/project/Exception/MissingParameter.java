/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Exception;

/**
 *
 * @author paul-henrizimmerlin
 */
public class MissingParameter extends Exception{

    @Override
    public String getMessage() {
        return "One parameter or more is missing.";
    }
    
}
