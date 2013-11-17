import java.util.LinkedList;

class bEp
  implements ddy
{
  bEp(bSc parambSc, dRq paramdRq, cKq paramcKq)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (bEq.iS[parambyN.ordinal()]) {
    case 1:
      synchronized (bSc.bZe()) {
        bSc.b(this.bOL, false);

        this.gzD.setY(-200);
        this.gzD.setVisible(false);
        bSc.b(this.bOL).removeLast();
        bSc.e(this.bOL);

        if (!bSc.a(this.bOL).isEmpty()) {
          cbj localcbj = (cbj)bSc.a(this.bOL).poll();
          bSc.a(this.bOL, localcbj);
        }

        bSc.f(this.bOL);

        if (this.bOL.bZb()) {
          bSc.g(this.bOL);
        }

        this.gzC.b(this);
      }
    }
  }
}