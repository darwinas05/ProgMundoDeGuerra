/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import javax.swing.JFileChooser;

/**
 *
 * @author darwi
 */
public class FileChooserHandler {

    public void showFileChooser() {
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setDialogTitle("Selecciona tu fichero.");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {

            System.out.println(fileChooser.getSelectedFile().getAbsolutePath());

        }
    }

}
