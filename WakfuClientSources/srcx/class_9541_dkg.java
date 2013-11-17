import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class dkg
  implements dFU
{
  public boolean a(bdM parambdM)
  {
    Nn.an().info("Réception d'un message de contenu de MARKET");
    byte[] arrayOfByte = parambdM.brQ();
    int i = parambdM.brR();
    dlj localdlj = parambdM.brS();
    ArrayList localArrayList1;
    switch (dKI.lZj[localdlj.ordinal()]) {
    case 1:
      localArrayList1 = wQ.a(aXq.fcu, ByteBuffer.wrap(arrayOfByte));
      cPR.kzo.f(localArrayList1.iterator());
      break;
    case 2:
      localArrayList1 = new ArrayList();
      ArrayList localArrayList2 = new ArrayList();

      ByteBuffer localByteBuffer = ByteBuffer.wrap(arrayOfByte);
      int j = 0; for (int k = localByteBuffer.getInt(); j < k; j++) {
        localArrayList1.add(dhL.aJ(localByteBuffer));
      }
      j = 0; for (k = localByteBuffer.getInt(); j < k; j++) {
        localArrayList2.add(wQ.b(aXq.fcu, localByteBuffer));
      }
      cPR.kzo.d(localArrayList1, localArrayList2);
      break;
    }

    cPR.kzo.yO(i);
    cPR.kzo.cGO();
    return false;
  }

  public int vN() {
    return 20100;
  }
}