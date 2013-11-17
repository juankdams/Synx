import java.util.ArrayList;

class boc
  implements Runnable
{
  boc(bHc parambHc, byte[] paramArrayOfByte)
  {
  }

  public void run()
  {
    synchronized (bHc.a(this.fHm)) {
      int i = bHc.b(this.fHm).size();
      for (int j = 0; j < i; j++) {
        bcT localbcT = (bcT)bHc.b(this.fHm).get(j);
        localbcT.Y(this.fHl);
      }
    }
  }
}