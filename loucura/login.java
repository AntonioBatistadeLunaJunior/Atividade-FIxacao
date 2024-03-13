
package loucura;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class login extends JFrame {
    
    private JButton cadastrar;
    private JPasswordField senha;
    private JTextField usuario;
    private JLabel magem;
    
    public login () {
    
        super ("Faça seu Login");
        setLayout(new FlowLayout());
        
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("pog.jfif"));
        magem = new JLabel (imageIcon);
        add(magem);
        

        usuario = new JTextField("Usuario");
        usuario.setEditable(true);
        add(usuario);

        senha = new JPasswordField("", 20);
        add(senha);

        cadastrar = new JButton("cadastar");
        add(cadastrar);
        
        Handler handler = new Handler();
        usuario.addActionListener(handler);
        senha.addActionListener(handler);
        cadastrar.addActionListener(handler);
        
    }
    
    private class Handler implements ActionListener{
        
        
        public void actionPerformed(ActionEvent event){
            
            
            String aparece = "";
            if(event.getSource() == cadastrar){
                String senhaT = String.valueOf(senha.getPassword());
                aparece = String.format("Oi %S sua senha é %S", usuario.getText(), senhaT);
                
                
                
                
            }
            JOptionPane.showMessageDialog(null, aparece);

            
        }
    }
}


