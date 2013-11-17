public class cbh extends Vz
{
  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo)
  {
    if (paramdpI.eo() == bsj.fVh.getId()) {
      int i = ((Number)paramArrayOfObject[0]).intValue();
      bTI localbTI = bTI.dx((byte)i);

      lZ locallZ = cxo.ill.cLY();
      cxo.ilm.a(locallZ, localbTI);
      paramArrayOfObject[0] = locallZ.tP();
    }

    return bjv.format(paramString, paramArrayOfObject);
  }
}