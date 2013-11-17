import java.util.ArrayList;

public class cbb extends Vz
{
  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo)
  {
    cjK localcjK = b(paramdpI.eo(), paramArrayOfObject);
    lZ locallZ = cxo.ill.cLY();
    short s = paramcFo.nU();

    if (localcjK != null)
    {
      int i = (!paramcFo.cAR()) && (paramdpI.eo() != cxo.ild) && (paramdpI.eo() != cxo.ile) ? 1 : 0;

      if (i != 0) {
        localObject2 = cxo.feH.b(cxo.lm, (short)(int)localcjK.clt(), new Object[0]);
        locallZ.a((CharSequence)localObject2);
        if (!this.cAx) {
          String str = cxo.n(paramdpI);
          if ((str != null) && (str.length() > 0)) {
            locallZ.a(" ").a(str);
          }

        }

        locallZ.a(b(paramdpI));

        if ((paramdpI.eo() == bsj.fSm.getId()) || (paramdpI.eo() == bsj.fVr.getId()))
        {
          int j = (int)(localcjK.vy(0) + localcjK.vy(1) * s);
          locallZ.a("\n").a(cxo.ilj);
          locallZ.a(cxo.feH.getString(paramdpI.eo() == bsj.fVr.getId() ? cxo.GP : cxo.GO, new Object[] { Integer.valueOf(j) }));
        }

      }

      if (paramdpI.eo() == cxo.ild) {
        locallZ.a(cxo.ilm.b(cxo.ill.cLY(), "glyph").tP()).a(" ");
        locallZ.a(cxo.a((aAn)localcjK, s));
      } else if (paramdpI.eo() != cxo.ilc) {
        localObject2 = cxo.a(new axj(localcjK, s, paramcFo.cAQ()));
        if (((ArrayList)localObject2).size() != 0) {
          if (i != 0)
            locallZ.a("\n").a(cxo.c((ArrayList)localObject2, !paramString.contains("\n")));
          else {
            locallZ.a(cxo.c((ArrayList)localObject2, false));
          }
        }
      }

    }

    if ((paramArrayOfObject == null) || (paramArrayOfObject.length == 0)) {
      return bjv.format(paramString, new Object[] { locallZ.tP() });
    }
    Object localObject1 = paramArrayOfObject[0];
    paramArrayOfObject[0] = locallZ.tP();
    Object localObject2 = bjv.format(paramString, paramArrayOfObject);
    paramArrayOfObject[0] = localObject1;
    return localObject2;
  }

  public static cjK b(int paramInt, Object[] paramArrayOfObject)
  {
    if (paramInt == bsj.fSh.getId())
      return bMF.bUo().ff(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSo.getId())
      return bMF.bUo().fh(((Number)paramArrayOfObject[0]).intValue());
    if ((paramInt == bsj.fSn.getId()) || (paramInt == bsj.fSG.getId()))
      return bMF.bUo().fj(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fUW.getId())
      return bMF.bUo().fo(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fVr.getId())
      return bMF.bUo().fo(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSm.getId())
      return bMF.bUo().fi(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSl.getId())
      return bMF.bUo().fl(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSk.getId())
      return bMF.bUo().fl(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSH.getId())
      return bMF.bUo().fo(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSX.getId())
      return bMF.bUo().fo(((Number)paramArrayOfObject[0]).intValue());
    if (paramInt == bsj.fSq.getId()) {
      return bMF.bUo().fp(((Number)paramArrayOfObject[0]).intValue());
    }
    return null;
  }
}