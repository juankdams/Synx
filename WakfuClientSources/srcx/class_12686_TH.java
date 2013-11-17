import org.apache.log4j.Logger;

public class TH extends Vz
{
  private static final Logger K = Logger.getLogger(TH.class);

  protected String a(dpI paramdpI, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, cFo paramcFo) {
    bfE localbfE = null;
    if (paramdpI.eo() == bsj.fPn.getId())
    {
      int i = ((Number)paramArrayOfObject[0]).intValue();

      localbfE = cxo.ilm.bu((short)i);
      localbfE.d(paramcFo.nU(), true);
      lZ locallZ = cxo.ill.cLY();
      cxo.ilm.a(locallZ, localbfE.bsL());

      paramArrayOfObject[0] = locallZ.tP();
    }

    return bjv.format(paramString, paramArrayOfObject);
  }
}