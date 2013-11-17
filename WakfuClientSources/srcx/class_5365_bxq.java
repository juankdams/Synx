import com.ankamagames.wakfu.client.console.command.xulor.property.ListCommand;

public class bxq
  implements dGy
{
  public bxq(ListCommand paramListCommand, StringBuilder paramStringBuilder)
  {
  }

  public boolean e(bbo parambbo)
  {
    this.dpz.append('\n').append(" - ").append(parambbo.getName());
    if ((parambbo.getValue() instanceof dBv)) {
      this.dpz.append(" (F)");
    }
    return true;
  }
}