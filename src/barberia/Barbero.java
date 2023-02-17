/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package barberia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import javax.swing.Timer;
/**
 *
 * @author connec
 */

class Barbero {
    static Queue<Integer> BarberosLibres = new LinkedList<>();
    static int barberID = 0;

    static Timer timer = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (Cliente.clientID!=0) {
            Cliente.siguienteCliente();
            }
        }
    });

    static void eliminarBarbero() {
        if (barberID==0) {
            System.out.println("No hay barberos " );
        } else {
            BarberosLibres.remove(barberID);
            barberID--;
            System.out.println("Elimino al barbero .Barberos restantes"+barberID);
        }
    }

    static void nuevoBarbero() {
            barberID++;
            System.out.println("Barbero agregado " + barberID );
            BarberosLibres.add(barberID);
            timer.start();
    }
}
