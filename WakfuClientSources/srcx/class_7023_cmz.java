import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;

public class cmz
{
  protected static final Logger K = Logger.getLogger(cmz.class);
  protected final HashMap hRm = new HashMap();
  protected byte[] hRn;
  protected final ArrayList ffN = new ArrayList();

  private dfN hRo = new cVJ(this);

  protected cmz()
  {
    cno();
  }

  public boolean a(chL paramchL)
  {
    if (!this.ffN.contains(paramchL)) {
      return this.ffN.add(paramchL);
    }
    return false;
  }

  public boolean b(chL paramchL)
  {
    return this.ffN.remove(paramchL);
  }

  public dfN cnm() {
    return this.hRo;
  }

  public void d(dfN paramdfN) {
    this.hRo = paramdfN;
  }

  public FY I(String paramString, boolean paramBoolean)
  {
    FY localFY = (FY)this.hRm.get(paramString);
    if (localFY == null) {
      localFY = (FY)this.hRo.p();
      localFY.bV(paramString);
      localFY.aE(paramBoolean);
      this.hRm.put(paramString, localFY);
    }
    localFY.aE(paramBoolean);
    cno();

    for (chL localchL : this.ffN) {
      localchL.a(this);
    }
    return localFY;
  }

  public byte[] cnn()
  {
    if (this.hRn == null)
      cno();
    return this.hRn;
  }

  public int ls(String paramString)
  {
    FY localFY = (FY)this.hRm.get(paramString);
    if (localFY != null) {
      return localFY.getId();
    }
    return -1;
  }

  protected void cno()
  {
    ArrayList localArrayList = new ArrayList();
    int i = 1;

    for (Object localObject1 = this.hRm.entrySet().iterator(); ((Iterator)localObject1).hasNext(); ) { localObject2 = (Map.Entry)((Iterator)localObject1).next();
      arrayOfByte = ((FY)((Map.Entry)localObject2).getValue()).j();
      i += 1 + arrayOfByte.length;
      localArrayList.add(arrayOfByte);
    }
    byte[] arrayOfByte;
    localObject1 = ByteBuffer.allocate(i);
    ((ByteBuffer)localObject1).put((byte)localArrayList.size());
    for (Object localObject2 = localArrayList.iterator(); ((Iterator)localObject2).hasNext(); ) { arrayOfByte = (byte[])((Iterator)localObject2).next();
      ((ByteBuffer)localObject1).put((byte)arrayOfByte.length);
      ((ByteBuffer)localObject1).put(arrayOfByte);
    }

    this.hRn = ((ByteBuffer)localObject1).array();
  }

  public void at(byte[] paramArrayOfByte)
  {
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte);
    int i = localByteBuffer.get();
    Object localObject;
    for (int j = 0; j < i; j++) {
      localObject = new byte[localByteBuffer.get() & 0xFF];
      localByteBuffer.get((byte[])localObject);

      FY localFY = (FY)this.hRo.p();
      localFY.q((byte[])localObject);
      String str = localFY.Qg();

      this.hRm.put(str, localFY);
    }

    for (Iterator localIterator = this.ffN.iterator(); localIterator.hasNext(); ) { localObject = (chL)localIterator.next();
      ((chL)localObject).a(this);
    }
  }

  public boolean vM(int paramInt)
  {
    for (Map.Entry localEntry : this.hRm.entrySet()) {
      if (((FY)localEntry.getValue()).getId() == paramInt) {
        K.info("world " + paramInt + " found");
        return ((FY)localEntry.getValue()).Qf();
      }
    }
    K.info("world " + paramInt + " not found");
    return false;
  }

  public boolean lt(String paramString)
  {
    FY localFY = (FY)this.hRm.get(paramString);
    return (localFY != null) && (localFY.Qf());
  }

  public String vN(int paramInt)
  {
    for (Map.Entry localEntry : this.hRm.entrySet()) {
      if (((FY)localEntry.getValue()).getId() == paramInt)
        return ((FY)localEntry.getValue()).Qg();
    }
    return null;
  }

  public Collection cnp()
  {
    return this.hRm.values();
  }

  public FY lu(String paramString) {
    return (FY)this.hRm.get(paramString);
  }

  public void cnq() {
    cno();
    for (chL localchL : this.ffN)
      localchL.a(this);
  }

  public void w(int paramInt, boolean paramBoolean) {
    for (Map.Entry localEntry : this.hRm.entrySet())
      if (((FY)localEntry.getValue()).getId() == paramInt)
        ((FY)localEntry.getValue()).aF(paramBoolean);
  }
}