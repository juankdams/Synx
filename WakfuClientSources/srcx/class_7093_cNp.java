import org.apache.log4j.Logger;

public class cNp extends doA
{
  private static final aee bx = new bOO(new bWn());

  private static final qM by = new dzQ(new ec[] { new dLx("Pas de params", new dmb[0]), new dLx("Set (certaines propriétés seulement)", new dmb[] { new dmb("valeur", dnN.lnR) }) });
  private Kf ksF;
  private boolean ksG;
  private boolean ksH = false;

  private byte ksI = -1;
  private cYk ksJ;
  private CG ksK;
  public final cCH aAR = new bWm(this, 12);

  public qM aF()
  {
    return by;
  }

  public cNp()
  {
    aH();
  }

  public cNp(Kf paramKf) {
    this.ksF = paramKf;
    aH();
  }

  public void bc()
  {
    super.bc();
  }

  public Kf cFO() {
    return this.ksF;
  }

  public cNp cFP()
  {
    cNp localcNp;
    try {
      localcNp = (cNp)bx.Mm();
      localcNp.aOr = bx;
    } catch (Exception localException) {
      localcNp = new cNp();
      localcNp.aOr = null;
      localcNp.eXg = false;
      K.error("Erreur lors d'un checkOut sur un CharacBuff : " + localException.getMessage());
    }
    localcNp.ksF = this.ksF;
    localcNp.ksG = this.ksG;
    localcNp.ksI = this.ksI;
    return localcNp;
  }

  public void aH()
  {
    super.aH();
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.evp == null) || (this.ksF == null)) {
      jJ(true);
      return;
    }
    int i;
    switch (this.ksF.rQ())
    {
    case 4:
      if ((this.evp instanceof cjK)) {
        if (this.ksI > 0) {
          i = this.evp.d(this.ksF);
          if (i + this.ksI > 127)
            this.ksI = ((byte)(127 - i));
          this.evp.a(this.ksF, this.ksI);
        } else {
          this.evp.a(this.ksF);
        }
        this.ksH = true; } break;
    case 0:
      if (aIq().LA() != 1) {
        if (this.ksI > 0) {
          i = this.evp.d(this.ksF);
          if (i + this.ksI > 127)
            this.ksI = ((byte)(127 - i));
          this.evp.a(this.ksF, this.ksI);
        } else {
          this.evp.a(this.ksF);
        }
        this.ksH = true;
      } else {
        cfY localcfY = ((dKm)this.ksF).djm();
        if (localcfY != null) {
          if (this.ksI > 0) {
            int k = this.evp.d(this.ksF);
            if (k + this.ksI > 127)
              this.ksI = ((byte)(127 - k));
            this.evp.a(localcfY, this.ksI);
          } else {
            this.evp.a(localcfY);
          }
          this.ksH = true;
        }
      }

      break;
    default:
      if (this.ksI > 0) {
        j = this.evp.d(this.ksF);
        if (j + this.ksI > 127)
          this.ksI = ((byte)(127 - j));
        this.evp.a(this.ksF, (byte)(j + this.ksI));
      } else {
        this.evp.a(this.ksF);
      }
      this.ksH = true;
    }

    int j = this.ejP.LH() != null ? 1 : 0;
    if ((this.ksF == cfY.hBJ) && (j != 0)) {
      ((bIC)this.ejP.LH()).gN(this.evp.getId());
    }

    if ((this.ksF == cfY.hBj) && (j != 0)) {
      this.ejP.LH().AT();
    }

    if ((this.ksF == cfY.hBD) && (this.evp.b(eu.ayN))) {
      this.evp.a(eu.ayN).cpy();
    }

    if ((this.ksF == cfY.hBG) && (this.evp.b(eu.ayO)))
      this.evp.a(eu.ayO).cpy();
    Object localObject;
    if ((this.ksF == cfY.hBx) && (this.evp.b(eu.ayP)))
    {
      localObject = this.evp.a(eu.ayP);
      if (localObject == null)
      {
        K.error("charac nulle alors hasCharac renvoie true " + this.evp + ", " + this.evp.getClass().getSimpleName());
      }
      else ((cqm)localObject).cpB();
    }

    if ((this.ksF == cfY.hBZ) && (this.evp.b(eu.azj)) && (this.evp.b(eu.azc)))
    {
      this.evp.a(eu.azj).cpB();
      this.evp.a(eu.azc).cpB();
    }

    if (((this.ksF == cfY.hBf) || (this.ksF == cfY.hBq)) && 
      ((this.evp instanceof cdO))) {
      localObject = this.ejP.LB();
      if (localObject != null)
        ((UG)localObject).e((cdO)this.evp);
    }
  }

  public byte cFQ()
  {
    if (this.eWL == null) {
      return -1;
    }
    short s = cVC();
    if (((dpI)this.eWL).bep() > 1) {
      return (byte)((dpI)this.eWL).a(1, s, dNF.mei);
    }
    if (((dpI)this.eWL).bep() == 1) {
      return (byte)((dpI)this.eWL).a(0, s, dNF.mei);
    }
    return -1;
  }

  public void a(aVc paramaVc)
  {
    this.ksH = false;
    short s = cVC();
    if (this.eWL == null) {
      this.ksI = -1;
    }
    else if (((dpI)this.eWL).bep() == 1)
      this.ksI = ((byte)((dpI)this.eWL).a(0, s, dNF.mei));
    else {
      this.ksI = -1;
    }

    this.cxl = this.ksF.bJ();
  }

  public void aK()
  {
    if ((this.ksH) && (this.evp != null) && (this.ksF != null)) {
      if (this.ksI > 1) {
        b = (byte)(this.evp.d(this.ksF) - this.ksI);
        this.evp.a(this.ksF, b);
      } else {
        this.evp.j(this.ksF);
      }this.ksG = false;
      if ((this.ksF == cfY.hBj) && (this.ejP.LH() != null)) {
        this.ejP.LH().AT();
      }

      byte b = (this.ksF == cfY.hBf) || (this.ksF == cfY.hBq) ? 1 : 0;
      if (b != 0) {
        if (this.ksJ != null) {
          this.evp.q(this.ksJ.getX(), this.ksJ.getY(), this.ksJ.IB());
          this.evp.c(this.ksK);
        }
        UG localUG = this.ejP.LB();
        if (localUG != null) {
          if ((this.evp instanceof cdO))
            localUG.d((cdO)this.evp);
          localUG.f((cdO)this.evp);
        } else {
          K.error("pas de combat associé à la target " + this.evp.toString());
        }
      }
    }
    super.aK();
  }

  public boolean aL()
  {
    return false;
  }

  public boolean aM()
  {
    return true;
  }

  public boolean aN()
  {
    return false;
  }

  public void W(cYk paramcYk) {
    this.ksJ = paramcYk;
  }

  public cCH lJ()
  {
    return this.aAR;
  }

  public boolean bWq()
  {
    if ((this.ksF == cfY.hBf) || (this.ksF == cfY.hBq)) {
      return true;
    }
    return super.bWq();
  }
}