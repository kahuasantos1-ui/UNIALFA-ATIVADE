package Modelo;

import javax.swing.JFrame;

public class BaseView extends JFrame {
    public BaseView() {
        // Configurações padrão
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Garante que após initComponents e pack, a tela abra maximizada
        this.addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {
                setExtendedState(MAXIMIZED_BOTH);
                setLocationRelativeTo(null);
            }
        });
    }
}
