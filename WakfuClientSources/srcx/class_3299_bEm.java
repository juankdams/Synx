import java.util.LinkedList;

class bEm
  implements ddy
{
  bEm(bSc parambSc, cKq paramcKq)
  {
  }

  public void a(cKq paramcKq, byN parambyN)
  {
    switch (bEq.iS[parambyN.ordinal()]) {
    case 1:
      synchronized (bSc.bZe()) {
        bSc.b(this.bOL, false);
        if (bSc.c(this.bOL)) {
          this.bOL.run();
        }
        else if ((!bSc.a(this.bOL).isEmpty()) && (bSc.d(this.bOL) < 9)) {
          bSc.a(this.bOL, (cbj)bSc.a(this.bOL).poll());
        }

        this.gzC.b(this);
      }
    }
  }
}