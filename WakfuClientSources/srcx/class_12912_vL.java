import org.apache.log4j.Logger;

public class vL
  implements bWU, cyh
{
  protected static Logger K = Logger.getLogger(vL.class);
  private long bkH;
  private cYq bkI;
  private cYq bkJ;
  private String hh;
  private String aGr;
  private long bkK;
  private boolean bkL = true;
  private byte bkM;
  private byte bkN = 0;

  private byte bkO = 2;
  private aoL bkP = new aoL();

  private byte bkQ = 2;
  private aoL bkR = new aoL();

  private static long bkS = -1L;
  private boolean aHd;
  private static final aee aER = new bOO(new qA());

  private static int bkT = 0;

  public static vL EL() {
    vL localvL;
    try {
      localvL = (vL)aER.Mm();
      localvL.aHd = true;
      bkT += 1;
    } catch (Exception localException) {
      localvL = new vL();
      K.error("Erreur lors d'un checkOut sur un message de type CreateGuildRequestMessage : " + localException.getMessage());
    }
    return localvL;
  }

  public void aJ() {
    this.bkO = 2;
    this.bkQ = 2;
  }

  public void bc() {
    this.bkH = -1L;
    this.bkI = null;
    this.bkJ = null;
    this.aGr = null;
    this.hh = null;
    this.bkO = 0;
    this.bkQ = 0;
    this.bkK = -1L;
    this.bkN = 0;
    this.bkP.clear();
    this.bkR.clear();
  }

  public void release() {
    if (this.aHd)
      try {
        aER.y(this);
        bkT -= 1;
        this.aHd = false;
      } catch (Exception localException) {
        K.error("Exception levee", localException);
      }
    else
      bc();
  }

  public vL()
  {
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, dxL paramdxL)
  {
    this(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramdxL, true);
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, dxL paramdxL, boolean paramBoolean) {
    a(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramBoolean);
    e(paramdxL);
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, int paramInt1, int paramInt2, int paramInt3) {
    this(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramInt1, paramInt2, paramInt3, true);
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    a(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramBoolean);
    a(0, 0, paramInt1, paramInt2, paramInt3);
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, short paramShort, byte paramByte5, byte paramByte6) {
    this(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramByte3, paramByte4, paramShort, paramByte5, paramByte6, true);
  }

  public vL(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, short paramShort, byte paramByte5, byte paramByte6, boolean paramBoolean) {
    a(paramString1, paramString2, paramLong, paramByte1, paramByte2, paramBoolean);
    a(paramByte6, paramByte5, paramByte3, paramByte4, paramShort);
  }

  private void a(String paramString1, String paramString2, long paramLong, byte paramByte1, byte paramByte2, boolean paramBoolean) {
    EM();
    this.hh = (paramString1 != null ? paramString1 : "");
    this.aGr = (paramString2 != null ? paramString2 : "");
    this.bkK = paramLong;
    this.bkM = paramByte1;
    this.bkN = paramByte2;
    this.bkL = paramBoolean;
  }

  public void c(vL paramvL) {
    this.bkH = paramvL.bkH;
    this.hh = paramvL.hh;
    this.aGr = paramvL.aGr;
    this.bkK = paramvL.bkK;
    this.bkM = paramvL.bkM;
    this.bkN = paramvL.bkN;
    this.bkL = paramvL.bkL;

    if (paramvL.bkI != null) {
      this.bkI = new cYq(paramvL.bkI);
    }
    if (paramvL.bkJ != null) {
      this.bkJ = new cYq(paramvL.bkJ);
    }
    this.bkO = paramvL.bkO;
    this.bkQ = paramvL.bkQ;

    this.bkP.clear();
    cHu localcHu;
    if (!paramvL.bkP.isEmpty()) {
      localcHu = paramvL.bkP.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        this.bkP.put(localcHu.bic(), localcHu.value());
      }
    }

    this.bkR.clear();
    if (!paramvL.bkR.isEmpty()) {
      localcHu = paramvL.bkR.aBa();
      while (localcHu.hasNext()) {
        localcHu.fl();
        this.bkR.put(localcHu.bic(), localcHu.value());
      }
    }
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (this.bkI == null)
      this.bkI = new cYq(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    else
      this.bkI.set(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (this.bkJ == null)
      this.bkJ = new cYq(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
    else
      this.bkJ.set(0, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }

  public void e(dxL paramdxL)
  {
    this.bkI = new cYq(paramdxL);
  }

  public void f(dxL paramdxL) {
    this.bkJ = new cYq(paramdxL);
  }

  public void aH(long paramLong) {
    this.bkH = paramLong;
  }

  public void EM() {
    this.bkH = (bkS--);
  }

  public long EN() {
    return this.bkH;
  }

  public void setTitle(String paramString) {
    if (paramString.length() > 32) {
      paramString = paramString.substring(0, 32);
    }
    this.hh = paramString;
  }

  public void aP(String paramString) {
    if (paramString.length() > 127) {
      paramString = paramString.substring(0, 127);
    }
    this.aGr = paramString;
  }

  public void aI(long paramLong) {
    this.bkK = paramLong;
  }

  public void setType(byte paramByte) {
    this.bkM = paramByte;
  }

  public void n(byte paramByte) {
    this.bkN = paramByte;
  }

  public void ag(boolean paramBoolean) {
    this.bkL = paramBoolean;
  }

  public boolean EO() {
    return this.bkL;
  }

  public void ah(boolean paramBoolean) {
    this.bkL = paramBoolean;
  }

  public cYq EP() {
    return this.bkI;
  }

  public dxL EQ() {
    return this.bkI;
  }

  public cYq ER() {
    return this.bkJ;
  }

  public dxL ES() {
    return this.bkJ;
  }

  public String getTitle() {
    return this.hh;
  }

  public String getDescription() {
    return this.aGr;
  }

  public long sN() {
    return this.bkK;
  }

  public byte getType() {
    return this.bkM;
  }

  public byte ET() {
    return this.bkN;
  }

  public byte EU() {
    return this.bkO;
  }

  public void l(byte paramByte) {
    this.bkO = paramByte;
  }

  public byte EV() {
    return this.bkQ;
  }

  public void m(byte paramByte) {
    this.bkQ = paramByte;
  }

  public void a(long paramLong, String paramString)
  {
    this.bkP.put(paramLong, paramString);
  }

  public String aJ(long paramLong) {
    return (String)this.bkP.remove(paramLong);
  }

  public aoL EW() {
    return this.bkP;
  }

  public void b(long paramLong, String paramString) {
    this.bkR.put(paramLong, paramString);
  }

  public String aK(long paramLong) {
    return (String)this.bkR.remove(paramLong);
  }

  public aoL EX() {
    return this.bkR;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof vL)) {
      return false;
    }

    vL localvL = (vL)paramObject;

    if (this.bkI != null) {
      if (this.bkI.getDay() != localvL.bkI.getDay()) {
        return false;
      }
      if (this.bkI.getMonth() != this.bkI.getMonth()) {
        return false;
      }
      if (this.bkI.getYear() != localvL.bkI.getYear()) {
        return false;
      }
    }
    if (this.bkK != localvL.bkK) {
      return false;
    }
    if (this.bkM != localvL.bkM) {
      return false;
    }
    if (this.bkN != localvL.bkN) {
      return false;
    }
    if (this.hh != null ? !this.hh.toLowerCase().equals(localvL.hh.toLowerCase()) : localvL.hh != null) {
      return false;
    }

    return true;
  }

  public int hashCode()
  {
    return (int)(this.bkH ^ this.bkH >>> 32);
  }

  public int EY()
  {
    int i = 31 * asd.dm(this.bkI.rP());
    i = 31 * i + (this.hh != null ? this.hh.hashCode() : 0);
    i = 31 * i + (int)(this.bkK ^ this.bkK >>> 32);
    i = 31 * i + this.bkM;
    i = 31 * i + this.bkN;
    return i;
  }

  public String toString()
  {
    return "WakfuCalendarEvent{" + "\n" + "m_uid=" + this.bkH + ", " + "m_startDate=" + this.bkI + ", " + "m_endDate=" + this.bkJ + ", " + "m_title=\"" + this.hh + "\", " + "m_desc=\"" + this.aGr + "\"\n" + "m_ownerId=" + this.bkK + ", " + "m_type=" + this.bkM + "\n" + "m_evolution=" + this.bkN + "\n" + "m_participants=" + c(this.bkP) + ", " + "m_registered=" + c(this.bkR) + "\n" + '}';
  }

  private String c(aoL paramaoL)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{");
    for (cHu localcHu = paramaoL.aBa(); localcHu.hasNext(); ) {
      localcHu.fl();
      String str = (String)localcHu.value();
      long l = localcHu.bic();
      localStringBuilder.append("(").append(l).append(",").append(str).append(")").append(";");
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  public boolean g(dxL paramdxL)
  {
    return (this.bkI.getYear() <= paramdxL.getYear()) && (this.bkI.getMonth() < paramdxL.getMonth());
  }

  public vL ai(boolean paramBoolean)
  {
    vL localvL;
    if (paramBoolean)
      localvL = EL();
    else {
      localvL = new vL();
    }
    localvL.hh = this.hh;
    localvL.aGr = this.aGr;
    localvL.bkI = this.bkI;
    localvL.bkJ = this.bkJ;
    localvL.bkO = this.bkO;
    localvL.bkQ = this.bkQ;
    localvL.bkK = this.bkK;
    localvL.bkP = this.bkP.aAZ();
    localvL.bkR = this.bkR.aAZ();
    localvL.bkM = this.bkM;
    localvL.bkN = this.bkN;
    localvL.bkH = this.bkH;
    return localvL;
  }
}