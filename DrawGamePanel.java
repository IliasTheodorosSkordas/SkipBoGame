
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;

/**
 *
 * @author EliasTheodore
 */
public class DrawGamePanel extends JPanel implements MouseListener {

    Graphics g;
    public static int counter = 0;
    public int x = 0;
    public int y = 0;
    public int x1 = 0, x2 = 0;
    public int y1 = 0, y2 = 0;
    public static ArrayList<Card> Allcards = new ArrayList<>();
    public static ArrayList<Card> Drawpile = new ArrayList<>();

    public ArrayList<Card> buildingpile1 = new ArrayList<>();
    public ArrayList<Card> buildingpile2 = new ArrayList<>();
    public ArrayList<Card> buildingpile3 = new ArrayList<>();
    public ArrayList<Card> buildingpile4 = new ArrayList<>();

    public ArrayList<Card> discardpile1 = new ArrayList<>();
    public ArrayList<Card> discardpile2 = new ArrayList<>();
    public ArrayList<Card> discardpile3 = new ArrayList<>();
    public ArrayList<Card> discardpile4 = new ArrayList<>();

    public DrawGamePanel() {
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {

//        player1 hand collection
        g.drawString(Game.name1, 60, 100);
        g.drawString(Game.name2, 60, 690);
//        panw trigwnakia1
        int[] a = {200, 270, 200};
        int[] b = {80, 50, 50};
        g.draw3DRect(200, 50, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(a, b, 3);
        g.fillPolygon(a, b, 3);
        g.setColor(Color.black);

        int[] k = {200, 270, 270};
        int[] l = {150, 150, 120};
        g.setColor(Color.red);
        g.drawPolygon(k, l, 3);
        g.fillPolygon(k, l, 3);
        g.setColor(Color.black);
        //1

        int[] c = {300, 370, 300};
        int[] d = {80, 50, 50};
        g.draw3DRect(300, 50, 70, 100, true);
        g.setColor(Color.green);
        g.drawPolygon(c, d, 3);
        g.fillPolygon(c, d, 3);
        g.setColor(Color.black);

        int[] m = {300, 370, 370};
        int[] n = {150, 150, 120};
        g.setColor(Color.green);
        g.drawPolygon(m, n, 3);
        g.fillPolygon(m, n, 3);
        g.setColor(Color.black);
        //2

        int[] e = {400, 470, 400};
        int[] f = {80, 50, 50};
        g.draw3DRect(400, 50, 70, 100, true);
        g.setColor(Color.yellow);
        g.drawPolygon(e, f, 3);
        g.fillPolygon(e, f, 3);
        g.setColor(Color.black);

        int[] o = {400, 470, 470};
        int[] p = {150, 150, 120};
        g.setColor(Color.yellow);
        g.drawPolygon(o, p, 3);
        g.fillPolygon(o, p, 3);
        g.setColor(Color.black);
        //3

        int[] ge = {500, 570, 500};
        int[] h = {80, 50, 50};
        g.draw3DRect(500, 50, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(ge, h, 3);
        g.fillPolygon(ge, h, 3);
        g.setColor(Color.black);

        int[] q = {500, 570, 570};
        int[] r = {150, 150, 120};
        g.setColor(Color.blue);
        g.drawPolygon(q, r, 3);
        g.fillPolygon(q, r, 3);
        g.setColor(Color.black);
        //4

        int[] i = {600, 670, 600};
        int[] j = {80, 50, 50};
        g.draw3DRect(600, 50, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(i, j, 3);
        g.fillPolygon(i, j, 3);
        g.setColor(Color.black);

        int[] s = {600, 670, 670};
        int[] t = {150, 150, 120};
        g.setColor(Color.blue);
        g.drawPolygon(s, t, 3);
        g.fillPolygon(s, t, 3);
        g.setColor(Color.black);

        //5
        //row2
        int[] u = {100, 170, 100};
        int[] v = {230, 200, 200};
        g.draw3DRect(100, 200, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(u, v, 3);
        g.fillPolygon(u, v, 3);
        g.setColor(Color.black);

        int[] w = {100, 170, 170};
        int[] x = {300, 300, 270};
        g.setColor(Color.blue);
        g.drawPolygon(w, x, 3);
        g.fillPolygon(w, x, 3);
        g.setColor(Color.black);

        //6
        int[] aaa = {500, 570, 500};
        int[] bbb = {230, 200, 200};
        g.draw3DRect(500, 200, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(aaa, bbb, 3);
        g.fillPolygon(aaa, bbb, 3);
        g.setColor(Color.black);

        int[] ccc = {500, 570, 570};
        int[] ddd = {300, 300, 270};
        g.setColor(Color.blue);
        g.drawPolygon(ccc, ddd, 3);
        g.fillPolygon(ccc, ddd, 3);
        g.setColor(Color.black);

        //7
        int[] eee = {600, 670, 600};
        int[] fff = {230, 200, 200};
        g.draw3DRect(600, 200, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(eee, fff, 3);
        g.fillPolygon(eee, fff, 3);
        g.setColor(Color.black);

        int[] ggg = {600, 670, 670};
        int[] hhh = {300, 300, 270};
        g.setColor(Color.red);
        g.drawPolygon(ggg, hhh, 3);
        g.fillPolygon(ggg, hhh, 3);
        g.setColor(Color.black);

        //8
        int[] iii = {700, 770, 700};
        int[] jjj = {230, 200, 200};
        g.draw3DRect(700, 200, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(iii, jjj, 3);
        g.fillPolygon(iii, jjj, 3);
        g.setColor(Color.black);

        int[] kkk = {700, 770, 770};
        int[] lll = {300, 300, 270};
        g.setColor(Color.red);
        g.drawPolygon(kkk, lll, 3);
        g.fillPolygon(kkk, lll, 3);
        g.setColor(Color.black);

        //9
        int[] mmm = {800, 870, 800};
        int[] nnn = {230, 200, 200};
        g.draw3DRect(800, 200, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(mmm, nnn, 3);
        g.fillPolygon(mmm, nnn, 3);
        g.setColor(Color.black);

        int[] ooo = {800, 870, 870};
        int[] ppp = {300, 300, 270};
        g.setColor(Color.red);
        g.drawPolygon(ooo, ppp, 3);
        g.fillPolygon(ooo, ppp, 3);
        g.setColor(Color.black);

        //10
//        //row3
        int[] uuu = {100, 170, 100};
        int[] vvv = {380, 350, 350};
        g.draw3DRect(100, 350, 70, 100, true);
        g.setColor(Color.yellow);
        g.drawPolygon(uuu, vvv, 3);
        g.fillPolygon(uuu, vvv, 3);
        g.setColor(Color.black);

        int[] www = {100, 170, 170};
        int[] xxx = {450, 450, 420};
        g.setColor(Color.yellow);
        g.drawPolygon(www, xxx, 3);
        g.fillPolygon(www, xxx, 3);
        g.setColor(Color.black);

        //6
        int[] aa = {500, 570, 500};
        int[] bb = {380, 350, 350};
        g.draw3DRect(500, 350, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(aa, bb, 3);
        g.fillPolygon(aa, bb, 3);
        g.setColor(Color.black);

        int[] cc = {500, 570, 570};
        int[] dd = {450, 450, 420};
        g.setColor(Color.blue);
        g.drawPolygon(cc, dd, 3);
        g.fillPolygon(cc, dd, 3);
        g.setColor(Color.black);

        //7
        int[] ee = {600, 670, 600};
        int[] ff = {380, 350, 350};
        g.draw3DRect(600, 350, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(ee, ff, 3);
        g.fillPolygon(ee, ff, 3);
        g.setColor(Color.black);

        int[] gg = {600, 670, 670};
        int[] hh = {450, 450, 420};
        g.setColor(Color.red);
        g.drawPolygon(gg, hh, 3);
        g.fillPolygon(gg, hh, 3);
        g.setColor(Color.black);

        //8
        int[] ii = {700, 770, 700};
        int[] jj = {380, 350, 350};
        g.draw3DRect(700, 350, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(ii, jj, 3);
        g.fillPolygon(ii, jj, 3);
        g.setColor(Color.black);

        int[] kk = {700, 770, 770};
        int[] ll = {450, 450, 420};
        g.setColor(Color.red);
        g.drawPolygon(kk, ll, 3);
        g.fillPolygon(kk, ll, 3);
        g.setColor(Color.black);

        //9
        int[] mm = {800, 870, 800};
        int[] nn = {380, 350, 350};
        g.draw3DRect(800, 350, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(mm, nn, 3);
        g.fillPolygon(mm, nn, 3);
        g.setColor(Color.black);

        int[] oo = {800, 870, 870};
        int[] pp = {450, 450, 420};
        g.setColor(Color.red);
        g.drawPolygon(oo, pp, 3);
        g.fillPolygon(oo, pp, 3);
        g.setColor(Color.black);

        //row4
        int[] qq = {100, 170, 100};
        int[] rr = {530, 500, 500};
        g.draw3DRect(100, 500, 70, 100, true);
        g.setColor(Color.yellow);
        g.drawPolygon(qq, rr, 3);
        g.fillPolygon(qq, rr, 3);
        g.setColor(Color.black);

        int[] ss = {100, 170, 170};
        int[] tt = {600, 600, 570};
        g.setColor(Color.yellow);
        g.drawPolygon(ss, tt, 3);
        g.fillPolygon(ss, tt, 3);
        g.setColor(Color.black);

        //6
        int[] uu = {500, 570, 500};
        int[] vv = {530, 500, 500};
        g.draw3DRect(500, 500, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(uu, vv, 3);
        g.fillPolygon(uu, vv, 3);
        g.setColor(Color.black);

        int[] ww = {500, 570, 570};
        int[] xx = {600, 600, 570};
        g.setColor(Color.blue);
        g.drawPolygon(ww, xx, 3);
        g.fillPolygon(ww, xx, 3);
        g.setColor(Color.black);

        //7
        int[] yy = {600, 670, 600};
        int[] zz = {530, 500, 500};
        g.draw3DRect(600, 500, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(yy, zz, 3);
        g.fillPolygon(yy, zz, 3);
        g.setColor(Color.black);

        int[] ab = {600, 670, 670};
        int[] ac = {600, 600, 570};
        g.setColor(Color.red);
        g.drawPolygon(ab, ac, 3);
        g.fillPolygon(ab, ac, 3);
        g.setColor(Color.black);

        //8
        int[] ad = {700, 770, 700};
        int[] ae = {530, 500, 500};
        g.draw3DRect(700, 500, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(ad, ae, 3);
        g.fillPolygon(ad, ae, 3);
        g.setColor(Color.black);

        int[] af = {700, 770, 770};
        int[] ag = {600, 600, 570};
        g.setColor(Color.red);
        g.drawPolygon(af, ag, 3);
        g.fillPolygon(af, ag, 3);
        g.setColor(Color.black);

        //9
        int[] ah = {800, 870, 800};
        int[] ai = {530, 500, 500};
        g.draw3DRect(800, 500, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(ah, ai, 3);
        g.fillPolygon(ah, ai, 3);
        g.setColor(Color.black);

        int[] aj = {800, 870, 870};
        int[] ak = {600, 600, 570};
        g.setColor(Color.red);
        g.drawPolygon(aj, ak, 3);
        g.fillPolygon(aj, ak, 3);
        g.setColor(Color.black);

        //row5 kai ola ta trigwnakia
        //panw trigwnakia1
        int[] al = {200, 270, 200};
        int[] bm = {670, 640, 640};
        g.draw3DRect(200, 640, 70, 100, true);
        g.setColor(Color.red);
        g.drawPolygon(al, bm, 3);
        g.fillPolygon(al, bm, 3);
        g.setColor(Color.black);

        int[] an = {200, 270, 270};
        int[] bo = {740, 740, 710};
        g.setColor(Color.red);
        g.drawPolygon(an, bo, 3);
        g.fillPolygon(an, bo, 3);
        g.setColor(Color.black);
        //1

        int[] cccc = {300, 370, 300};
        int[] dddd = {670, 640, 640};
        g.draw3DRect(300, 640, 70, 100, true);
        g.setColor(Color.green);
        g.drawPolygon(cccc, dddd, 3);
        g.fillPolygon(cccc, dddd, 3);
        g.setColor(Color.black);

        int[] mmmm = {300, 370, 370};
        int[] nnnn = {740, 740, 710};
        g.setColor(Color.green);
        g.drawPolygon(mmmm, nnnn, 3);
        g.fillPolygon(mmmm, nnnn, 3);
        g.setColor(Color.black);
        //2

        int[] eeee = {400, 470, 400};
        int[] ffff = {670, 640, 640};
        g.draw3DRect(400, 640, 70, 100, true);
        g.setColor(Color.yellow);
        g.drawPolygon(eeee, ffff, 3);
        g.fillPolygon(eeee, ffff, 3);
        g.setColor(Color.black);

        int[] oooo = {400, 470, 470};
        int[] pppp = {740, 740, 710};
        g.setColor(Color.yellow);
        g.drawPolygon(oooo, pppp, 3);
        g.fillPolygon(oooo, pppp, 3);
        g.setColor(Color.black);
        //3

        int[] gee = {500, 570, 500};
        int[] hhhh = {670, 640, 640};
        g.draw3DRect(500, 640, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(gee, hhhh, 3);
        g.fillPolygon(gee, hhhh, 3);
        g.setColor(Color.black);

        int[] qqqq = {500, 570, 570};
        int[] rrrr = {740, 740, 710};
        g.setColor(Color.blue);
        g.drawPolygon(qqqq, rrrr, 3);
        g.fillPolygon(qqqq, rrrr, 3);
        g.setColor(Color.black);
        //4

        int[] iiii = {600, 670, 600};
        int[] jjjj = {670, 640, 640};
        g.draw3DRect(600, 640, 70, 100, true);
        g.setColor(Color.blue);
        g.drawPolygon(iiii, jjjj, 3);
        g.fillPolygon(iiii, jjjj, 3);
        g.setColor(Color.black);

        int[] ssss = {600, 670, 670};
        int[] tttt = {740, 740, 710};
        g.setColor(Color.blue);
        g.drawPolygon(ssss, tttt, 3);
        g.fillPolygon(ssss, tttt, 3);
        g.setColor(Color.black);
        //stockpile 1
        if (Game.p1.get_stockpile_number(0) == 13) {
            g.drawString("SB", 230, 250);

        } else {
            g.drawString(Integer.toString((Game.p1.get_stockpile_number(0))), 130, 250);

        }
        if (Game.p1.get_stockpile_number(0) == 14) {
            g.drawString("S S E", 230, 250);

        } else {
            g.drawString(Integer.toString((Game.p2.get_stockpile_number(0))), 130, 250);

        }
        if (Game.p1.get_stockpile_number(0) == 15) {
            g.drawString("S E", 230, 250);

        } else {
            g.drawString(Integer.toString((Game.p2.get_stockpile_number(0))), 130, 250);

        }

        //stockpile 2
        if (Game.p1.get_stockpile_number(0) == 13) {
            g.drawString("SB", 130, 550);

        } else {
            g.drawString(Integer.toString((Game.p1.get_stockpile_number(0))), 130, 550);

        }
        if (Game.p1.get_stockpile_number(0) == 14) {
            g.drawString("S S E", 130, 550);

        } else {
            g.drawString(Integer.toString((Game.p1.get_stockpile_number(0))), 130, 550);

        }
        if (Game.p1.get_stockpile_number(0) == 15) {
            g.drawString("S E", 130, 550);

        } else {
            g.drawString(Integer.toString((Game.p1.get_stockpile_number(0))), 130, 550);

        }

        //hand collection1
        if ((Game.p1.handcollection[0]).get_number() == 13) {
            g.drawString("S B", 230, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[0]).get_number()), 230, 100);
        }
        if ((Game.p1.handcollection[0]).get_number() == 14) {
            g.drawString("S S B", 230, 100);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[0]).get_number()), 230, 100);

        }
        if ((Game.p1.handcollection[0]).get_number() == 15) {
            g.drawString("S E", 230, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[0]).get_number()), 230, 100);

        }
        ////////////////////////////
        if ((Game.p1.handcollection[1]).get_number() == 13) {
            g.drawString("S B", 330, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[1]).get_number()), 330, 100);

        }
        if ((Game.p1.handcollection[1]).get_number() == 14) {
            g.drawString("S S B", 330, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[1]).get_number()), 330, 100);

        }
        if ((Game.p1.handcollection[1]).get_number() == 15) {
            g.drawString("S E", 330, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[1]).get_number()), 330, 100);

        }
        /////////////////////////////
        if ((Game.p1.handcollection[2]).get_number() == 13) {
            g.drawString("S B", 430, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[2]).get_number()), 430, 100);

        }
        if ((Game.p1.handcollection[2]).get_number() == 14) {
            g.drawString("S S B", 430, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[2]).get_number()), 430, 100);

        }
        if ((Game.p1.handcollection[2]).get_number() == 15) {
            g.drawString("S E", 430, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[2]).get_number()), 430, 100);

        }

