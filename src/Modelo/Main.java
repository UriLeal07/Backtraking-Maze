package Modelo;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import Vista.FramePrincipal;

public class Main
{
    private static FramePrincipal app;
    
    public static void main(String[] args) throws FileNotFoundException
    {
        try
        {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels = javax.swing.UIManager.getInstalledLookAndFeels();
            int idx;
            
            for(idx = 0; idx < installedLookAndFeels.length; idx++)
                if("Nimbus".equals(installedLookAndFeels[idx].getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar Look and Feel", "Error de Tema", JOptionPane.ERROR_MESSAGE);
        }
        
        app = new FramePrincipal();
        app.setVisible(true);
        app.setLocation(300, 100);
        app.setDefaultCloseOperation(FramePrincipal.EXIT_ON_CLOSE);
    }
}