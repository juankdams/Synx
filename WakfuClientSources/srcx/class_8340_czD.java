public class czD
{
  private final aGC doK;

  public czD(aGC paramaGC)
  {
    this.doK = paramaGC;
  }

  public JG a(dVO paramdVO)
  {
    Object localObject = null;
    switch (aqB.baz[dWm.Em(paramdVO.type).ordinal()]) {
    case 1:
      Gs localGs = (Gs)paramdVO.mvb.h(Gs.class);
      localObject = new bVA(this.doK, localGs.bOF, localGs.index);
      break;
    case 2:
      Ov localOv = (Ov)paramdVO.mvb.h(Ov.class);
      localObject = new dJy(this.doK, localOv.bOF, localOv.index);
      break;
    case 3:
      cwi localcwi = (cwi)paramdVO.mvb.h(cwi.class);
      localObject = new deX(this.doK, localcwi.bOF, localcwi.index);
      break;
    case 4:
      cGV localcGV = (cGV)paramdVO.mvb.h(cGV.class);
      localObject = new adt(this.doK, localcGV.bOF, localcGV.index);
    }

    return localObject;
  }
}