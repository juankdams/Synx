import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;

class boA
  implements bPA
{
  boA(Vm paramVm, DataOutputStream paramDataOutputStream)
  {
  }

  public boolean c(int paramInt, ArrayList paramArrayList)
  {
    for (int i = 0; i < paramArrayList.size(); i++) {
      bGq localbGq = (bGq)paramArrayList.get(i);
      try {
        this.fHZ.writeInt(paramInt);
        this.fHZ.writeInt(localbGq.eVe);
        this.fHZ.writeInt(localbGq.size);
        this.fHZ.writeInt(localbGq.gCF);
      } catch (IOException localIOException) {
        aZl.K.error(localIOException.getMessage(), localIOException);
      }
    }
    return true;
  }
}