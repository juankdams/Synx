import org.apache.log4j.Logger;

final class cvh extends Mo
{
  private final aPY ifT;

  private cvh(byz parambyz, aPY paramaPY)
  {
    this.ifT = paramaPY;
    this.ifT.ao().a(this);
  }

  public void aS() {
    byz.bHA().error("L'équipement ne devrait pas etre sérialisé par le client.");
  }

  public void aT() {
    this.iZ.gli.d(this.iZ.aeL());
    this.iZ.aei();
    this.iZ.gli.b(this.ifT.eMU);

    this.iZ.gli.d(this.iZ);
    this.iZ.gli.d(akr.dlo);
    for (gA localgA1 : this.iZ.gli) {
      if ((localgA1.oi().bKn().nj() != null) && (localgA1.isActive())) {
        for (azO localazO : localgA1.oi().bKn().nj()) {
          gA localgA2 = localgA1.nG();
          try {
            this.iZ.gli.b(localgA2, (short)localazO.hV);
          } catch (Exception localException) {
            byz.bHB().fatal("On a sérialisé un inventaire incohérent.");
          }
        }
      }
    }

    byz.g(this.iZ).b((gA)this.iZ.gli.dB((short)azO.dRM.hV), (gA)this.iZ.gli.dB((short)azO.dRN.bJ()));

    this.iZ.aej();
  }
}