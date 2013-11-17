import java.util.BitSet;
import org.apache.log4j.Logger;

public class bJT extends doA
{
  private static final aee bx = new bOO(new bRn());

  private static final qM by = new dzQ(new ec[] { new dLx("Standard avec level du sort pour la creature", new dmb[] { new dmb("id du monstre à invoquer", dnN.lnQ) }), new dLx("Standard", new dmb[] { new dmb("id du monstre à invoquer", dnN.lnQ), new dmb("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe à donner)", dnN.lnS) }), new dLx("Spécifie que l'invocation est son propre controlleur (attention)", new dmb[] { new dmb("id du monstre à invoquer", dnN.lnQ), new dmb("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe à donner)", dnN.lnS), new dmb("controlleur = invocation : 1 sinon 0", dnN.lnS) }), new dLx("Spécifie la direction (par defaut celle du caster", new dmb[] { new dmb("id du monstre à invoquer", dnN.lnQ), new dmb("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe à donner)", dnN.lnS), new dmb("controlleur = invocation : 1 sinon 0", dnN.lnS), new dmb("Direction (-1 par défaut)", dnN.lnS) }), new dLx("Spécifie l'equipe", new dmb[] { new dmb("id du monstre à invoquer", dnN.lnQ), new dmb("level de l'invoc (-1 = niveau du sort, -2 = niveau du caster, -3 = niveau min du mob, > 0 valeur fixe à donner)", dnN.lnS), new dmb("controlleur = invocation : 1 sinon 0", dnN.lnS), new dmb("Direction (-1 par défaut)", dnN.lnS), new dmb("Equipe (0 = rouge, 1=bleue)", dnN.lnS) }) });
  private long aDR;
  private csi aDS;
  private aZx gLL;
  private byte bml;
  private boolean gLM = false;

  public cCH aDV = new bRl(this, 8);

  public cCH aDW = new bRk(this);

  public qM aF()
  {
    return by;
  }

  public bJT()
  {
    aH();
  }

  public void aH() {
    super.aH();
    this.eWR.set(2130);
  }

  public bJT bRB()
  {
    bJT localbJT;
    try {
      localbJT = (bJT)bx.Mm();
      localbJT.aOr = bx;
    } catch (Exception localException) {
      localbJT = new bJT();
      localbJT.aOr = null;
      localbJT.eXg = false;
      K.error("Erreur lors d'un checkOut sur un Summon : " + localException.getMessage());
    }
    localbJT.aDS = null;
    localbJT.gLL = null;
    localbJT.gLM = false;
    return localbJT;
  }

  protected void a(aVc paramaVc, boolean paramBoolean)
  {
    if ((this.aDS != null) && ((this.evo instanceof dhJ))) {
      K.info("Instanciation d'une nouvelle invocation avec un id de " + this.aDR);

      dhJ localdhJ1 = (dhJ)this.evo;
      dhJ localdhJ2 = localdhJ1.b(this.aDS.cqG(), this.eUw, this.aDS.Rw(), this.aDS, this.gLM, this.gLL);
      if (bkt())
        this.aDS.dF(localdhJ2.cgE());
      localdhJ2.jh(true);

      b(paramaVc, paramBoolean);
      if ((bkt()) && (((dhJ)this.evo).afv() != null))
        ((dhJ)this.evo).afv().ay(localdhJ2);
    }
  }

  public void a(aVc paramaVc)
  {
    short s1 = -1;
    short s2 = -1;

    this.aDR = this.ejP.LD().P((byte)1);

    if (this.eWL == null) {
      return;
    }
    this.cxl = ((dpI)this.eWL).a(0, cVC(), dNF.meh);
    int i;
    if (((dpI)this.eWL).bep() > 1) {
      i = ((dpI)this.eWL).a(1, cVC(), dNF.meh);
    }
    else {
      i = -1;
    }
    drn localdrn = ahJ.auG();
    Object localObject;
    switch (i) {
    case -1:
      if (this.eWM != null) {
        s1 = cVC();
        s2 = s1;
      } else { K.error("[Summon] Impossible d'invoquer une creature avec le mm niveau que le sort : l'effectContainer est null");
        return;
      }
      break;
    case -2:
      if (this.evo != null) {
        s1 = ((dhJ)this.evo).nU();
        s2 = ((dhJ)this.evo).nU();
      } else { K.error("[Summon] Impossible d'invoquer une creature avec le mm niveau que le caster car celui-ci est null");
        return;
      }
      break;
    case -3:
      if (localdrn != null) {
        localObject = localdrn.dQ((short)this.cxl);
        if (localObject != null) {
          s1 = ((dGf)localObject).alM();
          s2 = ((dGf)localObject).alM();
        }
      }
      if (s1 == -1) { K.error("[Summon] Impossible d'invoquer une creature, on ne peut pas recupérer son niveau");
        return;
      }
      break;
    default:
      if (i > 0) {
        s1 = (short)i;
        s2 = (short)i;
      } else { K.error("[Summon] Erreur de saisie : le levelType doit etre positif ou -1 ou -2, là il vaut " + i);
        return;
      }
      break;
    }
    this.gLM = ((((dpI)this.eWL).bep() > 2) && (((dpI)this.eWL).a(2, cVC(), dNF.mei) >= 1));

    if (((dpI)this.eWL).bep() > 3) {
      int j = ((dpI)this.eWL).a(3, cVC(), dNF.meh);
      localObject = CG.eu(j);
    } else {
      localObject = CG.bFP;
    }

    if (((dpI)this.eWL).bep() > 4) {
      this.bml = ((byte)((dpI)this.eWL).a(4, cVC(), dNF.meh));
    }
    else if ((this.evo instanceof dhJ)) {
      this.bml = ((dhJ)this.evo).Fx();
    }

    if (this.aDS == null)
      this.aDS = new csi((short)this.cxl, "", -1, s1, s2);
    this.aDS.dk(s1);
    this.aDS.ej(this.aDR);
    this.aDS.c((CG)localObject);
    this.aDS.as(this.bml);

    if (this.gLL == null)
      this.gLL = new aZx();
    if (localdrn != null) {
      bhh localbhh = localdrn.dQ((short)this.cxl);
      for (int n : localbhh.afB())
        this.gLL.a(cfY.vg(n), (byte)1);
    }
  }

  public boolean aL()
  {
    return true;
  }

  public boolean aM()
  {
    return false;
  }

  public boolean aN()
  {
    return true;
  }

  public void nt()
  {
    this.aDS = null;
    this.gLL = null;
    super.nt();
  }

  public cCH nu()
  {
    return this.aDV;
  }

  public cCH lJ()
  {
    return this.aDW;
  }

  public csi bRC()
  {
    return this.aDS;
  }
}