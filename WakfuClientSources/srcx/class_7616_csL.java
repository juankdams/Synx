import java.awt.Dimension;

class csL
  implements Runnable
{
  csL(hx paramhx, we paramwe)
  {
  }

  public void run()
  {
    hx.b(this.icB).ex(hx.c(this.icB).MT());

    if (hx.c(this.icB).MS())
      hx.d(this.icB);
    else {
      this.icB.a(0, 0, hx.c(this.icB).getSize().width, hx.c(this.icB).getSize().height);
    }

    hx.b(this.icB).cXA();
    hx.b(this.icB).ke(hx.c(this.icB).MR());

    hx.a(this.icB, clv.hNr.a(hx.c(this.icB), this.icC));
    hx.e(this.icB).f(this.icB);
    byv.bFN().a(hx.e(this.icB));

    hx.b(this.icB).start();
  }
}