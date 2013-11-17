import java.util.EnumMap;
import org.apache.log4j.Logger;

public class aKY
{
  private static final Logger K = Logger.getLogger(aKY.class);
  public static final aKY epr = new aKY();

  private final EnumMap eps = new EnumMap(cdc.class);

  public void a(bZI parambZI)
  {
    a(parambZI, cdc.hwc);
  }

  public void a(bCb parambCb) {
    a(parambCb, cdc.hvZ);
  }

  public void a(dQd paramdQd) {
    a(paramdQd, cdc.hvW);
  }

  public void a(TU paramTU) {
    a(paramTU, cdc.hwa);
  }

  public void a(Qb paramQb) {
    a(paramQb, cdc.hvV);
  }

  public void a(dJu paramdJu) {
    a(paramdJu, cdc.hvU);
  }

  public void a(crS paramcrS) {
    a(paramcrS, cdc.hvN);
  }

  public void a(cxh paramcxh) {
    a(paramcxh, cdc.hvO);
  }

  public void a(cXc paramcXc) {
    a(paramcXc, cdc.hvP);
  }

  public void a(aoQ paramaoQ) {
    a(paramaoQ, cdc.hvQ);
  }

  public void a(Wa paramWa) {
    a(paramWa, cdc.hvR);
  }

  public void a(ME paramME) {
    a(paramME, cdc.hvY);
  }

  public void a(HZ paramHZ) {
    a(paramHZ, cdc.hvS);
  }

  public void a(atS paramatS) {
    a(paramatS, cdc.hvT);
  }

  public void a(dNH paramdNH) {
    a(paramdNH, cdc.hvX);
  }

  public void a(ql paramql) {
    a(paramql, cdc.hwd);
  }

  public void a(cBC paramcBC) {
    a(paramcBC, cdc.hwe);
  }

  public void a(dmA paramdmA) {
    a(paramdmA, cdc.hwg);
  }

  public void a(zs paramzs) {
    a(paramzs, cdc.hwh);
  }

  public void a(mg parammg) {
    a(parammg, cdc.hwi);
  }

  public void a(dSJ paramdSJ) {
    a(paramdSJ, cdc.hwj);
  }

  public void a(axa paramaxa) {
    a(paramaxa, cdc.hwk);
  }

  public void a(aRz paramaRz) {
    a(paramaRz, cdc.hwl);
  }

  public void a(dNh paramdNh) {
    a(paramdNh, cdc.hwm);
  }

  public void a(aWx paramaWx) {
    a(paramaWx, cdc.hwn);
  }

  public void a(aDG paramaDG) {
    a(paramaDG, cdc.hwp);
  }

  public cih a(cdc paramcdc, int paramInt)
  {
    cSR localcSR = (cSR)this.eps.get(paramcdc);
    return localcSR != null ? (cih)localcSR.get(paramInt) : null;
  }

  private void a(cih paramcih, cdc paramcdc) {
    cSR localcSR = (cSR)this.eps.get(paramcdc);
    if (localcSR == null) {
      this.eps.put(paramcdc, localcSR = new cSR());
    }
    if (localcSR.put(paramcih.getId(), paramcih) != null)
      K.error(new IllegalArgumentException("on essaye d'enregistrer des paramètres d' IE " + paramcdc.toString() + " avec le meme id " + paramcih.getId()));
  }

  public String toString()
  {
    return "IEParametersManager{m_params=" + this.eps.size() + '}';
  }
}