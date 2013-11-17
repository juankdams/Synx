import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public class byo extends Su
  implements cRg, caY, dgG
{
  public static final boolean gjZ = true;
  private short cZu;
  private final bND gka = new bND();

  private final float gkb = 0.0F;

  private final czo gkc = new czo();
  private long Tj;
  private aIA gkd;
  private final adz gke = new adz();

  private short gkf = -1;
  private short gkg = -1;
  private boolean gkh;
  private aMl gki = null;
  private dAm gkj;

  protected byo()
  {
    this.lda = JD();
    this.bkM = 1;
    bFw();
    this.Tj = 0L;
    this.iIO = bdi.fnz;
  }

  public static byo bFu() {
    return new byo();
  }

  public boolean JD()
  {
    return true;
  }

  public void JC()
  {
    if ((this.iIO instanceof bdi)) {
      bdi localbdi = (bdi)this.iIO;
      this.lcY = new aLp(localbdi.dhn(), this.cZu);
      this.ctk = new cdz(this);
    }
  }

  public void bFv()
  {
    super.bFv();
    JN();

    eu[] arrayOfeu = eu.values();
    for (int i = 0; i < arrayOfeu.length; i++) {
      eu localeu = arrayOfeu[i];
      a(d(localeu));
    }

    this.gka.a(((bdi)this.iIO).brj(), (short)(this.cZu / 2));
    byv.bFN().bFO().bGI();
    dLE.doY().a(this, new String[] { "level", "levelValue", "nameAndLevel" });
  }

  public long auX() {
    return getId();
  }

  public aik auY() {
    return ctr.idl;
  }

  public int JE()
  {
    return 0;
  }

  public int dU(int paramInt)
  {
    return 0;
  }

  public int dV(int paramInt)
  {
    return 0;
  }

  public drn adx()
  {
    return cMn.cFp();
  }

  public PX aeu()
  {
    PX localPX = super.aeu();
    if (localPX != null) {
      return localPX;
    }

    if (this.iIO != null) {
      return ((bdi)this.iIO).aeu();
    }
    return null;
  }

  public ayn FB()
  {
    ArrayList localArrayList = new ArrayList();
    cSE.kEZ.a(new bmZ(this), localArrayList);

    return !localArrayList.isEmpty() ? (ayn)localArrayList.get(0) : null;
  }

  public int oc()
  {
    if ((this.iIO == null) || (!(this.iIO instanceof bdi))) {
      return 0;
    }
    int i = super.oc();
    if (i != 0) {
      return i;
    }

    return ((bdi)this.iIO).ajB();
  }

  public apX bV(long paramLong)
  {
    return this.gka.bV(paramLong);
  }

  public Iterable aeA()
  {
    return this.gka.aeA();
  }

  protected String JG()
  {
    return "Smiley_" + uO();
  }

  protected String JH()
  {
    return "npcGfxPath";
  }

  public void initialize()
  {
    if (this.iIO == null) {
      K.error("On essaie d'initialiser un monster qui ne possede pas de BreedInfo");
      return;
    }
    bdi localbdi = (bdi)this.iIO;

    cew localcew = aeL();
    localcew.fR((byte)4);
    localcew.kY(false);
    setName(localbdi.getName());
    this.gka.a(localbdi.brj(), this.cZu);
    JC();
    a(localbdi);
    b(localbdi);
  }

  protected void aeX()
  {
  }

  private void a(bdi parambdi) {
    if (parambdi.afC() != null)
      for (int k : parambdi.afC()) {
        dKm localdKm = dKm.CM(k);
        if (localdKm != null) {
          b(localdKm);
          a(localdKm);
        } else {
          K.error("id d'une propriété de base (World) incorrect :" + k);
        }
      }
  }

  private void b(bdi parambdi)
  {
    this.cti.reset();
    short[] arrayOfShort = parambdi.amY();
    if ((arrayOfShort != null) && (arrayOfShort.length > 1))
      for (int i = 0; i < arrayOfShort.length; i = (short)(i + 3)) {
        short s1 = arrayOfShort[i];

        bgJ localbgJ = ayK();
        if (localbgJ != null) {
          localbgJ.py(s1);
        }
        short s2 = arrayOfShort[(i + 1)];

        if (s2 == -1) {
          s2 = nU();
        }
        aVc.bka();
        bZG localbZG = bZG.a(this.ldc, this, s1, s2, arrayOfShort[(i + 2)] == 0);
        localbZG.bky();
        localbZG.i(this);
        localbZG.cel();
        localbZG.c(null, false);
      }
  }

  protected void bFw()
  {
    super.bFw();
    new aAl(this, this.gkc.cwe(), null);
    new lf(this, this.gkc.cwg(), null);
    new lf(this, this.gkc.cwf(), null);
    new aV(this, this.gkc.aQP(), null);
    new cGy(this, this.gkc.cwh(), null);
    new dSk(this, this.gkc.cwi(), null);
    new aud(this, this.gkc.cwj(), null);
  }

  public void bc()
  {
    super.bc();
  }

  public void adZ()
  {
    super.adZ();
    if (cQK())
      bFy();
  }

  public void a(aPH paramaPH)
  {
    super.a(paramaPH);
    if (this.gkd != null) {
      this.gkd.aUu();
      this.gkd = null;
    }
    if (bFD() != null) {
      bdi localbdi = (bdi)this.iIO;
      b(localbdi);
      d(localbdi);
    }
  }

  public final void bFx()
  {
    ayK().px(25);
    Iterable localIterable = aeA();
    for (Iterator localIterator1 = localIterable.iterator(); localIterator1.hasNext(); ) { localapX = (apX)localIterator1.next();
      bzj localbzj = localapX.bsL();
      if ((localapX.nU() > 0) || (localbzj.bHZ()))
      {
        if (localbzj.bHY())
          for (dpI localdpI : localapX)
            localdpI.a(localapX, this, ayL(), bsj.bAv(), fa(), fb(), fc(), this, null);
      }
    }
    apX localapX;
  }

  public void aea()
  {
    if (aJs()) {
      Su localSu = adM();

      if (localSu.aJp() == SB.ctB) {
        aW(localSu);
      }
    }
    super.aea();

    if ((bFD() != null) && (!isDead()))
    {
      b(bFD());
    }

    if (!byd()) {
      cQY().acY();
    }

    if (cQA()) {
      long l = getId();
      aeQ().a(new bmU(this, l));
    }
    else
    {
      aeK();

      arl localarl = aeQ();
      if (this.lcZ)
        if (!localarl.df(getId())) {
          bFy();
        } else {
          this.lcZ = false;
          aeK();
        }
    }
  }

  public void bFy()
  {
    if (adF()) {
      adL().afi();
    }

    cew localcew = aeL();
    if ((cQK()) || (c(dKm.lWY)) || (!bFD().amR()))
    {
      localcew.setVisible(false);
      localcew.gR(true);
      cWz.cKu().a(this, true);
    } else {
      chA.cjx().it(this.aTz);
      chA.cjx().a(this, dKm.lWV);

      cWz.cKu().a(this, true);
      localcew.eq("AnimStatiqueCadavre");
      localcew.setVisible(true);
      localcew.id(dLw.mbg.asR());
    }
  }

  public void release()
  {
    bc();
  }

  protected bhh JI()
  {
    return bdi.fnz;
  }

  protected byte JJ()
  {
    return 1;
  }

  public void setName(String paramString)
  {
    if (((paramString == null) || (paramString.length() == 0)) && 
      ((this.iIO instanceof bdi))) {
      paramString = ((bdi)this.iIO).getName();
    }

    super.setName(paramString);
  }

  public baD JL()
  {
    return dCT.lLp;
  }

  public short Rw()
  {
    if (this.iIO == null) {
      return 0;
    }
    return this.iIO.uO();
  }

  public short nU()
  {
    return this.cZu;
  }

  public float JK()
  {
    return 0.0F;
  }

  public aEv JF()
  {
    return this.gkc;
  }

  public bND bFz()
  {
    return this.gka;
  }

  public void aQ(short paramShort)
  {
    this.cZu = paramShort;
  }

  public long hf() {
    return this.Tj;
  }

  public void aS(long paramLong) {
    this.Tj = paramLong;
  }

  public aIA bFA() {
    return this.gkd;
  }

  public void a(aIA paramaIA) {
    this.gkd = paramaIA;
  }

  public void fz(boolean paramBoolean)
  {
    super.fz(paramBoolean);
  }

  protected cvY adR()
  {
    return new dMi(this);
  }

  public boolean rv(int paramInt) {
    return !this.gke.contains(paramInt);
  }

  public void s(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      this.gke.remove(paramInt);
    else
      this.gke.hL(paramInt);
  }

  public int nn()
  {
    return this.iIO.nn();
  }

  public void D(short paramShort1, short paramShort2)
  {
    bdi localbdi = cMn.cFp().dP(paramShort1);

    c(localbdi);
    aQ(paramShort2);
    cew localcew = new cew(this);
    c(localcew);
    aZx localaZx = cRc();
    if (localaZx != null) {
      localaZx.reset();
    }
    initialize();

    localcew.asZ();

    Tn localTn = cWz.cKu().ji(hf());
    if (localTn != null)
      localTn.b(this);
  }

  public byte JM()
  {
    return 1;
  }

  public short bFB()
  {
    if (this.gkf > 0) {
      return this.gkf;
    }

    if ((this.iIO instanceof bdi)) {
      return (short)Math.min(((bdi)this.iIO).bFB(), 6);
    }
    return 0;
  }

  public short amU()
  {
    if (this.gkg > 0) {
      return this.gkg;
    }

    if ((this.iIO instanceof bdi)) {
      return (short)Math.min(((bdi)this.iIO).amU(), 6);
    }
    return 0;
  }

  public boolean bFC() {
    return (amU() > 0) && (bFB() > 0);
  }

  public boolean isDead()
  {
    return (super.isDead()) || (c(dKm.lWV));
  }

  public void ax(Su paramSu)
  {
  }

  public bdi bFD() {
    if (!(this.iIO instanceof bdi)) {
      K.error("Un NPC n'a pas de breed de type MonsterBreed " + this.iIO + ", mob ID = " + this.aTz);
    }
    return (bdi)super.aJp();
  }

  protected void aen()
  {
    super.aen();
    bcg.b(bFE(), this);
    bcg.b(bFF(), this);
  }

  protected void aeo()
  {
    super.aeo();
    bcg.c(bFE(), this);
    bcg.c(bFF(), this);
  }

  protected void aep()
  {
    super.aep();
    bcg.a(bFE(), this);
    bcg.a(bFF(), this);
  }

  public aMl bFE()
  {
    bdi localbdi = bFD();
    if (localbdi == null) {
      return null;
    }
    return localbdi.brl();
  }

  private aMl bFF() {
    return this.gki;
  }

  public void b(aMl paramaMl) {
    this.gki = paramaMl;
  }

  public void JN()
  {
    ((aLp)cQY()).a(this);
    bXT.hnW.a(aeU());
  }

  public void JO()
  {
    ((aLp)cQY()).b(this);
    bXT.hnW.b(aeU());
  }

  public void a(Kf paramKf)
  {
    super.a(paramKf);

    if (paramKf == dKm.lXm) {
      this.gkj = new F(this);
    }

    if (this.gkj == null) {
      return;
    }

    this.gkj.a(paramKf);
  }

  public void b(Kf paramKf)
  {
    super.b(paramKf);

    if (this.gkj == null) {
      return;
    }

    this.gkj.b(paramKf);
  }

  public void a(bXL parambXL)
  {
    super.a(parambXL);

    if (this.gkj == null) {
      return;
    }

    this.gkj.a(parambXL);
  }

  public void a(int paramInt, Object paramObject)
  {
    super.a(paramInt, paramObject);

    if (this.gkj == null) {
      return;
    }

    this.gkj.a(paramInt, paramObject);
  }

  public void a(dAm paramdAm) {
    this.gkj = paramdAm;
  }

  public String getName()
  {
    if (F.a(this)) {
      return bU.fH().getString("hooded.monster");
    }
    return super.getName();
  }

  public boolean a(afC paramafC)
  {
    return afC.cYA.a(paramafC);
  }

  public int bFG() {
    return bAA.c(nU(), bFD().brm());
  }
}