import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class bcq extends Composite
{
  private cIO flZ;
  private bPT fma;
  private bPT fmb;
  private bPT fmc;
  private bPT fmd;
  private bPT fme;
  private bPT fmf;
  private bPT fmg;
  private bPT fmh;
  private pC fmi;
  private Control fmj;
  private boolean fmk;

  public bcq(Composite paramComposite, int paramInt, cIO paramcIO)
  {
    super(paramComposite, paramInt);

    this.flZ = paramcIO;

    this.fmi = new pC(this, 0);
    this.fmi.a(paramcIO.cDi());
    this.fmi.b(paramcIO.cDj());
    this.fmi.c(paramcIO.cDj());

    this.fma = new bPT(this, 0, paramcIO.cDn());
    this.fmb = new bPT(this, 0, paramcIO.cDm());
    this.fmc = new bPT(this, 0, paramcIO.cDo());

    this.fmd = new bPT(this, 0, paramcIO.cDk());
    this.fme = new bPT(this, 0, paramcIO.cDl());

    this.fmf = new bPT(this, 0, paramcIO.cDg());
    this.fmg = new bPT(this, 0, paramcIO.cDf());
    this.fmh = new bPT(this, 0, paramcIO.cDh());

    setLayout(new akn(this));

    this.fmk = true;
  }

  public void setContent(Control paramControl) {
    this.fmj = paramControl;
  }

  public void ex(boolean paramBoolean)
  {
    if (this.fmk == paramBoolean) {
      return;
    }

    this.fmk = paramBoolean;

    this.fma.setVisible(paramBoolean);
    this.fmb.setVisible(paramBoolean);
    this.fmc.setVisible(paramBoolean);
    this.fmd.setVisible(paramBoolean);
    this.fme.setVisible(paramBoolean);
    this.fmf.setVisible(paramBoolean);
    this.fmg.setVisible(paramBoolean);
    this.fmh.setVisible(paramBoolean);
    this.fmi.setVisible(paramBoolean);
  }

  public pC bqA()
  {
    return this.fmi;
  }
}