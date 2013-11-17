import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class aSu extends cMb
{
  private static final Logger K = Logger.getLogger(aSu.class);

  private final ArrayList ewi = new ArrayList();
  private final ArrayList ePI = new ArrayList();

  private final cCH kC = new aMH(this);

  public void bc()
  {
    super.bc();
    this.ewi.clear();
    this.ePI.clear();
  }

  public void aJ()
  {
    super.aJ();
    this.krb = true;
    this.krc = 40;
    this.kqX = 0;
    this.aTn = 0;
    if ((!bB) && (!this.ePI.isEmpty())) throw new AssertionError();
    if ((!bB) && (!this.ewi.isEmpty())) throw new AssertionError();
  }

  protected cCH ak()
  {
    return this.kC;
  }

  public void a(abc paramabc)
  {
  }

  public boolean a(dJO paramdJO, bhL parambhL) {
    d(paramdJO);
    return false;
  }

  public dJO eR()
  {
    return null;
  }

  public dJO[] eS()
  {
    return dJO.lWj;
  }

  public String getName()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    byz localbyz = WakfuClientInstance.awy().awz().bFO();
    int i = localbyz.adF() ? localbyz.aeQ().getId() : -1;
    for (bls localbls : this.ewi) {
      if (!localbls.isVisible())
      {
        break;
      }
      if (localbls.aeR() == i) {
        localStringBuilder.append(localbls.getItem().getName()).append("(").append(localbls.getItem().nP()).append(")( ");
        if ((localbls.cqo() == null) || (localbls.cqo().contains(Long.valueOf(localbyz.getId()))))
          localStringBuilder.append(bU.fH().getString("desc.loot.available"));
        else {
          localStringBuilder.append(bU.fH().getString("desc.loot.notAvailable"));
        }
        localStringBuilder.append(" )\n");
      }
    }

    return localStringBuilder.toString();
  }

  public boolean isVisible()
  {
    arl localarl = null;
    byz localbyz = byv.bFN().bFO();
    if ((localbyz != null) && (localbyz.bGv() != null)) {
      localarl = localbyz.bGv();
    }

    ArrayList localArrayList = big();
    int i = localarl != null ? localarl.getId() : -1;
    for (int j = 0; j < localArrayList.size(); j++) {
      if ((((bls)localArrayList.get(j)).aeR() == i) && (((bls)localArrayList.get(j)).isVisible())) {
        return super.isVisible();
      }
    }

    return false;
  }

  public boolean adO()
  {
    return true;
  }

  public short OL()
  {
    return (short)(int)(bY() * 10.0F);
  }

  public csx[] am()
  {
    return new csx[] { aiI.dfA.avt() };
  }

  public boolean d(bls parambls)
  {
    if (!this.ewi.contains(parambls)) {
      this.ePI.add(Long.valueOf(parambls.getId()));
      return this.ewi.add(parambls);
    }
    return false;
  }

  public ArrayList big() {
    return this.ewi;
  }

  public boolean e(bls parambls) {
    boolean bool = this.ewi.remove(parambls);
    this.ePI.remove(Long.valueOf(parambls.getId()));
    return bool;
  }

  public void tk()
  {
    super.tk();
  }

  public void initialize() {
    for (abc localabc : sL())
      if ((localabc instanceof djm))
      {
        a((djm)localabc);
      }
  }

  private void a(djm paramdjm)
  {
    paramdjm.J(false);
    int i;
    if (this.ewi.size() == 1) {
      i = ((bls)this.ewi.get(0)).oe();
      if ((i > 0) && (nO(i))) {
        paramdjm.pj("ANMEquipmentPath");
        paramdjm.bQ(i);
      } else {
        paramdjm.pj("ANMInteractiveElementPath");
        paramdjm.bQ(clP.hQb[0]);
      }
    } else {
      paramdjm.pj("ANMInteractiveElementPath");
      i = 0;
      for (bls localbls : this.ewi) {
        i += localbls.getItem().nU();
      }

      for (int j = 0; (j < clP.hQb.length) && (
        (j + 1 >= clP.hQb.length) || (i > clP.hQb[(j + 1)])); j++);
      paramdjm.bQ(clP.hQb[j]);
    }
  }

  private boolean nO(int paramInt) {
    try {
      String str = ay.bd().getString("ANMEquipmentPath");
      str = String.format(str, new Object[] { Integer.valueOf(paramInt) });
      dtb.pT(str);
    } catch (Exception localException) {
      K.error("", localException);
      return false;
    }

    return true;
  }
}