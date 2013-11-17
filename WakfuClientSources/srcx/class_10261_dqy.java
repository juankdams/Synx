import java.awt.Canvas;
import org.apache.log4j.Logger;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class dqy
{
  private static final Logger K = Logger.getLogger(dqy.class);
  private aWp lsh;
  private Browser lsi;
  private Shell lsj;
  private Composite lsk;
  private cMi lsl;
  private we lsm;
  private bcq lsn;
  private VH lso;

  public Shell a(Display paramDisplay, Canvas paramCanvas)
  {
    this.lsj = SWT_AWT.new_Shell(paramDisplay, paramCanvas);
    this.lsj.setBounds(0, 0, paramCanvas.getWidth(), paramCanvas.getHeight());

    GridLayout localGridLayout = new GridLayout();
    localGridLayout.marginWidth = 0;
    localGridLayout.marginHeight = 0;
    localGridLayout.horizontalSpacing = 0;
    localGridLayout.verticalSpacing = 0;
    localGridLayout.marginBottom = 0;
    localGridLayout.marginLeft = 0;
    localGridLayout.marginRight = 0;
    localGridLayout.marginTop = 0;
    this.lsj.setLayout(localGridLayout);

    cIO localcIO = null;
    try {
      String str = ay.bd().getString("appSkinPath");
      localcIO = new cIO(str);
    } catch (bdh localbdh) {
      K.warn(localbdh.getMessage());
    }

    this.lsn = new bcq(this.lsj, 0, localcIO);
    this.lsn.setLayoutData(new GridData(1808));

    Composite localComposite = new Composite(this.lsn, 0);
    localComposite.setLayout(new anc());

    this.lso = new VH(localComposite, 0);
    this.lso.initialize();
    this.lso.setLayoutData(new dGS(1.0F, 1.0F, (byte)1));
    this.lso.setVisible(false);

    Control localControl = a(localComposite);
    localControl.setLayoutData(new dGS(1.0F, 1.0F, (byte)1));

    this.lsn.setContent(localComposite);

    this.lsn.bqA().addListener(13, new bVd(this));

    this.lsj.open();

    return this.lsj;
  }

  private Control a(Composite paramComposite) {
    GridLayout localGridLayout = new GridLayout();
    localGridLayout.marginWidth = 0;
    localGridLayout.marginHeight = 0;
    localGridLayout.horizontalSpacing = 0;
    localGridLayout.verticalSpacing = 0;
    localGridLayout.marginBottom = 0;
    localGridLayout.marginLeft = 0;
    localGridLayout.marginRight = 0;
    localGridLayout.marginTop = 0;
    Composite localComposite = new Composite(paramComposite, 0);
    localComposite.setLayout(localGridLayout);

    this.lsk = new Composite(localComposite, 8519680);

    this.lsk.setLayout(new GridLayout(5, false));
    this.lsk.setLayoutData(new GridData(768));

    Button localButton1 = new Button(this.lsk, 0);
    localButton1.setText("<=");
    localButton1.addListener(13, new bVc(this));

    Button localButton2 = new Button(this.lsk, 0);
    localButton2.setText("=>");
    localButton1.addListener(13, new bVg(this));

    Label localLabel = new Label(this.lsk, 0);
    localLabel.setText("Address");

    Text localText = new Text(this.lsk, 2052);
    localText.setLayoutData(new GridData(768));

    Button localButton3 = new Button(this.lsk, 0);
    localButton3.setText("Go");

    this.lsi = new Browser(localComposite, 32768);
    this.lsi.setLayoutData(new GridData(1808));

    bVe localbVe = new bVe(this, localText);

    localButton3.addListener(13, localbVe);
    localText.addListener(14, localbVe);

    this.lsk.pack();

    this.lsi.addLocationListener(new bVi(this, localText));

    this.lsi.addProgressListener(new bVh(this));

    return localComposite;
  }

  public void a(aWp paramaWp) {
    this.lsh = paramaWp;
  }

  public void eQ(int paramInt1, int paramInt2) {
    this.lsj.setBounds(0, 0, paramInt1, paramInt2);
    this.lsj.layout(true, true);
  }

  public Browser getBrowser() {
    return this.lsi;
  }

  public void a(we paramwe) {
    this.lsm = paramwe;
  }

  public void cXA() {
    if (this.lsm == null) {
      throw new IllegalStateException("Impossible de préparer le browser sans handler");
    }

    if (this.lsl != null) {
      cXB();
    }

    this.lsl = new cMi(this.lsi);

    this.lsj.setBackground(new Color(Display.getCurrent(), 0, 0, 0));
    this.lsi.setBackground(new Color(Display.getCurrent(), 0, 0, 0));

    this.lsm.initialize();
  }

  public void clean() {
    if (this.lsm != null) {
      this.lsm.clean();
      this.lsm = null;
    }
    setUrl(null);
  }

  public void ke(boolean paramBoolean) {
    GridData localGridData = (GridData)this.lsk.getLayoutData();
    localGridData.exclude = (!paramBoolean);
    this.lsk.setVisible(paramBoolean);
    this.lsj.layout();
  }

  private void cXB() {
    this.lsl.dispose();
    this.lsl = null;
  }

  public void cXC() {
    if (this.lsm == null) {
      K.warn("Impossible de charger l'url, le handler est null !");
      return;
    }

    setUrl(this.lsm.getUrl());
  }

  public boolean setUrl(String paramString) {
    if (paramString == null) {
      return this.lsi.setUrl("about:blank");
    }
    this.lso.setVisible(true);
    this.lso.start();
    return this.lsi.setUrl(paramString);
  }

  public void ex(boolean paramBoolean)
  {
    this.lsn.ex(paramBoolean);
    this.lsj.layout(true, true);
  }

  public boolean a(String paramString, Object[] paramArrayOfObject) {
    return this.lsm.a(paramString, paramArrayOfObject);
  }

  public void start() {
    this.lsm.a(this);
  }

  public static void main(String[] paramArrayOfString) {
    bjY.bva();

    bjY.d(new bVj());

    bjY.bvb();
  }
}