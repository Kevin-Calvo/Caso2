package gui;

import java.util.List;

import javax.swing.*;

import objetos.Aerogenerador;  
import objetos.RedEnergiaNacional; 
public class table {    
    JFrame f;    
    table(List<Aerogenerador> generadores, RedEnergiaNacional red){    
    f=new JFrame();    
    String data[][]={ 
    		{"Tejona",generadores.get(0).getEstado(), generadores.get(0).getVelocidad(),  String.valueOf(generadores.get(0).getAngulo()) ,String.valueOf(generadores.get(0).getPotenciaGenerada())},        
                          {"Valle Cental",generadores.get(1).getEstado(),generadores.get(1).getVelocidad(),String.valueOf(generadores.get(1).getAngulo()),String.valueOf(generadores.get(1).getPotenciaGenerada())},     
                          {"CoopeSantos",generadores.get(2).getEstado(),generadores.get(2).getVelocidad(),String.valueOf(generadores.get(2).getAngulo()),String.valueOf(generadores.get(2).getPotenciaGenerada())},
                          {"Plantas Eolicas S.A.", generadores.get(3).getEstado(),generadores.get(3).getVelocidad(),String.valueOf(generadores.get(3).getAngulo()),String.valueOf(generadores.get(3).getPotenciaGenerada())},
                          {"Aeroenergia", generadores.get(4).getEstado(),generadores.get(4).getVelocidad(),String.valueOf(generadores.get(4).getAngulo()),String.valueOf(generadores.get(4).getPotenciaGenerada())},
                          {"Tilawind", generadores.get(5).getEstado(),generadores.get(5).getVelocidad(),String.valueOf(generadores.get(5).getAngulo()),String.valueOf(generadores.get(5).getPotenciaGenerada())},
                          {"MOVASA", generadores.get(6).getEstado(),generadores.get(6).getVelocidad(),String.valueOf(generadores.get(6).getAngulo()),String.valueOf(generadores.get(6).getPotenciaGenerada())},
                          {"Vientos del este", generadores.get(7).getEstado(),generadores.get(7).getVelocidad(),String.valueOf(generadores.get(7).getAngulo()),String.valueOf(generadores.get(7).getPotenciaGenerada())},
                          {"Mogote", generadores.get(8).getEstado(),generadores.get(8).getVelocidad(),String.valueOf(generadores.get(8).getAngulo()),String.valueOf(generadores.get(8).getPotenciaGenerada())},
                          {"Altamira", generadores.get(9).getEstado(),generadores.get(9).getVelocidad(),String.valueOf(generadores.get(9).getAngulo()),String.valueOf(generadores.get(9).getPotenciaGenerada())},
                          {"Campos Azules", generadores.get(10).getEstado(),generadores.get(10).getVelocidad(),String.valueOf(generadores.get(10).getAngulo()),String.valueOf(generadores.get(10).getPotenciaGenerada())},
                          {"Vientos de Miramar", generadores.get(11).getEstado(),generadores.get(11).getVelocidad(),String.valueOf(generadores.get(11).getAngulo()),String.valueOf(generadores.get(11).getPotenciaGenerada())},
                          {"Vientos de La Perla", generadores.get(12).getEstado(),generadores.get(12).getVelocidad(),String.valueOf(generadores.get(12).getAngulo()),String.valueOf(generadores.get(12).getPotenciaGenerada())},
                          {"PE Guanacaste", generadores.get(13).getEstado(),generadores.get(13).getVelocidad(),String.valueOf(generadores.get(13).getAngulo()),String.valueOf(generadores.get(13).getPotenciaGenerada())},
                          {"Chiripa", generadores.get(14).getEstado(),generadores.get(14).getVelocidad(),String.valueOf(generadores.get(14).getAngulo()),String.valueOf(generadores.get(14).getPotenciaGenerada())},
                          {"Orosi", generadores.get(15).getEstado(),generadores.get(15).getVelocidad(),String.valueOf(generadores.get(15).getAngulo()),String.valueOf(generadores.get(15).getPotenciaGenerada())},
                          {"Cacao", generadores.get(16).getEstado(),generadores.get(16).getVelocidad(),String.valueOf(generadores.get(16).getAngulo()),String.valueOf(generadores.get(16).getPotenciaGenerada())},
                          {"Rio Naranjo", generadores.get(17).getEstado(),generadores.get(17).getVelocidad(),String.valueOf(generadores.get(17).getAngulo()),String.valueOf(generadores.get(17).getPotenciaGenerada())},
                          {"Total"," ",  "", "", String.valueOf(red.getEnergiaEnRed())} 
                          };   
    
    String column[]={"Aerogenerador", "Estado", "Velocidad", "Angulo", "Produccion"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,1000,300);          
    JScrollPane sp=new JScrollPane(jt); 
    f.setTitle("Estado de Aerogeneradores");
    f.add(sp);          
    f.setSize(1000,380);    
    f.setVisible(true);    
    }
}
