import com.sun.jna.Native;
import java.util.ArrayList;

public class po
{
  private bIc aVn = null;
  private String aVo;
  private byte[] aVp;
  private String[] _strings;

  public bIc ww()
  {
    return this.aVn;
  }

  public int wx()
  {
    return this.aVn.gGG.intValue();
  }

  public String getSource()
  {
    return this.aVo;
  }

  public int getStatusCode()
  {
    return this.aVn.gGG.intValue() & 0xFFFF;
  }

  public int wy()
  {
    return this.aVn.gGD.intValue();
  }

  public int getLength()
  {
    return this.aVn.gGB.intValue();
  }

  public String[] wz()
  {
    return this._strings;
  }

  public bvf wA()
  {
    switch (this.aVn.gGH.intValue()) {
    case 0:
    case 4:
      return bvf.geS;
    case 16:
      return bvf.geU;
    case 8:
      return bvf.geT;
    case 1:
      return bvf.geQ;
    case 2:
      return bvf.geR;
    case 3:
    case 5:
    case 6:
    case 7:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15: } throw new RuntimeException("Invalid type: " + this.aVn.gGH.intValue());
  }

  public byte[] getData()
  {
    return this.aVp;
  }

  public po(axA paramaxA) {
    this.aVn = new bIc(paramaxA);
    this.aVo = paramaxA.getString(this.aVn.size(), true);

    if (this.aVn.gGP.intValue() > 0) {
      this.aVp = paramaxA.i(this.aVn.gGQ.intValue(), this.aVn.gGP.intValue());
    }

    if (this.aVn.gGI.intValue() > 0) {
      ArrayList localArrayList = new ArrayList();
      int i = this.aVn.gGI.intValue();
      long l = this.aVn.gGM.intValue();
      while (i > 0) {
        String str = paramaxA.getString(l, true);
        localArrayList.add(str);
        l += str.length() * Native.cuL;
        l += Native.cuL;
        i--;
      }
      this._strings = ((String[])localArrayList.toArray(new String[0]));
    }
  }
}