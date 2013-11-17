public enum Xo
{
  private final byte hV;

  private Xo(int arg3)
  {
    int j;
    this.hV = bCO.gn(j);
  }

  public String getName() {
    return bU.fH().getString("guild.storage.type." + this.hV);
  }

  public String fJ() {
    return ay.bd().a("guildStorageTypeIconsPath", "defaultIconPath", new Object[] { Byte.valueOf(this.hV) });
  }

  public String ajp() {
    return bU.fH().getString("guild.storage.unlock.shortDescription." + this.hV);
  }

  public String ajq() {
    return bU.fH().getString("guild.storage.unlock.longDescription." + this.hV);
  }
}