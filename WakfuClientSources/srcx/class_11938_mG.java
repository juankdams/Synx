import java.util.ArrayList;

public class mG extends aNb
  implements aLb
{
  private TL aRa;
  private final cSR aRb;

  public mG(cSR paramcSR, aMY paramaMY, int paramInt)
  {
    a(paramaMY);

    this.aRb = paramcSR;
    this.esM = paramInt;

    for (dIC localdIC : dIC.values()) {
      this.esK.add(new dzy(localdIC));
    }

    this.esL = (this.esK.isEmpty() ? null : (Lh)this.esK.get(0));

    ??? = byv.bFN().bFO();
    cyS localcyS = ((ud)((byz)???).bSt()).CG();
    if (localcyS != null)
      localcyS.a(this);
  }

  public boolean bH(int paramInt)
  {
    return this.aRb.containsKey(paramInt);
  }

  public boolean bI(int paramInt) {
    Boolean localBoolean = (Boolean)this.aRb.get(paramInt);
    return (localBoolean != null) && (localBoolean.booleanValue());
  }

  protected String getName()
  {
    return bU.fH().getString("guild.storageBox");
  }

  protected Or getPrefSize()
  {
    return new Or(400, 160);
  }

  protected int getIdealSizeMaxColumns()
  {
    return 10;
  }

  protected int getIdealSizeMaxRows()
  {
    return 4;
  }

  protected boolean up()
  {
    return true;
  }

  protected boolean uq()
  {
    return true;
  }

  protected boolean ur()
  {
    byz localbyz = byv.bFN().bFO();
    bMG localbMG = localbyz.bSt();
    aCl localaCl = localbMG.ay(localbyz.getId());
    if (localaCl == null) {
      return false;
    }

    aUJ localaUJ = localbMG.az(localaCl.aOC());
    if (localaUJ == null) {
      return false;
    }

    return localaUJ.a(cnm.hTm);
  }

  protected dBv us()
  {
    return this.aRa;
  }

  public final void a(aMY paramaMY) {
    this.aRa = new TL(paramaMY);
    dLE.doY().a(this, new String[] { "history" });
  }

  public int getSize()
  {
    return this.aRb.size();
  }

  public void bJ(int paramInt) {
    if (!uq()) {
      localObject = bU.fH().getString("error.guild.cannotDepositMoney");
      NW localNW = new NW(102, 1, (String)localObject, 2L);
      cBQ.cxL().a(localNW);
      return;
    }
    Object localObject = new aJs(Math.abs(paramInt));
    byv.bFN().aJK().d((cWG)localObject);
  }

  public void bK(int paramInt) {
    if (!uq()) {
      localObject = bU.fH().getString("error.guild.cannotWithdrawMoney");
      NW localNW = new NW(102, 1, (String)localObject, 2L);
      cBQ.cxL().a(localNW);
      return;
    }
    Object localObject = new aJs(-Math.abs(paramInt));
    byv.bFN().aJK().d((cWG)localObject);
  }

  public void ut()
  {
  }

  public void uu()
  {
  }

  public void uv()
  {
  }

  public void uw() {
  }

  public void r(short paramShort) {
  }

  public void bL(int paramInt) {
  }

  public void bM(int paramInt) {
  }

  public void a(aUJ paramaUJ) {
  }

  public void b(aUJ paramaUJ) {
  }

  public void a(aCl paramaCl) {
  }

  public void b(aCl paramaCl) {
  }

  public void a(bqd parambqd) {
  }

  public void b(bqd parambqd) {
  }

  public void c(aUJ paramaUJ) {
    dLE.doY().a(this, new String[] { "canTakeMoney" });
  }

  public void c(aCl paramaCl)
  {
    dLE.doY().a(this, new String[] { "canTakeMoney" });
  }

  public void c(bqd parambqd)
  {
  }

  public void bN(int paramInt) {
  }

  public void bO(int paramInt) {
  }

  public void clear() {
    super.clear();
    byz localbyz = byv.bFN().bFO();
    cyS localcyS = ((ud)localbyz.bSt()).CG();
    if (localcyS != null)
      localcyS.b(this);
  }
}