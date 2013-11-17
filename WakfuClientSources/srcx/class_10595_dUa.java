import java.awt.Insets;

public class dUa extends Jg
{
  public static final String mrh = "progressBar";
  public static final String mri = "progressBarBorder";
  public static final String TAG = "progressBarAppearance";
  private cAf mrj = null;
  private cAf mrk = null;
  private Insets mrl = null;
  private aFG iIi = aFG.eck;

  private aAR[] mrm = new aAR[9];

  public static final int mrn = "innerBorder".hashCode();
  public static final int dUa = "position".hashCode();

  public void a(aNL paramaNL)
  {
    Object localObject;
    if ((paramaNL instanceof aAR)) {
      localObject = (aAR)paramaNL;

      switch (cXl.aHB[localObject.getPosition().ordinal()]) {
      case 1:
        this.mrm[0] = localObject;
        break;
      case 2:
        this.mrm[1] = localObject;
        break;
      case 3:
        this.mrm[2] = localObject;
        break;
      case 4:
        this.mrm[3] = localObject;
        break;
      case 5:
        this.mrm[4] = localObject;
        break;
      case 6:
        this.mrm[5] = localObject;
        break;
      case 7:
        this.mrm[6] = localObject;
        break;
      case 8:
        this.mrm[7] = localObject;
        break;
      case 9:
        this.mrm[8] = localObject;
      }

      dud();
    } else if ((paramaNL instanceof cAf)) {
      localObject = (cAf)paramaNL;
      if ((((cAf)localObject).getName() == null) || (((cAf)localObject).getName().equalsIgnoreCase("progressBar"))) {
        ((cAf)localObject).a(CH.bFV, new cXo(this), false);

        this.mrj = ((cAf)paramaNL);

        cOn();
      } else if (((cAf)localObject).getName().equals("progressBarBorder")) {
        ((cAf)localObject).a(CH.bFV, new cXm(this), false);

        this.mrk = ((cAf)paramaNL);

        cOn();
      }
    }

    super.a(paramaNL);
  }

  public String getTag()
  {
    return "progressBarAppearance";
  }

  public void setWidget(dOc paramdOc) {
    super.setWidget(paramdOc);

    if (this.mrj != null)
      cOn();
    else {
      dud();
    }

    due();
    duf();
  }

  public void setPosition(aFG paramaFG) {
    this.iIi = paramaFG;
    duf();
  }

  public void setInnerBorder(Insets paramInsets) {
    if (paramInsets == null)
      this.mrl = null;
    else {
      this.mrl = new Insets(paramInsets.top, paramInsets.left, paramInsets.bottom, paramInsets.right);
    }

    due();
  }

  public Insets getInnerBorder() {
    return this.mrl;
  }

  public void SW()
  {
    super.SW();
    dug();
    duh();
  }

  private void dud()
  {
    if ((this.aPS == null) || (!(this.aPS instanceof alP))) {
      return;
    }

    for (int i = 0; i < this.mrm.length; i++) {
      if (this.mrm[i] == null) {
        return;
      }
    }

    ((alP)this.aPS).setPixmaps(this.mrm[0], this.mrm[1], this.mrm[2], this.mrm[3], this.mrm[4], this.mrm[5], this.mrm[6], this.mrm[7], this.mrm[8]);
  }

  private void due()
  {
    if ((this.mrl == null) || (this.aPS == null) || (!(this.aPS instanceof alP))) {
      return;
    }

    alP localalP = (alP)this.aPS;
    localalP.setInnerBorder(this.mrl);
  }

  private void duf() {
    if (!(this.aPS instanceof alP)) {
      return;
    }

    alP localalP = (alP)this.aPS;
    localalP.setInnerPosition(this.iIi);
  }

  private void cOn()
  {
    if ((this.aPS == null) || (!(this.aPS instanceof alP))) {
      return;
    }

    alP localalP = (alP)this.aPS;

    if (this.mrj != null) {
      localalP.setColor(this.mrj.getColor(), "progressBar");
    }

    if (this.mrk != null)
      localalP.setColor(this.mrk.getColor(), "progressBarBorder");
  }

  private void dug()
  {
    if (this.mrj != null) {
      i(this.mrj);
      this.mrj = null;
    }

    if (this.mrk != null) {
      i(this.mrk);
      this.mrk = null;
    }
  }

  private void duh() {
    for (int i = 0; i < this.mrm.length; i++)
      if (this.mrm[i] != null) {
        i(this.mrm[i]);
        this.mrm[i] = null;
      }
  }

  public void c(bdj parambdj)
  {
    dUa localdUa = (dUa)parambdj;
    if (this.mrl != null) {
      localdUa.setInnerBorder(this.mrl);
    }
    localdUa.setPosition(this.iIi);
    super.c(parambdj);
  }

  public void aJ() {
    super.aJ();

    this.iIi = aFG.eck;
  }

  public void bc() {
    super.bc();

    this.mrj = null;
    this.mrk = null;

    for (int i = 0; i < this.mrm.length; i++)
      this.mrm[i] = null;
  }

  public boolean setXMLAttribute(int paramInt, String paramString, aKN paramaKN)
  {
    if (paramInt == mrn)
      setInnerBorder(paramaKN.gM(paramString));
    else if (paramInt == dUa)
      setPosition(aFG.gr(paramString));
    else {
      return super.setXMLAttribute(paramInt, paramString, paramaKN);
    }

    return true;
  }
}