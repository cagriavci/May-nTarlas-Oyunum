package mayintarlasi;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import sun.awt.RepaintArea;


public class anaEkran extends mayinTarlasiOyunu{
    protected int kareSayisi=10;
    protected int mayin=10;
    JFrame frm=new JFrame("     MAYIN TARLAM        ");
    public static void main(String [] args){
       
        anaEkran al=new anaEkran();
        al.ilkFrame();        
        
   }
   public void ilkFrame(){
    
      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
      frm.setSize(650,450);
      frm.setLocation(100,100);
      frm.setVisible(false);
      JMenuBar menuBar=new JMenuBar();
      menuBar.setSize(500,100);
      oyunMenubar(menuBar);
      frm.setJMenuBar(menuBar);
      frm.repaint();
      frm.revalidate();
   }
   

  public void oyunMenubar(JMenuBar menuBar){
   
        JMenu dosya=new JMenu("SECENEKLER");
        menuBar.add(dosya);
        JMenuItem yeniOyun=new JMenuItem("YENİ OYUN");
        dosya.add(yeniOyun);
        JMenuItem baslangic=new JMenuItem("ÇAYLAK MOD ");
        dosya.add(baslangic);
        JMenuItem orta=new JMenuItem("DENEYİMLİ MOD");
        dosya.add(orta);
        JMenuItem zor=new JMenuItem("PROFESYONEL MOD");
        dosya.add(zor);
        JMenuItem cikis=new JMenuItem("KAÇMAK İSTİYORUM!");
        dosya.add(cikis);
        
        cikis.addActionListener(new ActionListener() {
          
            
             public void actionPerformed(ActionEvent e) {
               System.exit(0);                      
                  }
            }); 
        
        yeniOyun.addActionListener(new ActionListener() {
            
           
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                 
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("YENI OYUN");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
                frm.setSize(200,100);
                frm.setLocation(300,100); 
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);
                al.frm=frm;
                  }
            }); 
            
        
        baslangic.addActionListener(new ActionListener() {
           
            @Override
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("SECENEKLER");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(10,12).getContent());
                frm.setSize(400,200);
                frm.setLocation(300,100);
                frm.setVisible(true);
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar); 
                al.frm=frm;
                  }
            }); 
        
        orta.addActionListener(new ActionListener() {
           
           
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("YENI OYUN");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(15,25).getContent());
                frm.setSize(400,400);
                frm.setLocation(300,50);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);  
                al.frm=frm;
                  }
            }); 
        
        zor.addActionListener(new ActionListener() {
           
        
             public void actionPerformed(ActionEvent e) {
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.setVisible(false);
                anaEkran al=new anaEkran();
                JFrame frm=new JFrame("YENI OYUN");
                frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frm.getContentPane().add(new mayinYerlestirme(20,60).getContent());
                frm.setSize(1070,650);
                frm.setLocation(200,30);
                frm.setVisible(true);  
                JMenuBar menuBar=new JMenuBar();
                frm.setJMenuBar(menuBar);
                al.oyunMenubar(menuBar);   
                al.frm=frm;
                  }
            }); 
  }
    
  
  
}