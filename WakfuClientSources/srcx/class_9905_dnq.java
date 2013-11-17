import com.ankamagames.baseImpl.graphics.sound.LuaAnmActionRunScriptManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public abstract class dnq extends aIQ
  implements dHI
{
  private static final Logger K = Logger.getLogger(dnq.class);
  protected static final String lnb = "userPreferences.properties";
  public static final String lnc = "gamePreferences";
  public static final String lnd = "hardwareManager";
  protected dCp lne;
  protected abQ iGD;
  private static final byte lnf = 3;
  protected final aRm[] lng = new aRm[3];
  protected dSz lnh;
  private final List lni = new ArrayList();
  private int lnj = 0;
  protected cZy lnk;
  private dJR lnl;

  public dnq(boolean paramBoolean)
  {
    awA();

    awC();

    awD();

    if (paramBoolean)
      cjO.clE().clF();
    else {
      cjO.clE().start();
    }
    cAo.cxf().start();
  }

  public abstract cRd aww();

  protected void a(abQ paramabQ)
  {
    this.iGD = paramabQ;
  }

  public dCp cUV()
  {
    return this.lne;
  }

  public dSz Dg()
  {
    return this.lnh;
  }

  public aRm[] cUW() {
    return this.lng;
  }

  public final bAU rs() {
    return aww().rs();
  }

  protected abstract void awA();

  protected void cUX() {
    axc().a(new ciW("userPreferences.properties"));
  }

  public cZy axc()
  {
    if (this.lnk == null) {
      awC();
    }
    return this.lnk;
  }

  protected void b(cZy paramcZy)
  {
    this.lnk = paramcZy;
  }

  protected void awC()
  {
    b(new cZy());
  }

  public void awD()
  {
    cUX();
    try
    {
      cZy.cMn().load();
    }
    catch (IOException localIOException)
    {
    }

    cZy localcZy = axc();
    if (localcZy != null)
    {
      dWe.dvA().t("gamePreferences", localcZy);
      dWe.dvA().t("hardwareManager", aNh.eth);
    }
  }

  public void initialize()
  {
    if (awX()) {
      Yo.a(new ZL());
      aGb.a(new LuaAnmActionRunScriptManager());
    } else {
      Yo.a(new bem());
      aGb.a(new dbu());
    }
    aww().a(this);
  }

  protected abstract boolean awX();

  public void awQ()
  {
    this.iGD.a(aww());

    awR();
  }

  public void awR()
  {
  }

  protected abstract dCp axb();

  protected abstract void a(dCp paramdCp);

  protected abstract bnM y(float paramFloat1, float paramFloat2);

  public void b(cXf paramcXf)
  {
  }

  protected abstract boolean d(String paramString, int paramInt1, int paramInt2);

  protected boolean a(dIu paramdIu, boolean paramBoolean, dIP paramdIP)
  {
    aww().b(paramdIP);
    rs().fN(paramBoolean);
    aww().a(paramdIu);
    return true;
  }

  protected boolean a(dIu paramdIu, boolean paramBoolean) {
    return a(paramdIu, paramBoolean, new dIP());
  }

  protected abstract void awK();

  protected abstract void awL();

  public void cUY()
  {
    try
    {
      awM();
      cVa();
    } catch (Exception localException) {
      K.error("Erreur lors du resomePostDiagnosticLoading : ", localException);
      JOptionPane.showMessageDialog(aww().cHK(), localException.getMessage() + " (" + localException.getClass().getName() + ")");
    }
  }

  public void en(short paramShort)
  {
    this.lng[0].a(paramShort, 0.0F);
  }

  protected final void b(String paramString, float paramFloat1, float paramFloat2) {
    for (int i = 0; i < this.lng.length; i++) {
      this.lng[i] = new aRm(paramFloat1, paramFloat2);
      this.lng[i].ik(paramString);
    }
  }

  protected void cUZ() {
    this.lne.a(new aTG(this));
  }

  protected void a(bAU parambAU, float paramFloat1, float paramFloat2)
  {
    parambAU.a(IH.Sd(), true);

    this.lnh = y(paramFloat1, paramFloat2);

    b(awE(), paramFloat1, paramFloat2);

    awQ();
    this.lne = axb();

    cUZ();

    a(this.lne);
    if (this.lne != null) {
      parambAU.a(this.lne, true);
      parambAU.a(this.lne, true);
      parambAU.a(this.lne, false);
      parambAU.a(this.lne, false);
    }

    b(this.lnh);
    if (this.lnh != null) {
      parambAU.a(this.lnh, false);
      parambAU.a(this.lnh, false);
      parambAU.a(this.lnh, false);
      parambAU.a(this.lnh, false);
      for (int i = 0; i < this.lng.length; i++)
        this.lng[i].a(this.lnh);
    }
  }

  protected abstract String awE();

  protected void b(asq paramasq)
  {
    this.lni.add(paramasq);
  }

  protected abstract void awM();

  protected void cVa()
  {
    this.lnj = -1;
    iQ(this.lni.size() - 1);
    cVb();
  }

  private void cVb()
  {
    if (++this.lnj < this.lni.size()) {
      asq localasq = (asq)this.lni.get(this.lnj);
      if (localasq != null)
        try {
          localasq.a(this);
        } catch (Exception localException) {
          a(localasq, localException);
        }
    }
    else {
      iR(this.lnj);
      start();
    }
  }

  public void c(asq paramasq)
  {
    a(paramasq, this.lnj);
    try
    {
      asq localasq = (asq)this.lni.get(this.lnj);
      a(localasq);
    } catch (Exception localException) {
      K.error("exception sur onContentInitializerStart", localException);
    }

    this.lne.a(new aTF(this));
  }

  protected abstract void iQ(int paramInt);

  protected abstract void iR(int paramInt);

  protected abstract void a(asq paramasq);

  protected abstract void a(asq paramasq, Exception paramException);

  protected abstract void a(asq paramasq, int paramInt);

  protected abstract void start();

  public void awO()
  {
    awP();
  }

  public void cleanUp()
  {
    awP();
  }

  private void awP()
  {
    try
    {
      bQK.bXG().bXI();
    } catch (Exception localException1) {
      K.error("Exception lors du nettoyage des mobiles", localException1);
    }
    try
    {
      this.iGD.aoa();
    } catch (Exception localException2) {
      K.error("Exception lors du nettoyage du TextureManager", localException2);
    }
  }

  public void awV() {
  }

  public void cVc() {
    dIu localdIu = aww().cHF();
    if (localdIu == null) {
      return;
    }
    axc().c(yR.bsA, localdIu.cOK());
  }

  public void b(dIu paramdIu) {
    axc().c(yR.bsA, paramdIu.cOK());
  }

  public void jD(boolean paramBoolean) {
    bAU localbAU = rs();
    if (localbAU == null) {
      return;
    }
    localbAU.fJ(paramBoolean);
    dsZ.cZe().cZh();

    aww().cHz();
  }

  public void jE(boolean paramBoolean) {
    bAU localbAU = rs();
    if (localbAU == null) {
      return;
    }
    localbAU.fK(!paramBoolean);
    dsZ.cZe().cZh();

    aww().cHz();
  }

  public abstract void awT();

  public void jF(boolean paramBoolean)
  {
    if (cVd() == paramBoolean) {
      return;
    }

    if (aww() == null) {
      return;
    }

    if (paramBoolean) {
      if (this.lnl == null) {
        this.lnl = new dJR(this);
        aww().b(this.lnl);
      }
      this.lnl.reset();
      a(this.lnl);
    }
    else if (this.lnl != null) {
      aww().cDG();
      this.lnl.reset();
      this.lnl = null;
    }
  }

  public void a(dJR paramdJR)
  {
    paramdJR.aq(chW.class);
    paramdJR.aq(cNk.class);
    paramdJR.aq(csH.class);
    paramdJR.aq(ceu.class);
  }

  public boolean cVd() {
    return (this.lnl != null) && (this.lnl.isVisible());
  }
}