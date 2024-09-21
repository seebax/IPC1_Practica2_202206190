
package Controles;

import Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 *
 * @author romer
 */
public class Controlador implements ActionListener, FocusListener{
    private Interfaz interfaz;
    
    public static String nb1, nb2, n;
    public static int n1, n2, resultado;

    public Controlador(Interfaz interfaz) {
        this.interfaz = interfaz;
        this.interfaz.setVisible(true);
        this.interfaz.Caja.addFocusListener(this);
        this.interfaz.Caja2.addFocusListener(this);
        this.interfaz.bt0.addActionListener(this);
        this.interfaz.bt1.addActionListener(this);
        this.interfaz.btEntero.addActionListener(this);
        this.interfaz.btSuma.addActionListener(this);
        this.interfaz.btResta.addActionListener(this);
        this.interfaz.btMultiplicacion.addActionListener(this);
        this.interfaz.btElevado.addActionListener(this);
        this.interfaz.btClean.addActionListener(this);
        this.interfaz.btIgual.addActionListener(this);
        this.interfaz.CajaResultado.addFocusListener(this);
        
    }

    
        private String BinarioADecimal(String numeroBinario) {
        int numeroDecimal = Integer.parseInt(numeroBinario, 2); // Conversión de binario a decimal
//        this.interfaz.CajaResultado.setText(String.valueOf(numeroDecimal));
        return(String.valueOf(numeroDecimal));
    }
        private void DecimalBinario(String numeroDecimal){
            
            String binario = Integer.toBinaryString(Integer.parseInt(numeroDecimal));
            this.interfaz.CajaResultado.setText(binario);
        }
        private void BotonConv(String numeroBinario) {
        int numeroDecimal = Integer.parseInt(numeroBinario, 2); // Conversión de binario a decimal
        this.interfaz.CajaResultado.setText(String.valueOf(numeroDecimal));
        }
        private void Resultado(){
        
        }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.interfaz.btEntero) {
            nb1 = this.interfaz.CajaResultado.getText();
            BinarioADecimal(nb1);
        }if(ae.getSource() == this.interfaz.btSuma){
            nb1= this.interfaz.Caja.getText();
            nb2 = this.interfaz.Caja2.getText();
            System.out.println(nb1 +"------"+nb2);
            n1 = Integer.parseInt(BinarioADecimal(nb1));
            n2 = Integer.parseInt(BinarioADecimal(nb2));
            resultado = n1 + n2;
            DecimalBinario(String.valueOf(resultado));
        }
        if(ae.getSource() == this.interfaz.btResta){
            nb1= this.interfaz.Caja.getText();
            nb2 = this.interfaz.Caja2.getText();
            System.out.println(nb1 +"------"+nb2);
            n1 = Integer.parseInt(BinarioADecimal(nb1));
            n2 = Integer.parseInt(BinarioADecimal(nb2));
            resultado = n1 - n2;
            DecimalBinario(String.valueOf(resultado));
        }
        if(ae.getSource() == this.interfaz.btMultiplicacion){
            nb1= this.interfaz.Caja.getText();
            nb2 = this.interfaz.Caja2.getText();
            System.out.println(nb1 +"------"+nb2);
            n1 = Integer.parseInt(BinarioADecimal(nb1));
            n2 = Integer.parseInt(BinarioADecimal(nb2));
            resultado = n1 * n2;
            DecimalBinario(String.valueOf(resultado));
        }if(ae.getSource() == this.interfaz.btElevado){
            nb1= this.interfaz.Caja.getText();
            nb2 = this.interfaz.Caja2.getText();
            System.out.println(nb1 +"------"+nb2);
            n1 = Integer.parseInt(BinarioADecimal(nb1));
            n2 = Integer.parseInt(BinarioADecimal(nb2));
            double nd1 = n1;
            double nd2 = n2;
            double result;
            result = Math.pow(nd1, nd2);
            resultado = (int)result;
            DecimalBinario(String.valueOf(resultado));
        }
        if(ae.getSource() == this.interfaz.btClean){
            this.interfaz.Caja.setText("");
            this.interfaz.Caja2.setText("");
        }if(ae.getSource() == this.interfaz.btEntero){
            n = this.interfaz.CajaResultado.getText();
            BotonConv(n);
        }if(ae.getSource() == this.interfaz.bt0){
             this.interfaz.Caja.setText("0");
            
        }
        if(ae.getSource() == this.interfaz.bt1){
             this.interfaz.Caja.setText("1");
            
        }
        
    }
    
    public void focusGained(FocusEvent e) {
    }

    @Override
    public void focusLost(FocusEvent e) {
    }


    /**
     * @return the interfaz
     */
    public Interfaz getInterfaz() {
        return interfaz;
    }

    /**
     * @param interfaz the interfaz to set
     */
    public void setInterfaz(Interfaz interfaz) {
        this.interfaz = interfaz;
    }
    
    
    
}
