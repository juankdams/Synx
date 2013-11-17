import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Logger;

public final class cZl
  implements dor
{
  private static final Logger K = Logger.getLogger(cZl.class);
  private final dBY hMI;
  private final dfy krO;
  private int aw;
  private boolean bur;
  private long RY;

  public cZl(dBY paramdBY)
  {
    this.hMI = paramdBY;
    this.krO = new dfy(ctG.idQ, ar.bW, paramdBY.lKr, true);
  }

  public boolean au(gA paramgA)
  {
    return this.krO.l(paramgA);
  }

  public boolean av(gA paramgA) {
    try {
      return (au(paramgA)) && (this.krO.c(paramgA));
    } catch (amq localamq) {
      K.error("[GUILD_STORAGE] Impossible d'ajouter un item à l'inventaire alors qu'on à pourtant testé le canAdd", localamq);
    }return false;
  }

  public boolean f(gA paramgA, byte paramByte)
  {
    return this.krO.a(paramgA, (short)paramByte);
  }

  public boolean g(gA paramgA, byte paramByte) {
    try {
      return (f(paramgA, paramByte)) && (this.krO.b(paramgA, (short)paramByte));
    } catch (amq localamq) {
      K.error("[GUILD_STORAGE] Impossible d'ajouter un item à l'inventaire alors qu'on à pourtant testé le canAdd", localamq);
    }return false;
  }

  public boolean aw(gA paramgA)
  {
    return this.krO.m(paramgA);
  }

  public boolean K(gA paramgA) {
    return (aw(paramgA)) && (this.krO.d(paramgA));
  }

  public boolean n(long paramLong, short paramShort) {
    return this.krO.n(paramLong, paramShort);
  }

  public boolean o(long paramLong, short paramShort) {
    return (n(paramLong, paramShort)) && (this.krO.c(paramLong, (short)-paramShort));
  }

  public gA bI(long paramLong)
  {
    return (gA)this.krO.ci(paramLong);
  }

  public gA ag(byte paramByte) {
    return (gA)this.krO.dB((short)paramByte);
  }

  public int size() {
    return this.krO.size();
  }

  public short cFy() {
    return this.krO.cFy();
  }

  public byte iU(long paramLong) {
    return (byte)this.krO.il(paramLong);
  }

  public Iterator iterator() {
    return this.krO.jb(false);
  }

  public Iterator cFz() {
    return this.krO.jb(true);
  }

  public void d(bbk parambbk) {
    this.krO.d(parambbk);
  }

  public void c(bbk parambbk) {
    this.krO.c(parambbk);
  }

  public boolean isEnabled() {
    return this.bur;
  }

  public long gv() {
    return this.RY;
  }

  public void b(dya paramdya)
  {
    paramdya.id = this.aw;
    paramdya.enabled = this.bur;
    for (Iterator localIterator = iterator(); localIterator.hasNext(); ) {
      gA localgA = (gA)localIterator.next();
      XI localXI = new XI();
      localXI.cIh = ((short)iU(localgA.oj()));
      localgA.a(localXI.cpq);
      paramdya.bED.add(localXI);
    }
    if (this.RY >= 0L) {
      paramdya.bEE = new chB();
      paramdya.bEE.hFP = this.RY;
    } else {
      paramdya.bEE = null;
    }
  }

  public void c(dya paramdya) {
    this.aw = paramdya.id;
    this.bur = paramdya.enabled;

    this.krO.cleanup();
    ctG localctG = (ctG)this.krO.ajw();
    int i = 0; for (int j = paramdya.bED.size(); i < j; i++) {
      XI localXI = (XI)paramdya.bED.get(i);
      try
      {
        this.krO.b(localctG.c(localXI.cpq), localXI.cIh);
      } catch (amq localamq) {
        K.error("[GUILD_STORAGE] Problème de récupération d'un item de compartiment", localamq);
      }
    }

    this.RY = (paramdya.bEE == null ? -1L : paramdya.bEE.hFP);
  }

  public dBY cMg() {
    return this.hMI;
  }

  public String toString()
  {
    return "GuildStorageCompartment{m_inventory=" + this.krO + '}';
  }
}