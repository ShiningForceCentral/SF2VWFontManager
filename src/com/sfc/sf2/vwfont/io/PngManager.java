/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sfc.sf2.vwfont.io;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wiz
 */
public class PngManager {
    
    private static String CHARACTER_FILENAME = "characterXX.bin";
    
    public static byte[][] importPng(String filepath){
        byte[][] vwfontChars = new byte[0][];

        return vwfontChars;                
    }
    
    public static void exportPng(byte[][] vwfontChars, String filepath){
        try {
            System.out.println("com.sfc.sf2.vwfont.io.PngManager.exportTxt() - Exporting TXT ...");

            System.out.println("com.sfc.sf2.vwfont.io.PngManager.exportTxt() - TXT exported.");
        } catch (Exception ex) {
            Logger.getLogger(PngManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
    }        
    
}
