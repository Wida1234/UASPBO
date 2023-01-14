import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[]args){
        JFrame window = new JFrame("Data Pengemudi");
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new FlowLayout());

        JButton button = new JButton("Tampilkan Data");
        window.add(button);

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Kendaraan Kendaraan = new Kendaraan("beat", 1933) {
                    @Override
                    public void getInfo() {

                    }
                };
                Kendaraan.getInfo();
                Pengemudi Pengemudi = new Pengemudi("WIDA" , 19);
                Pengemudi.setKendaraan(Kendaraan);

                System.out.println("merek :" + Pengemudi.getMerek());
                System.out.println("usia :" + Pengemudi.getUsia());
                System.out.println("PlatNomor :" + Pengemudi.getKendaraan().platnomer);
            }
        });

        window.setVisible(true);
    }
}