import javax.swing.JFrame;

class tr
  implements Runnable
{
  tr(beV parambeV)
  {
  }

  public void run()
  {
    beV.a(this.bdH, new JFrame("PSys Debug"));

    beV.a(this.bdH, new de());
    beV.b(this.bdH).setContentPane(beV.a(this.bdH).gY());

    beV.b(this.bdH).setDefaultCloseOperation(3);
    beV.b(this.bdH).setSize(300, 600);

    beV.b(this.bdH).setVisible(true);

    dka.cSF().a(new WT(this), 1000L, -1);
  }
}