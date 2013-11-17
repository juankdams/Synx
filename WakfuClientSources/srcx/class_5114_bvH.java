import com.ankamagames.framework.graphics.engine.entity.EntitySprite;

public class bvH extends bmb
{
  private static final bNa cqm = new bNa();
  private static final String gfY = "selectedZone";
  private static final String gfZ = "tex0Dim";
  private uz cRZ;
  private bjI gga;
  private cSR ggb;

  private static cgR bDt()
  {
    return new cgR(new cbW[] { new cbW("selectedZone", bHf.gFo), new cbW("tex0Dim", bHf.gFo) });
  }

  public bvH()
  {
    super(cBQ.cxL().itR + "mappemonde.cgfx", "nation", bDt());
  }

  public void c(uz paramuz) {
    this.cRZ = paramuz;
    bDu();
  }

  public void b(bjI parambjI) {
    this.gga = parambjI;
    bDu();
  }

  public void a(cSR paramcSR)
  {
    this.ggb = paramcSR;
    bDu();
  }

  public void rn(int paramInt) {
    this.fDt.setFloat("selectedZone", paramInt);
  }

  public void ro(int paramInt) {
    this.fDt.setFloat("tex0Dim", paramInt);
  }

  private void bDu() {
    if ((this.cRZ == null) || (this.gga == null) || (this.ggb == null)) {
      return;
    }
    cSJ localcSJ = this.cRZ.wn(0);

    for (dmn localdmn = this.ggb.yF(); localdmn.hasNext(); ) {
      localdmn.fl();
      localdmn.zY();
      int i = this.gga.get(localdmn.zY());
      bNa localbNa = (bNa)localdmn.value();
      if (localbNa == null)
        cqm.k(1.0F, 1.0F, 1.0F, 1.0F);
      else {
        cqm.k(1.0F, localbNa.QC(), localbNa.QD(), localbNa.QE());
      }
      localcSJ.a(i, 0, cqm);
    }

    this.cRZ.cqy();
  }

  public void c(EntitySprite paramEntitySprite)
  {
    paramEntitySprite.a(bxa(), bxb(), this.fDt);
    paramEntitySprite.i(this.cRZ);
  }

  public cgR bDv() {
    if (!aNh.eth.bdY()) {
      this.fDt.setFloat("gColorScale", cmL.hSl.getFloat("gColorScale"));
    }
    return this.fDt;
  }

  public String toString()
  {
    return "MapShader{m_maskTexture=" + this.cRZ.getFileName() + '}';
  }
}