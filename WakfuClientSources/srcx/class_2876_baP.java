import java.util.ArrayList;
import org.apache.log4j.Logger;

public class baP extends aAY
{
  public static final String fiS = "efcc0a";
  private int cio;
  private int cip;

  public baP(aYr paramaYr)
  {
    super(paramaYr);
    this.dUG = new bcr(this);
  }

  protected bMX aMM()
  {
    return new dDI();
  }

  public void d(long paramLong, String paramString) {
    K.info("Demande d'enregistrement d'un candidat à la nation !!!");

    dey localdey = new dey();
    localdey.dc(UI().bP());
    localdey.g(paramLong);
    localdey.oZ(paramString);
    cfp.hAy.b(localdey);
  }

  public void a(long paramLong, Qy paramQy) {
    throw new UnsupportedOperationException("[NATION] Impossible d'enregistrer des CandidateInfo déjà initialisés à partir d'ici");
  }

  public void C(ArrayList paramArrayList) {
    aMZ();
    bPE.bWu().bWS();

    for (int i = 0; i < paramArrayList.size(); i++) {
      Qy localQy = (Qy)paramArrayList.get(i);
      this.dUn.put(localQy.getId(), localQy);
    }
    bPE.bWu().updateUI();
  }

  public void bz(int paramInt1, int paramInt2) {
    this.cio = paramInt1;
    this.cip = paramInt2;
  }

  public void a(long paramLong1, byte paramByte, long paramLong2) {
    deS localdeS = new deS();
    localdeS.dc(UI().bP());
    localdeS.g(paramLong1);
    localdeS.eS(paramByte);
    localdeS.jE(paramLong2);
    cfp.hAy.b(localdeS);
  }

  public void a(Yp paramYp1, Yp paramYp2, cuX paramcuX) {
    bOA localbOA = new bOA();
    localbOA.dc(UI().bP());
    localbOA.gR(paramYp1.getId());
    localbOA.gS(paramYp2.getId());
    localbOA.a(paramcuX);
    cfp.hAy.b(localbOA);
  }

  public void a(dxL paramdxL, cds paramcds, boolean paramBoolean)
  {
    s(paramdxL);
    this.dUl.a(paramcds);
    this.dUi = paramBoolean;
  }

  public boolean aMS()
  {
    this.dUn.clear();
    return true;
  }

  public void t(long paramLong1, long paramLong2) {
    Fw localFw = new Fw();
    localFw.dc(UI().bP());
    localFw.bz(paramLong2);
    localFw.by(paramLong1);
    cfp.hAy.b(localFw);
  }

  protected void aMZ()
  {
    this.cip = 0;
    this.cio = 0;
    for (cHu localcHu = UI().bnJ(); localcHu.hasNext(); ) {
      localcHu.fl();
      long l = localcHu.bic();
      cTK localcTK = UI().o(l);
      if (localcTK != null)
      {
        ((ctE)localcTK.cJf()).bLG();
      }
    }
    super.aMZ();
  }

  public int abA() {
    return this.cio;
  }

  public int aNb() {
    return this.cip;
  }

  public void oE(int paramInt) {
    this.cip = paramInt;
  }

  public void f(long paramLong1, long paramLong2)
  {
  }

  public void be(long paramLong)
  {
  }

  public void bf(long paramLong)
  {
  }

  public void bg(long paramLong)
  {
  }

  public void Kg()
  {
  }
}