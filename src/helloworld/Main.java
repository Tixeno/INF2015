/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.io.IOException;

/**
 *
 * @author Tixeno
 */
public class Main {

    public static void main(String[] args) {
        try {
            BookFile.read();
        } catch (IOException ex) {
            System.out.println("Erreur : " + ex.getLocalizedMessage());
        }
    }
}
