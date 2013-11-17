import javax.swing.JFrame;

class cgD
  implements Runnable
{
  cgD(dES paramdES)
  {
  }

  public void run()
  {
    dES.a(this.hEC, new JFrame("RenderTree Debug"));

    dES.a(this.hEC, new atR());
    dES.b(this.hEC).setContentPane(dES.a(this.hEC).gY());

    dES.b(this.hEC).setDefaultCloseOperation(3);
    dES.b(this.hEC).setSize(300, 600);

    dES.b(this.hEC).setVisible(true);

    dka.cSF().a(new cQA(this), 2000L, -1);
  }
}