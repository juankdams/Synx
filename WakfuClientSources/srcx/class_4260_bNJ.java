import com.ankamagames.framework.graphics.engine.Anm2.Anm;
import org.apache.log4j.Logger;

class bNJ
{
  private final bPu fMM = new bPu(ckh.values().length);
  private final ahm fea;

  private bNJ(ahm paramahm)
  {
    this.fea = paramahm;
  }

  public void cg(short paramShort) {
    ckh localckh = ckh.de(paramShort);
    if (localckh == null) {
      return;
    }

    Anm localAnm = (Anm)this.fMM.cw(paramShort);
    if (localAnm != null)
      a(localckh, localAnm);
  }

  private void a(ckh paramckh, Anm paramAnm)
  {
    this.fea.c(paramAnm, paramckh.hLl);
  }

  public void a(int paramInt, short paramShort, boolean paramBoolean)
  {
    ckh localckh = ckh.de(paramShort);
    if (localckh == null) {
      return;
    }

    cg(paramShort);

    if (!paramBoolean) {
      return;
    }
    try
    {
      String str = ay.bd().getString("ANMEquipmentPath");
      Anm localAnm = ahm.eo(String.format(str, new Object[] { Integer.valueOf(paramInt) }));
      this.fea.a(localAnm, localckh.hLl);
      this.fMM.c(paramShort, localAnm);
    } catch (Exception localException) {
      aRN.Re().error("Erreur au chargement de l'équipment : " + paramInt, localException);
    }
  }

  public void a(bBn parambBn, short paramShort, byte paramByte) {
    int i = paramByte == 0 ? parambBn.oc() : parambBn.od();
    a(i, paramShort, parambBn.bKn().nm());
  }

  public void bIW() {
    bM localbM = this.fMM.bVW();
    while (localbM.hasNext()) {
      localbM.fl();
      ckh localckh = ckh.de(localbM.fm());
      a(localckh, (Anm)localbM.value());
    }
    this.fMM.clear();
  }
}