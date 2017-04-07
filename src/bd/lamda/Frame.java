package bd.lamda;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame(){
        this.setSize(new Dimension(500,350));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    protected float Area(float edge1 , float edge2, Transactions area){
        return area.AreaProc(edge1, edge2);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        float square_a = Area(40,40,(edge1, edge2) -> edge1 * edge2 );
        float sphere_a = Area(50,50,((edge1, edge2) -> (float)(4 * Math.PI *Math.pow(25,2))));
        g.fillOval(10,10,50,50);
        g.drawRect(100,10,40,40);
        g.drawString(String.valueOf(sphere_a),10,80);
        g.drawString(String.valueOf(square_a),100,80);
    }
}
