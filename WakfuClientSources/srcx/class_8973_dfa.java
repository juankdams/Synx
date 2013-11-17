import org.apache.log4j.Logger;

public final class dfa extends Vn
{
  private static final qM by = new dzQ(new ec[] { new dLx("valeur par PA, valeur par PM", new dmb[] { new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR) }), new dLx("valeur par PA, valeur par PM, fct level caster", new dmb[] { new dmb("valeur par PA", dnN.lnR), new dmb("valeur par PM", dnN.lnR), new dmb("Niveau du caster en multiplicateur de l'increment ", dnN.lnS) }) });

  private static final aee bx = new bOO(new UU());

  public qM aF()
  {
    return by;
  }

  public dfa() {
    aH();
  }

  public dfa cPl()
  {
    dfa localdfa;
    try {
      localdfa = (dfa)bx.Mm();
      localdfa.aOr = bx;
    } catch (Exception localException) {
      localdfa = new dfa();
      localdfa.aOr = null;
      localdfa.eXg = false;
      K.error("Erreur lors d'un checkOut sur un BestElementHpGainFunctionPaPm : " + localException.getMessage());
    }
    return localdfa;
  }

  protected void ah(short paramShort)
  {
    this.cpW = dzW.t(this);
  }

  protected void aiy()
  {
    aWl localaWl = aWl.c(this.ejP, this.cpW);
    localaWl.i(this.evo);
    localaWl.j(this.evp);
    localaWl.b(this.eWL);
    localaWl.kf(this.cxl);
    localaWl.ct((byte)1);
    localaWl.bmd();
    localaWl.ct((byte)2);
    localaWl.c(null, false);
  }

  protected void ac(short paramShort)
  {
    this.cAc = false;
  }

  protected void ad(short paramShort)
  {
  }

  protected void ae(short paramShort)
  {
  }

  protected float ag(short paramShort)
  {
    float f1 = ((dpI)this.eWL).nl(0);
    float f2 = ((cFp)this.eWL).xD(0);

    int i = ((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1 ? 1 : 0;
    if ((i != 0) && ((this.evo instanceof dHW)))
      f1 += f2 * cVC() * ((dHW)this.evo).nU();
    else {
      f1 = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    }
    return f1;
  }

  protected float af(short paramShort)
  {
    float f1 = ((dpI)this.eWL).nl(1);
    float f2 = ((cFp)this.eWL).xD(1);

    int i = ((dpI)this.eWL).a(2, cVC(), dNF.meh) == 1 ? 1 : 0;
    if ((i != 0) && ((this.evo instanceof dHW)))
      f1 += f2 * cVC() * ((dHW)this.evo).nU();
    else {
      f1 = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    }
    return f1;
  }

  public void bc()
  {
    super.bc();
  }
}