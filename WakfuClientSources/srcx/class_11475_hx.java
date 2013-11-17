import com.ankamagames.wakfu.client.WakfuClientInstance;
import java.awt.Canvas;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import org.apache.log4j.Logger;
import org.eclipse.swt.widgets.Display;

public class hx
  implements UM
{
  private static final Logger K = Logger.getLogger(hx.class);

  private static final Pattern aGP = Pattern.compile("([0-9]+)x([0-9]+)");
  public static final int aGQ = 0;
  public static final int LOADING = 1;
  public static final int aGR = 2;
  public static final hx aGS = new hx();
  private JPanel aGT;
  private hh aGU;
  private Canvas aGV;
  private dqy aGW;
  private boolean aGX = false;
  private El aGY;
  private aSW aGZ;
  private int aHa;

  public void init()
  {
    if (!bjY.bvf()) {
      try {
        bjY.bve();
      } catch (Exception localException) {
        K.error("Impossible d'initialiser XulRunner !", localException);
        return;
      }
    }

    cJF localcJF = (cJF)WakfuClientInstance.awy().aww();
    while (!localcJF.ais()) {
      Thread.yield();
    }

    JPanel localJPanel = localcJF.cDH();
    if (localJPanel == null) {
      return;
    }

    this.aGT = new JPanel();
    this.aGT.setLayout(new atm());
    this.aGT.setOpaque(true);
    this.aGT.setBackground(Color.BLACK);
    this.aGT.setVisible(false);

    localJPanel.add(this.aGT, 0);

    px();

    localJPanel.validate();

    this.aHa = 0;
  }

  private void pw() {
    this.aGU.setRelative(true);

    this.aGT.validate();
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.aGU.setX(paramInt1);
    this.aGU.setY(paramInt2);
    this.aGU.setWidth(paramInt3);
    this.aGU.setHeight(paramInt4);
    this.aGU.setRelative(false);
    this.aGT.validate();
  }

  private void px() {
    this.aGV = new Canvas();
    this.aGV.setBackground(Color.BLACK);

    this.aGU = new hh(1.0F, 1.0F, (byte)1, 0, 0, 0, 0);
    this.aGT.add(this.aGV, this.aGU);

    while (!this.aGV.isDisplayable()) {
      Thread.yield();
    }

    this.aGW = new dqy();
    this.aGW.a(Display.getCurrent(), this.aGV);
    this.aGW.a(new csO(this));

    this.aGV.addComponentListener(new csM(this));

    this.aGT.validate();
  }

  public int getState()
  {
    return this.aHa;
  }

  private we a(El paramEl) {
    String str;
    try {
      str = ay.bd().getString("krosmoz.gameUrl." + this.aGY.bJ());
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
      return null;
    }

    switch (csI.aEs[paramEl.ordinal()]) {
    case 1:
      return new oa(this.aGW, str, "getFlashPlayerObject()");
    case 2:
      return new O();
    case 3:
      return new cnJ(str);
    }
    return new O();
  }

  private void load()
  {
    if (this.aGX) {
      return;
    }

    we localwe = a(this.aGY);
    if (localwe == null) {
      K.warn("Impossible de créer un handler pour " + this.aGY);
      return;
    }

    this.aHa = 1;

    this.aGW.a(localwe);

    bjY.d(new csL(this, localwe));

    this.aGX = true;
  }

  public void unload()
  {
    if (!this.aGX) {
      return;
    }

    this.aHa = 0;

    this.aGT.setVisible(false);

    bjY.d(new csK(this));

    u(true);

    this.aGX = false;

    cJF localcJF = (cJF)WakfuClientInstance.awy().aww();
    localcJF.io(true);

    byv.bFN().b(this.aGZ);

    this.aGZ = null;
    this.aGY = null;
  }

  public void b(El paramEl) {
    if (this.aGX)
      unload();
    else
      c(paramEl);
  }

  private void c(El paramEl)
  {
    this.aGY = paramEl;
    load();
  }

  public dqy py() {
    return this.aGW;
  }

  public void b(String paramString, Object[] paramArrayOfObject) {
    bjY.d(new csJ(this, paramString, paramArrayOfObject));
  }

  public void pz()
  {
    if (this.aHa != 1) {
      return;
    }

    this.aHa = 2;

    this.aGT.setVisible(true);
    this.aGT.validate();

    u(false);

    if (this.aGY.MS())
    {
      czK localczK = (czK)WakfuClientInstance.awy().aww();
      localczK.io(false);
    }
  }

  private void u(boolean paramBoolean)
  {
    float f = paramBoolean ? 1.0F : 0.0F;
    aWc.blo().g(f, 1000);
    aWc.blo().f(f, 1000);
    aWc.blo().e(f, 1000);
  }

  public void pA() {
    unload();
  }
}