
package com.github.znightlord.mymodtemplate;

/* TODO import logger class*/

public class MyMod extends JavaPlugin
{
  // Uncomment for logger
  // private final static HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();
  
  private static BlockSpawnerPlugin INSTANCE; 

  public static BlockSpawnerPlugin get() {
    return INSTANCE;
  }

  public BlockSpawnerPlugin (@Nonnull JavaPluginInit init) { 
    super(init);
    INSTANCE = this;
  }
  
  @Override
  protected void setup() {
    // Register Here
    
  }
}