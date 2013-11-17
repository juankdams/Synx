import java.util.ArrayList;

class boh
  implements doN
{
  boh(yy paramyy, axU paramaxU)
  {
  }

  public boolean a(cSx paramcSx)
  {
    int i = bKO.g(this.fHv.bsb).indexOf(this.fHu);
    aIo localaIo = (aIo)bKO.f(this.fHv.bsb).get(i + bKO.k(this.fHv.bsb));
    boolean bool1 = true;
    if (localaIo.hasChildren()) {
      bool1 = !localaIo.axS();
      if ((bool1) || (!bKO.l(this.fHv.bsb))) {
        localaIo.cq(bool1);
        if (bKO.m(this.fHv.bsb))
        {
          Object localObject;
          if (bool1) {
            localObject = !bKO.n(this.fHv.bsb).isEmpty() ? (aIo)bKO.n(this.fHv.bsb).get(bKO.n(this.fHv.bsb).size() - 1) : null;
            if (localObject != localaIo.aUq()) {
              do {
                localObject = !bKO.n(this.fHv.bsb).isEmpty() ? (aIo)bKO.n(this.fHv.bsb).remove(bKO.n(this.fHv.bsb).size() - 1) : null;
                if (localObject != null)
                  localObject.cq(false);
              }
              while ((localObject != null) && (localObject.aUq() != localaIo.aUq()));
            }
            bKO.n(this.fHv.bsb).add(localaIo);
          }
          else {
            do {
              localObject = !bKO.n(this.fHv.bsb).isEmpty() ? (aIo)bKO.n(this.fHv.bsb).remove(bKO.n(this.fHv.bsb).size() - 1) : null;
              if (localObject != null)
                localObject.cq(false);
            }
            while ((localObject != null) && (localObject != localaIo));
          }
        }
      }

    }

    boolean bool2 = ((!localaIo.isSelected()) && ((bool1) || (bKO.l(this.fHv.bsb)))) || (bKO.o(this.fHv.bsb));
    localaIo.setSelected(bool2);
    if ((bKO.p(this.fHv.bsb)) && ((!bKO.o(this.fHv.bsb)) || (localaIo != bKO.q(this.fHv.bsb)))) {
      if (bool2) {
        if (bKO.q(this.fHv.bsb) != null) {
          bKO.q(this.fHv.bsb).setSelected(false);
        }
        bKO.a(this.fHv.bsb, localaIo);
      } else {
        if (bKO.q(this.fHv.bsb) != null) {
          bKO.q(this.fHv.bsb).setSelected(false);
        }
        bKO.a(this.fHv.bsb, null);
      }
      this.fHv.bsb.g(new diZ(this.fHv.bsb));
    }

    bKO.r(this.fHv.bsb);
    return false;
  }
}