        ////////////////////////////////////
        if ((Game.p1.handcollection[3]).get_number() == 13) {
            g.drawString("S B", 530, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[3]).get_number()), 530, 100);

        }
        if ((Game.p1.handcollection[3]).get_number() == 14) {
            g.drawString("S S B", 530, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[3]).get_number()), 530, 100);

        }
        if ((Game.p1.handcollection[3]).get_number() == 15) {
            g.drawString("S E", 530, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[3]).get_number()), 530, 100);

        }

        /////////////////////////////
        ////////////////////////////////////
        if ((Game.p1.handcollection[4]).get_number() == 13) {
            g.drawString("SB", 630, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[4]).get_number()), 630, 100);

        }
        if ((Game.p1.handcollection[4]).get_number() == 14) {
            g.drawString("SSB", 630, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[4]).get_number()), 630, 100);

        }
        if ((Game.p1.handcollection[4]).get_number() == 15) {
            g.drawString("SE", 630, 100);

        } else {
            g.drawString(Integer.toString((Game.p1.handcollection[4]).get_number()), 630, 100);

        }

        //drawpile
        g.drawString(Integer.toString(Drawpile.get(0).get_number()), 130, 400);

        //hand collection2
        if ((Game.p2.handcollection[0]).get_number() == 13) {
            g.drawString("SB", 230, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[0]).get_number()), 230, 690);

        }
        if ((Game.p2.handcollection[0]).get_number() == 14) {
            g.drawString("S S E", 230, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[0]).get_number()), 230, 690);

        }
        if ((Game.p2.handcollection[0]).get_number() == 15) {
            g.drawString("S E", 230, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[0]).get_number()), 230, 690);

        }

        ////////////////////////////
        if ((Game.p2.handcollection[1]).get_number() == 13) {
            g.drawString("SB", 330, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[1]).get_number()), 330, 690);

        }
        if ((Game.p2.handcollection[1]).get_number() == 14) {
            g.drawString("SSB", 330, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[1]).get_number()), 330, 690);

        }
        if ((Game.p2.handcollection[1]).get_number() == 15) {
            g.drawString("SE", 330, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[1]).get_number()), 330, 690);

        }
        /////////////////////////////
        if ((Game.p2.handcollection[2]).get_number() == 13) {
            g.drawString("SB", 430, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[2]).get_number()), 430, 690);

        }
        if ((Game.p2.handcollection[2]).get_number() == 14) {
            g.drawString("SSB", 430, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[2]).get_number()), 430, 690);

        }
        if ((Game.p2.handcollection[2]).get_number() == 15) {
            g.drawString("SE", 430, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[2]).get_number()), 430, 690);

        }

        ////////////////////////////////////
        if ((Game.p2.handcollection[3]).get_number() == 13) {
            g.drawString("SB", 530, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[3]).get_number()), 530, 690);

        }
        if ((Game.p2.handcollection[3]).get_number() == 14) {
            g.drawString("SSB", 530, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[3]).get_number()), 530, 690);

        }
        if ((Game.p2.handcollection[3]).get_number() == 15) {
            g.drawString("SE", 530, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[3]).get_number()), 530, 690);

        }

        /////////////////////////////
        ////////////////////////////////////
        if ((Game.p2.handcollection[4]).get_number() == 13) {
            g.drawString("SB", 630, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[4]).get_number()), 630, 690);
        }
        if ((Game.p2.handcollection[4]).get_number() == 14) {
            g.drawString("SSB", 630, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[4]).get_number()), 630, 690);

        }
        if ((Game.p2.handcollection[4]).get_number() == 15) {
            g.drawString("SE", 630, 690);

        } else {
            g.drawString(Integer.toString((Game.p2.handcollection[4]).get_number()), 630, 690);

        }

        if (counter == 2) {
            if (x1 >= 200 && x1 <= 270 && y1 >= 50 && y1 <= 150
                    && x2 >= 500 && x2 <= 570 && y2 >= 350 && y2 <= 450) {
                buildingpile1.add(Game.p1.handcollection[0]);
                g.drawString(Integer.toString(Game.p1.handcollection[0].get_number()), 530, 400);
                g.clearRect(200, 50, 70, 100);
                Game.p1.handcollection[0].set_number(0);
                counter = 0;

            }
//            if (x1 >= 200 && x1 <= 270 && y1 >= 50 && y1 <= 150
//                    && x2 >= 500 && x2 <= 570 && y2 >= 350 && y2 <= 450) {
//                
//            }
        }

        repaint();
    }

    public void display(int x, int y) {
        System.out.println(x);
        System.out.println(y);

    }

    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();

        //hand collection1 mouse events
        if (counter <= 1) {

            if (x >= 200 && x <= 270 && y >= 50 && y <= 150) {

                if (counter == 0 && x1 == 0 && y1 == 0) {
                    x1 = x;
                    y1 = y;
                    counter++;
                }

            } else if (x >= 300 && x <= 370 && y >= 50 && y <= 150) {
                if (counter == 0 && x1 == 0 && y1 == 0) {
                    x1 = x;
                    y1 = y;
                    counter++;
                }
            }

        } else if (x >= 400 && x <= 470 && y >= 50 && y <= 150) {
            if (x1 == 0 && y1 == 0) {
                x1 = x;
                y1 = y;
                counter++;

            }

        } else if (x >= 500 && x <= 570 && y >= 50 && y <= 150) {
            if (x1 == 0 && y1 == 0) {
                x1 = x;
                y1 = y;
                counter++;

            }

        } else if (x >= 600 && x <= 670 && y >= 50 && y <= 150) {
            if (x1 == 0 && y1 == 0) {
                x1 = x;
                y1 = y;
                counter++;

            }

        }
        //building piles
        if (x >= 500 && x <= 570 && y >= 350 && y <= 450) {
            if (counter == 1) {
                x2 = x;
                y2 = y;
                counter++;

            }

        }else if (x >= 600 && x <= 670 && y >= 350 && y <= 450) {
            if (counter == 1) {
                x2 = x;
                y2 = y;
                counter++;

            }

        }else if (x >= 700 && x <= 770 && y >= 350 && y <= 450) {
            if (counter == 1) {
                x2 = x;
                y2 = y;
                counter++;

            }

        }
        else if (x >= 800 && x <= 870 && y >= 350 && y <= 450) {
            if (counter == 1) {
                x2 = x;
                y2 = y;
                counter++;

            }

        }
    }

    //end while 
    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

}
