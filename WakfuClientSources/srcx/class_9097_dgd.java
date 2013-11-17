import javax.swing.JFrame;

class dgd
  implements Runnable
{
  dgd(cNm paramcNm)
  {
  }

  public void run()
  {
    cNm.a(this.lbb, new JFrame("Pools Debug"));

    cNm.a(this.lbb, new cif(cNm.a(this.lbb)));
    cNm.c(this.lbb).setContentPane(cNm.b(this.lbb).gY());

    cNm.c(this.lbb).addWindowListener(new aXe(this));

    cNm.c(this.lbb).setDefaultCloseOperation(2);
    cNm.c(this.lbb).setSize(800, 450);

    cNm.c(this.lbb).setVisible(true);

    dka.cSF().a(new aXg(this), 1000L, -1);
  }
}