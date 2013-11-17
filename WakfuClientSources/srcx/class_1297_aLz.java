import com.ankamagames.wakfu.client.binaryStorage.BagsBinaryData;
import com.ankamagames.wakfu.client.binaryStorage.ItemTypeBinaryData;

public class aLz
  implements asq
{
  private static final aLz epY = new aLz();

  public static aLz bdd() {
    return epY;
  }

  public void a(dnq paramdnq)
  {
    cze.cwb().a(new ItemTypeBinaryData(), new dDy(this));

    cze.cwb().a(new BagsBinaryData(), new dDz(this));

    X.aw().aQo();
    X.aw().aQp();

    paramdnq.c(this);
  }

  public String getName()
  {
    return bU.fH().getString("contentLoader.item");
  }
}