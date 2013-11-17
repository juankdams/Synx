import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bZH extends cEd
  implements bXd, eo
{
  public static final int hqk = 2;
  private static final Logger K = Logger.getLogger(bZH.class);
  private static final boolean hql = false;
  private static final boolean hqm = false;
  private final cpy hqn = new cpy();

  public bZH() {
    super(gA.class, dyU.dcQ(), cVY.cKs(), (short)azO.aLH(), false, false);
  }

  public void a(azO paramazO, boolean paramBoolean) {
    if (paramBoolean)
      this.hqn.dP(paramazO.hV);
    else
      this.hqn.dQ(paramazO.hV);
  }

  public boolean dC(byte paramByte) {
    return this.hqn.contains(paramByte);
  }

  public void cleanup()
  {
    super.cleanup();
    this.hqn.clear();
  }

  public final boolean a(dQW paramdQW) {
    if (this.cHW) {
      K.warn("Impossible d'ajouter l'information de quantité à un RawInventoryItemInventory qui n'est pas prévu pour");
    }

    paramdQW.clear();
    for (bnP localbnP = this.ixA.cTd(); localbnP.hasNext(); ) {
      localbnP.fl();
      int i = localbnP.Lb();
      try {
        gA localgA = ((gA[])this.ixz)[i];
        if (localgA.og()) {
          localObject = new aTg();
          ((aTg)localObject).cIh = il(localgA.oj());
          localgA.a(((aTg)localObject).cpq);
          paramdQW.aZC.add(localObject);
        }
      } catch (ClassCastException localClassCastException) {
        Object localObject = ((gA[])this.ixz)[i];
        K.error("erreur de cast : content is " + localObject.getClass().getName(), localClassCastException);
      } catch (Exception localException) {
        K.error("Exception levée lors de la récupération de l'item à la position " + i + " de l'équipement " + this, localException);
      }
    }

    return true;
  }

  public boolean b(dQW paramdQW) {
    try {
      ajy();
      if (this.cHW) {
        K.warn("Impossible de désérialiser la quantité d'objets dans un inventaire, cette information n'est pas présente dans le format RawInventory");
      }

      boolean bool = true;
      for (aTg localaTg : paramdQW.aZC) {
        try {
          gA localgA = (gA)this.cHT.o(localaTg.cpq);
          if (localgA != null) {
            if (!b(localgA, localaTg.cIh))
              bool = false;
          } else {
            bool = false;
            K.error("Erreur lors de la dé-serialisation d'un ArrayInventory : item null");
          }
        } catch (dI localdI) {
          K.error(bBd.g(localdI));
          bool = false;
        } catch (dcF localdcF) {
          K.error(bBd.g(localdcF));
          bool = false;
        } catch (bQT localbQT) {
          K.error(bBd.g(localbQT));
          bool = false;
        } catch (Exception localException) {
          K.error(bBd.g(localException));
          bool = false;
        }
      }

      return bool;
    } catch (ClassCastException localClassCastException) {
      K.error("Impossible d'initialiser un " + getClass() + " à partir d'un " + paramdQW.getClass() + " : RawArrayInventory attendu", localClassCastException);
    }return false;
  }

  public String ov()
  {
    return "equipment";
  }

  public String toString()
  {
    return "ItemEquipment{m_lockedPositions=" + this.hqn.size() + '}';
  }
}