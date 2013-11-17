import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ayN extends dcj
  implements df
{
  private boolean dPT;
  private List dPU = new ArrayList();
  private Object[] dPV;

  public ayN(String[] paramArrayOfString)
  {
    this(paramArrayOfString, false);
  }

  public ayN(String[] paramArrayOfString, boolean paramBoolean) {
    this((Object[])paramArrayOfString, paramBoolean);
  }

  public ayN(cFg[] paramArrayOfcFg) {
    this(paramArrayOfcFg, true);
  }
  private ayN(Object[] paramArrayOfObject, boolean paramBoolean) {
    super((paramArrayOfObject.length + 1) * axA.SIZE);
    this.dPV = paramArrayOfObject;
    this.dPT = paramBoolean;
    for (int i = 0; i < paramArrayOfObject.length; i++) {
      axA localaxA = null;
      if (paramArrayOfObject[i] != null) {
        cpn localcpn = new cpn(paramArrayOfObject[i].toString(), paramBoolean);
        this.dPU.add(localcpn);
        localaxA = localcpn.sF();
      }
      a(axA.SIZE * i, localaxA);
    }
    a(axA.SIZE * paramArrayOfObject.length, null);
  }

  public void hb() {
    boolean bool = this.dPV instanceof cFg[];
    for (int i = 0; i < this.dPV.length; i++) {
      axA localaxA = bX(i * axA.SIZE);
      Object localObject = null;
      if (localaxA != null) {
        localObject = localaxA.getString(0L, this.dPT);
        if (bool) localObject = new cFg((String)localObject);
      }
      this.dPV[i] = localObject;
    }
  }

  public String toString() {
    String str = this.dPT ? "const wchar_t*[]" : "const char*[]";
    str = str + Arrays.asList(this.dPV);
    return str;
  }
}