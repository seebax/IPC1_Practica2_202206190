
package Vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author romer
 */
public class Interfaz extends JFrame{
    
    public JTextField Caja, Caja2, CajaResultado ; 
    public JButton bt0, bt1, btEntero, btSuma, btResta, btMultiplicacion, btElevado, btClean, btIgual; 

    public Interfaz() {
    componentes();
    }
   
    private void componentes(){
        JLabel tituloI = new JLabel("Calculadora");
        tituloI.setFont(new Font ("", Font.BOLD , 25 ));
        tituloI.setBounds(245, 20, 270, 25);
        tituloI.setBackground(Color.red);
        tituloI.setVisible(true);
        this.add(tituloI);
        
        //Caja de Texto
        Caja = new JTextField();
        Caja.setBounds(100, 60, 200, 35);
        this.add(Caja);    
        
        //Caja de Texto2
        Caja2 = new JTextField();
        Caja2.setBounds(315, 60, 200, 35);
        this.add(Caja2); 
        
        //Texto para Hecho .... 
        JLabel txtHecho = new JLabel("Hecho por: 202201690   Sebastian Antonio Romero Tzitzimit");
        txtHecho.setFont(new Font( "Kristen ITC", Font.BOLD, 15 ));
        txtHecho.setBounds(125, 110, 480, 20);
        this.add(txtHecho);
        
        //Boton para 0
        bt0 = new JButton("0");
        bt0.setBounds(100, 140, 50, 30);
        bt0.setVisible(true);
        bt0.setEnabled(true);
        this.add(bt0);
        
        //Boton para 1
        bt1 = new JButton("1");
        bt1.setBounds(170, 140, 50, 30);
        bt1.setVisible(true);
        bt1.setEnabled(true);
        this.add(bt1);
        
        //Boton para Convetir entero
        btEntero = new JButton("Convetir Entero");
        btEntero.setBounds(100, 220, 160, 30);
        btEntero.setVisible(true);
        btEntero.setEnabled(true);
        this.add(btEntero);
        
        //Boton para +
        btSuma = new JButton("+");
        btSuma.setBounds(450, 140, 50, 30);
        btSuma.setVisible(true);
        btSuma.setEnabled(true);
        this.add(btSuma);
        
        //Boton para -
        btResta = new JButton("-");
        btResta.setBounds(520, 140, 50, 30);
        btResta.setVisible(true);
        btResta.setEnabled(true);
        this.add(btResta);
        
        //Boton para *
        btMultiplicacion = new JButton("*");
        btMultiplicacion.setBounds(450, 210, 50, 30);
        btMultiplicacion.setVisible(true);
        btMultiplicacion.setEnabled(true);
        this.add(btMultiplicacion);
        
        //Boton para ^
        btElevado = new JButton("^");
        btElevado.setBounds(520, 210, 50, 30);
        btElevado.setVisible(true);
        btElevado.setEnabled(true);
        this.add(btElevado);
        
        //Boton para Clean
        btClean = new JButton("C");
        btClean.setBounds(450, 270, 50, 30);
        btClean.setVisible(true);
        btClean.setEnabled(true);
        this.add(btClean);
        
        //Boton para igual
        btIgual = new JButton("=");
        btIgual.setBounds(520, 270, 50, 30);
        btIgual.setVisible(true);
        btIgual.setEnabled(true);
        this.add(btIgual);
        
        //Texto para Resultado .... 
        JLabel txtResultado = new JLabel("Resultado: ");
        txtResultado.setFont(new Font( "Kristen ITC", Font.BOLD, 15 ));
        txtResultado.setBounds(100, 350, 120, 20);
        this.add(txtResultado);
        
        //Caja de Resultado
        CajaResultado  = new JTextField();
        CajaResultado .setBounds(200, 350, 100, 35);
        this.add(CajaResultado);
        
        //Venta Calculadora 
        this.setTitle("Calculadora  ECYS");
        this.setLocationRelativeTo(null);
        this.setSize(700, 500);
        setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); 
        
        
    }
}
