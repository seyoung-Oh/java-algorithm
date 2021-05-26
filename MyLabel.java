
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class MyLabel extends JLabel{
    int barSize=0;//���� ũ��
    int maxBarSize;
    MyLabel(int maxBarSize){
        this.maxBarSize=maxBarSize;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.magenta);
        int width =(int)(((double)(this.getWidth()))/maxBarSize*barSize);
        if(width==0) return;//ũ�Ⱑ 0�̸� �ٸ� �׸� �ʿ� ����
        g.fillRect(0,0,width,this.getHeight());
    }
    synchronized void fill(){
        if(barSize==maxBarSize){
            try{
                this.wait();//���� ũ�Ⱑ �ִ��̸�, ConsumerThread�� ���� ���� ũ�Ⱑ �پ�鶧���� ���
            }
            catch(Exception e){
                return;
            }
        }
        barSize++;
        this.repaint();//�� �ٽñ׸���
        this.notify();//��ٸ��� ConsumerThread ������ �����
    }
    synchronized void consume(){
        if(barSize==0){
            try{
                this.wait();//���� ũ�Ⱑ 0�̸� ���� ũ�Ⱑ 0���� Ŀ�������� ���
            }
            catch(Exception e){
                return;
            }
        }
        barSize--;
        this.repaint();//�� �ٽ� �׸���
        this.notify();//��ٸ��� �̺�Ʈ ������ �����
    }
}

class ConsumerThread extends Thread{
    MyLabel bar;
    ConsumerThread(MyLabel bar){
        this.bar=bar;
    }
    public void run(){
        while(true){
            try{
                sleep(200);
                bar.consume();//0.2�ʸ��� �ٸ� 1�� ���δ�.
            }
            catch(Exception e){
                return;
            }
        }
    }
}

class TabAndThreadEx extends JFrame{
    MyLabel bar = new MyLabel(100);//���� �ִ� ũ�⸦ 100���� ����
    TabAndThreadEx(){
        this.setTitle("�ƹ�Ű�� ���� ���� �� ä���");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        bar.setBackground(Color.orange);
        bar.setOpaque(true);
        bar.setLocation(20, 50);
        bar.setSize(300,20);
        this.add(bar);
        //Ű ������ ���
        this.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                bar.fill();//Ű�� ���������� �ٰ� 1�� ����
            }

            @Override
            public void keyReleased(KeyEvent ke) {
            }
            
        });
        this.setLocationRelativeTo(null);
        this.setSize(350,200);
        this.setVisible(true);
        this.requestFocus();//Ű ó���� �ο�
        ConsumerThread th = new ConsumerThread(bar);//������ ����
        th.start();//������ ����
    }
    public static void main(String[] args) {
        new TabAndThreadEx();
    }
}


