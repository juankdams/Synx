import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class azv
  implements cvW
{
  private static final float[] dQJ = { 0.0F, 0.3F, 0.6F, 0.6F };
  private static final float[] dQK = { 1.0F, 0.0F, 0.0F, 0.6F };
  private static final Logger K = Logger.getLogger(azv.class);

  private static final azv dQL = new azv();
  private gA aUe;
  protected Su Rl;
  private final dRK dQM;
  private final cYk aUg = new cYk();
  private boolean dQN;

  private azv()
  {
    this.dQM = new dRK("useItemSelectCell", dQJ);
  }

  public static azv aLf() {
    return dQL;
  }

  public long getId() {
    return 0L;
  }

  public void a(long paramLong) {
  }

  public void af(Su paramSu) {
    this.Rl = paramSu;
  }

  public void e(gA paramgA)
  {
    this.aUe = paramgA;
  }

  public gA getItem() {
    return this.aUe;
  }

  protected Ce wa() {
    return this.aUe;
  }

  private boolean aLg() {
    if ((this.aUe == null) || (this.Rl == null)) {
      return false;
    }
    cYk localcYk = this.Rl.aKb();
    int i = this.aUg.ac(localcYk);
    bVw localbVw = (bVw)this.aUe.oi();
    switch (dwg.lBq[localbVw.cbj().ordinal()]) {
    case 1:
      if ((localbVw.bKp() > i) || (i > localbVw.bKo())) {
        return false;
      }
      return Math.abs(localcYk.IB() - this.aUg.IB()) <= this.Rl.arG();
    case 2:
      return true;
    }

    return false;
  }

  protected void y(int paramInt1, int paramInt2, short paramShort)
  {
    dQg localdQg = new dQg();
    localdQg.aW(this.aUe.oj());
    localdQg.d(paramInt1, paramInt2, paramShort);
    byv.bFN().aJK().d(localdQg);
  }

  protected String azj()
  {
    if (this.aUe == null) {
      return null;
    }

    return (String)this.aUe.getFieldValue("iconUrl");
  }

  private cYk d(int paramInt1, int paramInt2, boolean paramBoolean) {
    return bYZ.a(WakfuClientInstance.awy().Dg(), paramInt1, paramInt2, paramBoolean);
  }

  public cYk aJa() {
    return new cYk(this.aUg);
  }

  public boolean a(cWG paramcWG)
  {
    aqQ localaqQ;
    switch (paramcWG.getId()) {
    case 19994:
      localaqQ = (aqQ)paramcWG;
      bv(localaqQ.aCX(), localaqQ.aCY());
      return false;
    case 19992:
      localaqQ = (aqQ)paramcWG;
      if (!localaqQ.aCU()) {
        byv.bFN().b(this);
        return false;
      }

      if ((this.Rl != null) && 
        (this.dQM.P(this.aUg.getX(), this.aUg.getY(), this.aUg.IB())) && (aLg())) {
        int i = this.aUg.getX();
        int j = this.aUg.getY();
        short s = this.aUg.IB();

        dAy.a(this.Rl, getItem(), new cYk(this.aUg));

        if (getItem().iterator().hasNext()) {
          y(i, j, s);
        }

        aEe localaEe = new aEe(bU.fH().getString("chat.item.selfUse", new Object[] { ceb.ag(this.aUe) }));
        localaEe.mm(4);
        CM.LV().a(localaEe);
      }

      byv.bFN().b(this);
      return false;
    }

    return true;
  }

  private boolean bv(int paramInt1, int paramInt2) {
    cYk localcYk = d(paramInt1, paramInt2, true);
    if (localcYk == null) {
      this.aUg.ac(2147483647, 2147483647, (short)32767);
      this.dQM.clear();
      return true;
    }
    if (localcYk.equals(this.aUg)) {
      return true;
    }

    this.aUg.ae(localcYk);
    this.dQM.clear();

    if (aLg())
      this.dQM.g(dQJ);
    else {
      this.dQM.g(dQK);
    }

    if ((this.aUe != null) && (this.Rl != null)) {
      this.dQM.Q(this.aUg.getX(), this.aUg.getY(), this.aUg.IB());
    }
    return false;
  }

  public void a(aqv paramaqv, boolean paramBoolean)
  {
    if (this.dQN) {
      return;
    }

    this.dQN = true;

    String str = azj();
    if (str != null) {
      dGx.dhr().a(duv.lyt, true);
      bWx.cbz().a(str, null, 10, -30, aFG.ecg);
    } else {
      dGx.dhr().unlock();
      bWx.cbz().hide();
    }

    dSz localdSz = WakfuClientInstance.awy().Dg();
    bv(localdSz.aCX(), localdSz.aCY());
  }

  public void b(aqv paramaqv, boolean paramBoolean) {
    if (!this.dQN) {
      return;
    }

    this.dQM.clear();

    dGx.dhr().unlock();
    bWx.cbz().hide();

    this.dQN = false;
    this.aUg.ac(2147483647, 2147483647, (short)32767);
  }
}