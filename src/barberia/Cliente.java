/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.Timer;

/**
 *
 * @author connec
 */
public class Cliente {
    static Queue<Integer> ClientesLibres = new LinkedList<>();
    static int clientID = 0;
    static Timer timer = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (clientID!=0) {
            siguienteCliente();
            }
        }
    });

    static void eliminarCliente() {
        if (clientID==0) {
            System.out.println("No hay clientes " );
        } else {
            clientID--;
            ClientesLibres.remove(clientID);
            System.out.println("Elimino al cliente .Clientes restantes"+clientID);
            
        }
    }

    static void nuevoCliente() {
            clientID++;
            System.out.println("Cliente agregado " + clientID );
            ClientesLibres.add(clientID);
    }
    
    static int siguienteCliente() {
        for(int i=1;i<=Barbero.barberID;i++){
                if (clientID!=0) {
                    System.out.println("Barbero atendiendo al cliente "+ clientID );
                    ClientesLibres.remove();
                    clientID--;
                    System.out.println("atendido por barbero "+ i );
                }   
        }
        timer.start();
        
        return clientID;
    }
}